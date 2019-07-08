// 第10章练习22
// @author 晴和羽织
class Sequence_ly{
    private Object[] objects;
    private int next;
    public Sequence_ly(int size){
        objects = new Object[size];
    }
    public void add(Object x){
        if(next < objects.length)
            objects[next++] = x;
    }
    private class ReverseSelector implements Selector{
        int i = objects.length - 1;
        public boolean end() {
            return i < 0;
        }
        public Object current(){
            return objects[i];
        }
        public void next() {
            if(i >= 0)  i--;
        }
    }
    private class SequenceSelector implements Selector{
        private int i;
        public boolean end(){
            return i == objects.length;
        }
        public Object current(){
            return objects[i];
        }
        public void next() {
            if(i < objects.length)  i++;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public Selector reverseSelector() {
        return new ReverseSelector();
    }
}
public class c10test22 {
    public static void main(String[] args) {
        Sequence_ly sequence = new Sequence_ly(33);
        for(int i = 0; i < 33; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.reverseSelector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

