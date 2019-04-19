// 第4章练习2 & 3
// @author 晴和羽织
import java.util.*;

public class c4test2_3 {
    static Random r = new Random(47);
    public static void main(String[] args) {
        int a = r.nextInt();
        int b;
        //for(int i = 0; i < 25; i++){
        while(true) {
            //int a = r.nextInt();
            b = r.nextInt();
            System.out.println("a = " + a + "   b = " + b);
            if (a < b)
                System.out.println("a < b");
            else if (a > b)
                System.out.println("a > b");
            else
                System.out.println("a = b");
            a = b;
        }
    }
}
