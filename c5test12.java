// 第5章练习12 finalize()用于对象终结条件的验证
// @author 晴和羽织
class Tank {
    static int counter;
    int id = counter++;
    boolean full;
    public Tank() {
        System.out.println("Tank " + id + " created");
        full = true;
    }
    public void empty() {
        full = false;
    }
    protected void finalize() {
        if (full)
            System.out.println("Error: tank " + id + " must be empty at cleanup");
        else
            System.out.println("Tank " + id + " cleaned up OK");
    }
}
public class c5test12 {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        System.gc(); // System.gc()用于强制进行终结动作
        System.runFinalization(); //强制调用已经失去引用的对象的finalize方法
    }
}
