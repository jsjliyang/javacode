// 第12章 练习1&2&3
// @author 晴和羽织
import java.io.*;
import java.util.logging.Logger;
import static lyprint.Print.printl;

public class c12test7 {
    private static Logger logger =
            Logger.getLogger("c12test7");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        try {
            a[10] = 666;
        } catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
            printl("Caught exception: " + e);
            e.printStackTrace(System.out);
        }
    }
}
