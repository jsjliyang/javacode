// 第12章 练习1&2&3
// @author 晴和羽织
import static lyprint.Print.printl;
class ResumerException extends Exception {}
class Resumer {
    static int count = 5;
    static void f() throws ResumerException {
        if(--count > 0) {
            throw new ResumerException();
        }
    }
}
public class c12test5 {
    public static void main(String[] args) {
        while(true) {
            try {
                Resumer.f();
            } catch(ResumerException e) {
                printl("Caught " + e);
                continue;
            }
            printl("Got through...");
            break;
        }
        printl("Successful execution");
    }
}