// 第11章 练习14
// @author 晴和羽织
import java.util.*;
import static lyprint.Print.*;
public class c11test14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> it = list.listIterator();
        for(int i = 0; i < 11; i++) {
            it.add(i);
            if(i % 2 == 0 && i != 0)
                it.previous();
            printl("[" +  i + "]: " + list);
        }
        //printl(list);
    }
}
