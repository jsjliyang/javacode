// 第11章练习4
// @author 晴和羽织
import java.util.*;

interface Generator<T> {
    T next();
}
class MovieNameGenerator implements Generator<String> {
    String[] characters = {
            "CAP", "HULK", "IRON MAN", "SPIDER", "THOR", "ANT MAN",
            "Avengers1", "Avengers2", "Avengers3", "Avengers4"
    };
    int next;
    public String next() {
        String r = characters[next];
        next = (next + 1) % characters.length;
        return r;
    }
}
public class c11test4 {
    private static final MovieNameGenerator mng =
            new MovieNameGenerator();
    static String[] fill(String[] array) {
        for(int i = 0; i < array.length; i++)
            array[i] = mng.next();
        return array;
    }
    static Collection<String>
    fill(Collection<String> collection) {
        for(int i = 0; i < 5; i++)
            collection.add(mng.next());
        return collection;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}
