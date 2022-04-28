package com.gaara.destiny;

import java.util.HashMap;
import java.util.Map;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName Destiny
 *    @Date 2022/4/28 9:34 上午
 *    @Description TODO         *
 ********************************/
public class Destiny {

    // https://m.zhouyi.cc/zhouyi/yijing64/


    /**
     * 获取八卦
     * @param index
     * @return
     */
    public static String getAdmin8ForIndex(int index){
        return getAdmin8().get(index);
    }

    /**
     * 根据id计算64卦
     * @param index
     * @return
     */
    public static String getAdmin64ForIndex(int index){
        return getAdmin64().get(index);
    }

    /**
     * 获取页码
     * @param index
     * @return
     */
    public static String getPageForIndex64(int index){
        return getPage().get(index);
    }

    /**
     * 获取描述
     * @param index
     * @return
     */
    public static String getContextForIndex(int index){
        return getContextOf64().get(index);
    }
    /**
     * 先下后上，先下1-8后上1-8 求得64挂index
     * @return
     */
    public static Integer getIndexForDownAndUp(String downAndUp){
        return get64Index().get(downAndUp);
    }

    /*************************************************************************************/
    /**
     *  八卦
     * @return
     */
    public static Map<Integer,String> getAdmin8(){
        Map<Integer,String> map = new HashMap<>(8);
        map.put(1,"乾");
        map.put(2,"兑");
        map.put(3,"离");
        map.put(4,"震");
        map.put(5,"巽");
        map.put(6,"坎");
        map.put(7,"艮");
        map.put(8,"坤");
        return map;
    }

    /**
     * 64卦
     * @return
     */
    public static Map<Integer,String> getAdmin64(){
        Map<Integer,String> map = new HashMap<>(64);
        map.put(1,"乾");
        map.put(2,"坤");
        map.put(3,"屯");
        map.put(4,"蒙");
        map.put(5,"需");
        map.put(6,"讼");
        map.put(7,"师");
        map.put(8,"比");
        map.put(9,"小畜");
        map.put(10,"履");
        map.put(11,"泰");
        map.put(12,"否");
        map.put(13,"同人");
        map.put(14,"大有");
        map.put(15,"谦");
        map.put(16,"豫");
        map.put(17,"随");
        map.put(18,"蛊");
        map.put(19,"临");
        map.put(20,"观");
        map.put(21,"噬嗑");
        map.put(22,"贲");
        map.put(23,"剥");
        map.put(24,"复");
        map.put(25,"无妄");
        map.put(26,"大畜");
        map.put(27,"颐");
        map.put(28,"大过");
        map.put(29,"习坎");
        map.put(30,"离");
        map.put(31,"咸");
        map.put(32,"恒");
        map.put(33,"遁");
        map.put(34,"大壮");
        map.put(35,"晋");
        map.put(36,"明夷");
        map.put(37,"家人");
        map.put(38,"睽");
        map.put(39,"蹇");
        map.put(40,"解");
        map.put(41,"损");
        map.put(42,"益");
        map.put(43,"夬");
        map.put(44,"姤");
        map.put(45,"萃");
        map.put(46,"升");
        map.put(47,"困");
        map.put(48,"井");
        map.put(49,"革");
        map.put(50,"鼎");
        map.put(51,"震");
        map.put(52,"艮");
        map.put(53,"渐");
        map.put(54,"归妹");
        map.put(55,"丰");
        map.put(56,"旅");
        map.put(57,"巽");
        map.put(58,"兑");
        map.put(59,"涣");
        map.put(60,"节");
        map.put(61,"中孚");
        map.put(62,"小过");
        map.put(63,"既济");
        map.put(64,"未济");
        return map;
    }

    /**
     * 64卦对应书的页码
     * @return
     */
    public static Map<Integer,String> getPage(){
        Map<Integer,String> map = new HashMap<>(64);
        map.put(1,"1");
        map.put(2,"20");
        map.put(3,"34");
        map.put(4,"41");
        map.put(5,"49");
        map.put(6,"56");
        map.put(7,"63");
        map.put(8,"70");
        map.put(9,"77");
        map.put(10,"84");
        map.put(11,"91");
        map.put(12,"98");
        map.put(13,"104");
        map.put(14,"111");
        map.put(15,"118");
        map.put(16,"125");
        map.put(17,"132");
        map.put(18,"139");
        map.put(19,"146");
        map.put(20,"153");
        map.put(21,"160");
        map.put(22,"167");
        map.put(23,"174");
        map.put(24,"180");
        map.put(25,"187");
        map.put(26,"194");
        map.put(27,"201");
        map.put(28,"208");
        map.put(29,"215");
        map.put(30,"222");
        map.put(31,"229");
        map.put(32,"236");
        map.put(33,"243");
        map.put(34,"250");
        map.put(35,"257");
        map.put(36,"264");
        map.put(37,"272");
        map.put(38,"279");
        map.put(39,"287");
        map.put(40,"294");
        map.put(41,"301");
        map.put(42,"308");
        map.put(43,"316");
        map.put(44,"323");
        map.put(45,"330");
        map.put(46,"337");
        map.put(47,"344");
        map.put(48,"352");
        map.put(49,"359");
        map.put(50,"367");
        map.put(51,"375");
        map.put(52,"383");
        map.put(53,"390");
        map.put(54,"398");
        map.put(55,"406");
        map.put(56,"414");
        map.put(57,"421");
        map.put(58,"428");
        map.put(59,"435");
        map.put(60,"442");
        map.put(61,"449");
        map.put(62,"456");
        map.put(63,"463");
        map.put(64,"470");
        return map;
    }

