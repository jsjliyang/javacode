// foreach和label的使用
// @晴和羽织
import java.util.*;

public class foreach_label {
    public static void main(String[] args) {
        System .out.println("<-----foreach----->》");
        Random r = new Random();
        int p[] = new int[10];
        for (int i = 0; i < 10; i++) {
            p[i] = r.nextInt();
        }
        for (int s : p) {
            System.out.println(s);
        }
        System.out.println("<-----label----->");
        int n = 0;
        outofloop:
        while(true){
            System.out.println("now we are out of loop1");
            while(true) {
                n++;
                System.out.println("n : " + n);
                if(n == 1) {
                    System.out.println("continue");
                    continue ;
                }
                if(n == 3)
                {
                    System.out.println("continue outofloop");
                    continue outofloop;
                }
                if(n == 5) {
                    System.out.println("break");
                    break;
                }
                if(n == 7) {
                    System.out.println("break outofloop");
                    break outofloop;
                }
            }
        }
    }
}
