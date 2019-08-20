// 第11章 EnvironmentVariables
// @author 晴和羽织
import java.util.*;
public class c11_EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
