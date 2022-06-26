package com.gaara.destiny.controller;

import com.gaara.destiny.Destiny;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName PageController
 *    @Date 2022/5/13 9:37 上午
 *    @Description TODO         *
 ********************************/
@Controller
public class PageController {

    @GetMapping("/")
    public String getindex(){
        return "index";
    }

    @PostMapping("/destiny")
    public String getDestiny(ModelMap map,
                             @RequestParam("num1") String num1,
                             @RequestParam("num2") String num2,
                             @RequestParam("num3") String num3){
        try {
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            int n3 = Integer.parseInt(num3);
            // num1 = 下卦
            int down = n1 % 8 ;
            // num2 = 上卦
            int up = n2 % 8  ;
            // num3 = 爻
            int xx = n3 % 6 ;
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
            /*map.put("gua", 卦+" \r\n"+卦相+" \r\n"+卦辞+" \r\n"+"第"+xx+"爻"
                    +Destiny.getXXInfoByindexAndXX(indexOf64,xx)+"在《易经》第"+page+"页。");*/
            map.put("gua",卦);
            map.put("guaxiang",卦相);
            map.put("guaci",卦辞);
            map.put("yao","第"+xx+"爻");
            map.put("yaoci",Destiny.getXXInfoByindexAndXX(indexOf64,xx));

            //map.addAttribute("guaci",卦辞);
            //map.addAttribute("yao",);
            //map.addAttribute("page","第"+page+"页。");
            //map.addAttribute("yaoci",Destiny.getXXInfoByindexAndXX(indexOf64,xx));
        }catch (Exception e){
            map.addAttribute("error","输入错误,需要纯数字，请重新输入");
            return "index";
        }
        return "destiny";
    }
}
