// 第11章 适配器方法
// @author 晴和羽织
import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c) {
        super(c);
    }
    public Iterable<T> reversed() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
public class c11_AdapterMethod {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("just do it !".split(" ")));
        for(int i = 0; i < 10; i++) {
            System.out.print("[" + i + "]: ");
            if(0 == i % 2) {
                for(String s : ral.reversed()) {
                    System.out.print(s + " ");
                }
            }else {
                for(String s : ral) {
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }
    }
}
