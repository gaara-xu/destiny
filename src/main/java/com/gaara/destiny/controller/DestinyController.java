package com.gaara.destiny.controller;

import com.alibaba.fastjson.JSONObject;
import com.gaara.destiny.Destiny;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName DestinyController
 *    @Date 2022/4/28 9:54 上午
 *    @Description TODO         *
 ********************************/
@RestController
public class DestinyController {

    @GetMapping("/destiny/{num1}/{num2}/{num3}")
    public static JSONObject getDestiny(@PathVariable("num1")Integer num1, @PathVariable("num2")Integer num2, @PathVariable("num3")Integer num3){
        JSONObject jsonObject = new JSONObject();
        // num1 = 下卦
        int down = num1 % 8 ;
        // num2 = 上卦
        int up = num2 % 8  ;
        // num3 = 爻
        int xx = num3 % 6 ;
        // 为0 则为第8卦 或第6爻
        if (down == 0){
            down = 8;
        }
        if (up == 0){
            up = 8;
        }
        if (xx == 0){
            xx = 6;
        }
        Integer indexOf64 = Destiny.getIndexForDownAndUp(down+"+"+up);
        String 卦 = Destiny.getAdmin64ForIndex(indexOf64)+"卦";
        String 卦相 = Destiny.getContextForIndex(indexOf64);
        String 卦辞 = Destiny.getAdmin64Info(indexOf64);
        String page = Destiny.getPageForIndex64(indexOf64);
        jsonObject.put("卦",卦);
        jsonObject.put("卦相",卦相);
        jsonObject.put("卦辞",卦辞);
        jsonObject.put("爻","第"+xx+"爻");
        jsonObject.put("《易经》页码","第"+page+"页。");
        jsonObject.put("爻词",Destiny.getXXInfoByindexAndXX(indexOf64,xx));
        return jsonObject;
//        return Destiny.getXXInfoByindexAndXX(indexOf64,xx).toString();
    }

    /**
     * @Author Gaara
     * 查询卦相和爻辞
     * @param num1
     * @param num2
     * @return
     */
    @GetMapping("/destiny/{num1}/{num2}")
    public static JSONObject getGuaAndX(@PathVariable("num1")Integer num1, @PathVariable("num2")Integer num2){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("卦",Destiny.getAdmin64ForIndex(num1));
        jsonObject.put("卦相",Destiny.getContextForIndex(num1));
        jsonObject.put("卦辞",Destiny.getAdmin64Info(num1));
        jsonObject.put("爻","第"+num2+"爻");
        jsonObject.put("爻词",Destiny.getXXInfoByindexAndXX(num1,num2));
        return jsonObject;
    }
}
