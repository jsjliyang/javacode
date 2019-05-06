// 第7章练习13
// @author 晴和羽织
class ThreeOverloads{
    public void f(int i){
        System.out.println("f(int i)    " + i);
    }
    public void f(char c){
        System.out.println("f(char c)   " + c);
    }
    public void f(double d){
        System.out.println("f(double d) " + d);
    }
}
class OneMore extends ThreeOverloads{
    public void f(String s){
        System.out.println("f(String s) " + s);
    }
}

public class c7test13 {
    public static void main(String[] args){
        OneMore p = new OneMore();
        p.f(1);
        p.f('d');
        p.f(1.1);
        p.f("hello world");
    }
}
