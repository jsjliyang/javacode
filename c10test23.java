// 第10章练习23
// @author 晴和羽织
interface U{
    void f();
    void g();
    void h();
}
class A{
    public U getU(){
        return new U(){
            public void f() {System.out.println("A.f");}
            public void g() {System.out.println("A.g");}
            public void h() {System.out.println("A.h");}
        };
    }
}
class B{
    U[] ua;
    public B(int size){
        ua = new U[size];
    }
    public boolean add(U elem){
        for(int i = 0; i < ua.length; i++){
            if(ua[i] == null){
                ua[i] = elem;
                return true;
            }
        }
        return false;
    }
    public boolean setNull(int i){
        if(i < 0 || i >= ua.length)
            return false;
        ua[i] = null;
        return true;
    }
    public void callMethods(){
        for(int i = 0; i < ua.length; i++){
            if(ua[i] != null){
                ua[i].f();
                ua[i].g();
                ua[i].h();
            }
        }
    }
}
public class c10test23 {
    public static void main(String[] args) {
        A[] aa = {new A(), new A(), new A()};
        B b = new B(3);
        for(int i = 0; i < aa.length; i++)
            b.add(aa[i].getU());
        b.callMethods();
        System.out.println("<-=============================->");
        b.setNull(0);
        b.callMethods();
    }
}
