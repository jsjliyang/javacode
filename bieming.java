// 练习2：别名机制
class onmyoji {
    float SSR;
}
// @author 晴和羽织
public class bieming {
    public static void main(String[] args) {
        onmyoji q1 = new onmyoji();
        onmyoji q2 = new onmyoji();
        onmyoji q3 = new onmyoji();
        onmyoji q4 = new onmyoji();
        q1.SSR = 22;
        q2.SSR = 30;
        q3.SSR = 22;
        q4.SSR = 30;
        System.out.println("<-------------q1&&q2（对象“赋值”）------------->");
        System.out.println("1: q1.SSR: " + q1.SSR + ",  q2.SSR:" + q2.SSR);
        q1 = q2;
        System.out.println("2: q1.SSR: " + q1.SSR + ",  q2.SSR:" + q2.SSR);
        q2.SSR = 88;
        System.out.println("3: q1.SSR: " + q1.SSR + ",  q2.SSR:" + q2.SSR);
        System.out.println("<-------------q3&&q4（两个对象独立）------------->");
        System.out.println("1: q3.SSR: " + q3.SSR + ",  q4.SSR:" + q4.SSR);
        q3.SSR = q4.SSR;
        System.out.println("2: q3.SSR: " + q3.SSR + ",  q4.SSR:" + q4.SSR);
        q4.SSR = 88;
        System.out.println("3: q3.SSR: " + q3.SSR + ",  q4.SSR:" + q4.SSR);
    }
}
