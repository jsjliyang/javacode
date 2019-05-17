// 第9章 Apply
// @author 晴和羽织
package interfaces;
import static lyprint.Print.*;

public class Apply{
  public static void process(Processor p, Object s) {
    printl("Using Processor " + p.name());
    printl(p.process(s));
  }
}
