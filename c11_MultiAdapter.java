// 第11章 适配器方法
// @author 晴和羽织
import java.util.*;

public class c11_MultiAdapter extends IterableClass{
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;
                    public boolean hasNext() {
                        return current > -1;
                    }
                    public String next() {
                        return words[current--];
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }
    public Iterable<String> randomized_1() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> shuffled = Arrays.asList(words);
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }
    public static void main(String[] args) {
        c11_MultiAdapter ma = new c11_MultiAdapter();
        System.out.print("【ma】: ");
        for(String s : ma) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("[ma.reversed]: ");
        for(String s : ma.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("[ma.randomized]: ");
        for(String s : ma.randomized()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("【ma】: ");
        for(String s : ma) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("[ma.randomized_1]: ");
        for(String s : ma.randomized_1()) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("【ma】: ");
        for(String s : ma) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
