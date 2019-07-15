import java.lang.reflect.Array;

// 第11章练习3
// @author 晴和羽织
import java.util.*;

class UnlimitedSequence{
    private final List<Object> items = new ArrayList<Object>();
    public void add(Object x) {items.add(x);}
    private class SequenceSelector implements Selector{
        private int i;
        public boolean end() {return i == items.size();}
        public Object current() {return items.get(i);}
        public void next(){if(i < items.size()) i++;}
    }
    public Selector selector(){
        return new SequenceSelector();
    }
}
public class c11test3 {
    public static void main(String[] args) {
        UnlimitedSequence sequence = new UnlimitedSequence();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
