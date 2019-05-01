// @author 晴和羽织
package lyprint;

public class Debug {
    public static void debug(String msg) {
        System.out.println("Message: " + msg);
    }
    protected static void bug(){
        Print.printl("调用了protected的方法bug");
    }
}
