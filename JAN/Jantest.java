package JAN;
import com.sun.jna.*;
public class Jantest {
    public interface TestDll1 extends Library {
        TestDll1 INSTANCE = (TestDll1)Native.loadLibrary("D:\\Desktop\\javacode\\javacoding\\JAN\\DLL_ly.dll",TestDll1.class);
        public int say(int a, int b);

    }
    public static void main(String[] args) {
        int i = TestDll1.INSTANCE.say(12,13);
        System.out.println("Java代码 " + i);
    }
}
