// 第5章练习19 & 20
// @author 晴和羽织
public class c5test19_20 {
    static void printStrings(String... strs) {
        for(String s : strs)
            System.out.println(s);
    }
    public static void main(String[] args){
        printStrings("I","am","Iron","man1");
        printStrings(new String[] {"I","am","Iron","man2"});
        Dyn.main(new String[] {"I","am","Iron","man3"});
    }
}
class Dyn {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");
    }
}

