// 第11章 练习27
// @author 晴和羽织
import java.util.*;
class Command {
    private final String cmd;
    Command(String cmd) {
        this.cmd = cmd;
    }
    public void operation() {
        System.out.println(cmd);
    }
}
class Producer {
    public static void produce(Queue<Command> q) {
        q.offer(new Command("load"));
        q.offer(new Command("delete"));
        q.offer(new Command("save"));
        q.offer(new Command("exit"));
    }
}
class Consumer {
    public static void consume(Queue<Command> q) {
        while(q.peek() != null)
            q.remove().operation();
    }
}
public class c11test27 {
    public static void main(String[] args) {
        Queue<Command> cmds = new LinkedList<Command>();
        Producer.produce(cmds);
        Consumer.consume(cmds);
    }
}
