import java.util.*;
import java.util.Map.Entry;
// 第11章 练习17
// @author 晴和羽织
public class c11test17 {
    public static void main(String[] args) {
        Map<String,Gerbil1> map = new HashMap<String,Gerbil1>();
        map.put("cimu",new Gerbil1(1));
        map.put("lycimu",new Gerbil1(2));
        map.put("datiangou",new Gerbil1(3));
        map.put("sydatiangou",new Gerbil1(4));
        map.put("huangchuan",new Gerbil1(5));
        map.put("xlhuangchuan",new Gerbil1(6));
        Iterator<Entry<String, Gerbil1>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, Gerbil1> entry = it.next();
            System.out.print(entry.getKey() + ": ");
            entry.getValue().hop();
        }
    }
}