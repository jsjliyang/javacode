// Print代替System.out.println等
// @author 晴和羽织
package lyprint;

import java.io.PrintStream;

public class Print {
    //
    public static void printl(Object obj){
        System.out.println(obj);
    }
    public static void printl(){
        System.out.println();
    }
    public static void print(Object obj){
        System.out.print(obj);
    }
    public static PrintStream printf(String format,Object... args){
        return System.out.printf(format,args);
    }
}