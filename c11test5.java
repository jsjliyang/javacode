import java.util.*;
import static lyprint.Print.*;
// 第11章 练习5
// @author 晴和羽织
public class c11test5 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        printl("1: " + ints);
        //Hamster h = new Hamster();
        ints.add(9);
        printl("2: " + ints);
        printl("3: " + ints.contains(9));
        ints.remove(Integer.valueOf(9));
        Integer p = ints.get(2);
        printl("4: " + p + " " + ints.indexOf(p));
        Integer cymic = Integer.valueOf(1);
        printl("5: " + ints.indexOf(cymic));
        printl("6: " + ints.remove(cymic));

        printl("7: " + ints.remove(p));
        printl("8: " + ints);
        ints.add(3, 0);
        printl("9: " + ints);
        List<Integer> sub = ints.subList(1,4);
        printl("subList: " + sub);
        printl("10: " + ints.containsAll(sub));
        Collections.sort(sub);
        printl("sorted subList: " + sub);
        printl("11: " + ints.containsAll(sub));
        Collections.shuffle(sub,rand);
        printl("shuffled subList: " + sub);
        printl("12: " + ints.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(ints);
        sub = Arrays.asList(ints.get(1),ints.get(4));
        printl("sub: " + sub);
        copy.retainAll(sub);
        printl("13: " + copy);
        copy = new ArrayList<Integer>(ints);
        copy.remove(2);
        printl("14: " + copy);
        copy.removeAll(sub);
        printl("15: " + copy);
        copy.set(1,8);
        printl("16: " + copy);
        copy.addAll(2,sub);
        printl("17: " + copy);
        printl("18: " + ints.isEmpty());
        ints.clear();
        printl("19: " + ints);
        printl("20: " + ints.isEmpty());
        ints.addAll(Arrays.asList(1,2,3,4));
        printl("21: " + ints);
        Object[] o = ints.toArray();
        printl("22: " + o[3]);
        Integer[] pa = ints.toArray(new Integer[0]);
        printl("23: " + pa[3]);
    }
}
