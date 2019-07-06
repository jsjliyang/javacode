// 第10章练习19
// @author 晴和羽织
public class c10test19 {
    class Inner1 {
        class Inner2{
            void f(){}
        }
        Inner2 makeInner2(){
            return new Inner2();
        }
    }
    Inner1 makeInner1(){
        return new Inner1();
    }
    static class Nested1{
        static class Nested2{
            void f(){}
        }
        void f(){}
    }

    public static void main(String[] args) {
        new c10test19.Nested1().f();
        new c10test19.Nested1.Nested2().f();
        c10test19 q1 = new c10test19();
        c10test19.Inner1 q2 = q1.makeInner1();
        c10test19.Inner1.Inner2 q3 = q2.makeInner2();
        q3.f();
    }
}
/* 生成的class文件：
 * c10test19.class
 * c10test19$Nested1.class
 * c10test19$Nested1$Nested2.class
 * c10test19$Inner1.class
 * c10test19$Inner1$Inner2.class
 */
