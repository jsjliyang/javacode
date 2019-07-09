import jdk.nashorn.internal.codegen.CompilerConstants;

// 第10章闭包与回调
// @author 晴和羽织
interface Incrementable{
    void increment();
}
//实现接口的简单方法
class Call1 implements Incrementable{
    private int i = 0;
    public void increment(){
        i++;
        System.out.println("Call1.increment: " + i);
    }
}

class MyIcrement{
    public void increment(){System.out.println("a other operation");}
    static void f(MyIcrement mi){mi.increment();}
}
//使用内部类
class Call2 extends MyIcrement{
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        System.out.println("Call2.increment: " + i);
    }
    private class Closure implements Incrementable{
        public void increment(){
            Call2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cb_head){
        callbackReference = cb_head;
    }
    void go(){
        callbackReference.increment();
    }
}

public class c10_closure {
    public static void main(String[] args) {
        Call1 c1 = new Call1();
        Call2 c2 = new Call2();
        MyIcrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
