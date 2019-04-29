// 测试Print代替System.out.println等
// @author 晴和羽织
import static lyprint.Print.*;
import static lyprint.Debug.*;
public class printtest {
    public static void main(String[] args){
        printl("Start!");
        printl(100);
        printl(0x99);
        print(3.14);
        printl("  前面的不换行");
        debug("666");
    }
}