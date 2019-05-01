// 第6章练习8
// @author 晴和羽织
import lyprint.*;
public class c6test8 {
    public static void main(String args[]) {
        Connection c = ConnectionManager.getConnection();
        while(c != null) {
            System.out.println(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}
