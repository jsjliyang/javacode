// 第10章练习2
// @author 晴和羽织
class StringHolder {
    private String data;
    StringHolder(String data) { this.data = data; }
    public String toString() { return data; }
}
public class c10test2 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(new StringHolder(Integer.toString(i)));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
