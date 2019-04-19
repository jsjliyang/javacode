// 第4章练习4
// @author 晴和羽织
import java.util.*;

public class c4test4 {
    public static void main(String[] args){
        int max = 200;
        for(int i = 2; i < max; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++)
                if (i % j ==0) {
                    flag = false;
                    break;
                }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
