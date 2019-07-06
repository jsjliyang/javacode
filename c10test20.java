// 第10章练习19
// @author 晴和羽织
interface With_Nested{
    class Nested{
        int i;
        public Nested(int i) {this.i = i;}
        void f() {
            System.out.println("This is a Interface's Nested.f, and i = " + i);
        }
    }
}
class S implements With_Nested{
    Nested g(){
        return new Nested(15);
    }
}
public class c10test20 {
    public static void main(String[] args) {
        S w = new S();
        w.g().f();
        With_Nested.Nested q = new With_Nested.Nested(13);
        q.f();
    }
}
