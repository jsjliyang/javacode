// 第12章 练习1&2&3
// @author 晴和羽织
import static lyprint.Print.printl;

public class c12test1_2_3 {
    public static void main(String[] args) {
        printl("<-----------12章 练习1----------->");
        try {
            throw new Exception("An exception in main");
        } catch(Exception e) {
            printl("e.getMessage() = " + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            printl("finally used.");
        }

        printl("<-----------12章 练习2----------->");
        String s = null;
        try {
            s.toCharArray();
        } catch (Exception e) {
            printl("Caught exception: " + e);
            e.printStackTrace(System.out);
        }

        printl("<-----------12章 练习3----------->");
        int[] a = new int[10];
        try {
            a[10] = 666;
        } catch (ArrayIndexOutOfBoundsException e) {
            printl("Caught exception: " + e);
            e.printStackTrace(System.out);
        }
    }
}
