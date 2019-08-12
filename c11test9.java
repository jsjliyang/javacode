// 第11章 练习9
// @author 晴和羽织
import sun.rmi.transport.ObjectTable;

import java.util.*;
import java.util.function.Consumer;

import static lyprint.Print.*;
class Sequence3 {
    private Object[] items;
    private int next;

    public Sequence3(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceIterator implements Iterator<Object> {
        private int i;
        @Override
        public boolean hasNext() {
            return i < items.length;
        }
        @Override
        public Object next() {
            if(hasNext()){
                return items[i++];
            }
            throw new NoSuchElementException();
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<Object> iterator(){
        return new SequenceIterator();
    }
}
public class c11test9 {
    public static void main(String[] args) {
        Sequence3 sequence = new Sequence3(10);
        for(int i = 0; i < 10; i++){
            sequence.add(Integer.toString(i));
        }
        for(Iterator<Object> it = sequence.iterator(); it.hasNext();) {
            print(it.next() + " ");
        }
    }
}
