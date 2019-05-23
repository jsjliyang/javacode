// 第10章练习4
// @author 晴和羽织
class Sequence2 {
    private Object[] items;
    private int next = 0;
    public Sequence2(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.length;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if (i < items.length) i++;
        }
        public Sequence2 sequence() {
            return Sequence2.this;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public boolean check() {
        return this == ((SequenceSelector)selector()).sequence();
    }
}
class outer{
    class inner{
        inner(){
            System.out.println("Here is Inner class!");
        }
    }
}
public class c10test4 {
    public static void main(String[] args){
        Sequence2 s = new Sequence2(100);
        System.out.println(s.check());
        outer o = new outer();
        outer.inner i = o.new inner();
    }
}
