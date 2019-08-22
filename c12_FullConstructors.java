// 第12章 为异常类定义一个接受字符串参数的构造器
// @author 晴和羽织
class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) {
        super(msg);
    }
}
public class c12_FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f().");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g().");
        throw new MyException();
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
