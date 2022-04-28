package com.gaara.destiny.controller;

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
    public static String getDestiny(@PathVariable("num1")Integer num1,@PathVariable("num2")Integer num2,@PathVariable("num3")Integer num3){
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
        String page = Destiny.getPageForIndex64(indexOf64);
        return 卦+":"+卦相+"。 第"+xx+"爻" +"。  在易经第"+page+"页。";
    }

}
