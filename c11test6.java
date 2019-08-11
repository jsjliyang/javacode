import java.util.*;
import static lyprint.Print.*;
// 第11章 ListFeatures
// @author 晴和羽织
public class c11test6 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<String> strs = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G"));
        printl("1: " + strs);
        //Hamster h = new Hamster();
        strs.add("H");
        printl("2: " + strs);
        printl("3: " + strs.contains("H"));
        strs.remove("H");
        String p = strs.get(2);
        printl("4: " + p + " " + strs.indexOf(p));
        String cymic = "I";
        printl("5: " + strs.indexOf(cymic));
        printl("6: " + strs.remove(cymic));

        printl("7: " + strs.remove(p));
        printl("8: " + strs);
        strs.add(3, "0");
        printl("9: " + strs);
        List<String> sub = strs.subList(1,4);
        printl("subList: " + sub);
        printl("10: " + strs.containsAll(sub));
        Collections.sort(sub);
        printl("sorted subList: " + sub);
        printl("11: " + strs.containsAll(sub));
        Collections.shuffle(sub,rand);
        printl("shuffled subList: " + sub);
        printl("12: " + strs.containsAll(sub));
        List<String> copy = new ArrayList<String>(strs);
        sub = Arrays.asList(strs.get(1),strs.get(4));
        printl("sub: " + sub);
        copy.retainAll(sub);
        printl("13: " + copy);
        copy = new ArrayList<String>(strs);
        copy.remove(2);
        printl("14: " + copy);
        copy.removeAll(sub);
        printl("15: " + copy);
        copy.set(1,"J");
        printl("16: " + copy);
        copy.addAll(2,sub);
        printl("17: " + copy);
        printl("18: " + strs.isEmpty());
        strs.clear();
        printl("19: " + strs);
        printl("20: " + strs.isEmpty());
        strs.addAll(Arrays.asList("A","B","C","D"));
        printl("21: " + strs);
        Object[] o = strs.toArray();
        printl("22: " + o[3]);
        String[] pa = strs.toArray(new String[0]);
        printl("23: " + pa[3]);
    }
}
