// 第11章 练习7
// @author 晴和羽织
import java.util.*;
import static lyprint.Print.*;
class IDClass {
    private static int counter;
    private int count = counter++;
    public String toString() {
        return "IDClass" + count;
    }
}
public class c11test7 {
    public static void main(String[] args) {
        IDClass[] idc = new IDClass[10];
        for(int i = 0; i < idc.length; i++){
            idc[i] = new IDClass();
        }
        List<IDClass> lst = new ArrayList<IDClass>(Arrays.asList(idc));
        printl("lst = " + lst);
        //System.out.println("lst = " + lst);
        List<IDClass> subset = lst.subList(lst.size()/4, lst.size()/2);
        printl("subSet = " + subset);
        subset.clear();
        printl("lst = " + lst);
    }
}
