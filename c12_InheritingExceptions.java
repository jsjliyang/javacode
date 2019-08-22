// 第12章 创建自定义异常
// @author 晴和羽织
class SimpleException extends Exception {}

public class c12_InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f().");
        throw new SimpleException();
    }
    public static void main(String[] args) {
        c12_InheritingExceptions theOne = new c12_InheritingExceptions();
        try {
            theOne.f();
        } catch (SimpleException e) {
            System.out.println("Caught " + e + " !");
        }
    }
}