    /**
     * 根据64卦id获取卦相描述信息
     * @return
     */
    public static Map<Integer,String> getContextOf64(){
        Map<Integer,String> map = new HashMap<>(64);
        map.put(1,"乾为天-刚健中正");
        map.put(2,"坤为地-柔顺伸展");
        map.put(3,"水雷屯-起始维艰");
        map.put(4,"山水蒙-启蒙奋发");
        map.put(5,"水天需-守正待机");
        map.put(6,"天水讼-慎争戒讼");
        map.put(7,"地水师-行险而顺");
        map.put(8,"水地比-诚信团结");
        map.put(9,"风天小畜-蓄养待进");
        map.put(10,"天泽履-脚踏实地");
        map.put(11,"地天泰-应时而变");
        map.put(12,"天地否-不交不通");
        map.put(13,"天火同人-上下和同");
        map.put(14,"火天大有-顺天依时");
        map.put(15,"地山谦-内高外低");
        map.put(16,"雷地豫-顺时依势");
        map.put(17,"泽雷随-随时变通");
        map.put(18,"山风蛊-振疲起衰");
        map.put(19,"地泽临-教民保民");
        map.put(20,"风地观-观下瞻上");
        map.put(21,"火雷噬嗑-刚柔相济");
        map.put(22,"山火贲-饰外扬质");
        map.put(23,"山地剥-顺势而止");
        map.put(24,"地雷复-寓动于顺");
        map.put(25,"天雷无妄-无妄而得");
        map.put(26,"山天大畜-止而不止");
        map.put(27,"山雷颐-纯正以养");
        map.put(28,"泽风大过-非常行动");
        map.put(29,"坎为水-行险用险");
        map.put(30,"离为火-附和依托");
        map.put(31,"泽山咸-相互感应");
        map.put(32,"雷风恒-恒心有成");
        map.put(33,"天山遁-遁世救世");
        map.put(34,"雷天大壮-壮勿妄动");
        map.put(35,"火地晋-求进发展");
        map.put(36,"地火明夷-晦而转明");
        map.put(37,"风火家人-诚威治业");
        map.put(38,"火泽睽-异中求同");
        map.put(39,"水山蹇-险阻在前");
        map.put(40,"雷水解-柔道致治");
        map.put(41,"山泽损-损益制衡");
        map.put(42,"风雷益-损上益下");
        map.put(43,"泽天夬-决而能和");
        map.put(44,"天风姤-天下有风");
        map.put(45,"泽地萃-荟萃聚集");
        map.put(46,"地风升-柔顺谦虚");
        map.put(47,"泽水困-困境求通");
        map.put(48,"水风井-求贤若渴");
        map.put(49,"泽火革-顺天应人");
        map.put(50,"火风鼎-稳重图变");
        map.put(51,"震为雷-临危不乱");
        map.put(52,"艮为山-动静适时");
        map.put(53,"风山渐-渐进蓄德");
        map.put(54,"雷泽归妹-立家兴业");
        map.put(55,"雷火丰-日中则斜");
        map.put(56,"火山旅-依义顺时");
        map.put(57,"巽为风-谦逊受益");
        map.put(58,"兑为泽-刚内柔外");
        map.put(59,"风水涣-拯救涣散");
        map.put(60,"水泽节-万物有节");
        map.put(61,"风泽中孚-诚信立身");
        map.put(62,"雷山小过-行动有度");
        map.put(63,"水火既济-盛极将衰");
        map.put(64,"火水未济-事业未竟");
        return map;
    }

    /**
     * 先下后上，先下1-8后上1-8 求得64挂index
     * @return
     */
    public static Map<String,Integer> get64Index(){
        Map<String,Integer>map = new HashMap<>(64);
        map.put("1+1",1);
        map.put("8+8",2);
        map.put("4+6",3);
        map.put("6+7",4);
        map.put("1+6",5);
        map.put("6+1",6);
        map.put("6+8",7);
        map.put("8+6",8);
        map.put("1+5",9);
        map.put("2+1",10);
        map.put("1+8",11);
        map.put("8+1",12);
        map.put("3+1",13);
        map.put("1+3",14);
        map.put("7+8",15);
        map.put("8+4",16);
        map.put("4+2",17);
        map.put("5+7",18);
        map.put("2+8",19);
        map.put("8+5",20);
        map.put("4+3",21);
        map.put("3+7",22);
        map.put("8+7",23);
        map.put("4+8",24);
        map.put("4+1",25);
        map.put("1+7",26);
        map.put("4+7",27);
        map.put("5+2",28);
        map.put("6+6",29);
        map.put("3+3",30);
        map.put("7+2",31);
        map.put("5+4",32);
        map.put("7+1",33);
        map.put("1+4",34);
        map.put("8+3",35);
        map.put("3+8",36);
        map.put("3+5",37);
        map.put("2+3",38);
        map.put("7+6",39);
        map.put("6+4",40);
        map.put("2+7",41);
        map.put("4+5",42);
        map.put("1+2",43);
        map.put("5+1",44);
        map.put("8+2",45);
        map.put("5+8",46);
        map.put("6+2",47);
        map.put("5+6",48);
        map.put("3+2",49);
        map.put("5+3",50);
        map.put("4+4",51);
        map.put("7+7",52);
        map.put("7+5",53);
        map.put("2+4",54);
        map.put("3+4",55);
        map.put("7+3",56);
        map.put("5+5",57);
        map.put("2+2",58);
        map.put("6+5",59);
        map.put("2+6",60);
        map.put("2+5",61);
        map.put("7+4",62);
        map.put("3+6",63);
        map.put("6+3",64);
        return map;
    }


}
