// 练习4：计算速度
// 这里使用随机数生成时间
import java.util.*;

// @author 晴和羽织
public class speed {
    public static void main(String[] args) {
        Random rand = new Random(); //以当前时间为种子，生成随机数
        float time, distance, s;
        int i;
        distance = 10;
        for (i = 0; i < 10; i++) {
            time = rand.nextFloat() + 1; //加1为了防止时间为0，nextFloat返回的是0到1之间的随机float类型数字
            s = distance / time;
            System.out.println("time: " + time + "    speed:" + s);
        }
    }
}
