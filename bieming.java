// 练习2：别名机制
// 练习3：方法调用时的别名机制
class onmyoji {
    float SSR;
}
// @author 晴和羽织
public class bieming {
    static void f(onmyoji y){
        y.SSR = 66; //与C和C++有所区别，实际改变的是f()之外的对象。
    }
    public static void main(String[] args) {
        System.out.println("<-------------赋值别名机制------------->");
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

        System.out.println("<-------------方法调用时别名机制------------->");
        q1.SSR = 22;
        System.out.println("1: q1.SSR: " + q1.SSR);
        f(q1);
        System.out.println("2: q1.SSR: " + q1.SSR);
    }
}


