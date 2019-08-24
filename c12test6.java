// 第12章 练习6
// @author 晴和羽织
import java.io.*;
import java.util.logging.Logger;

class LoggingException extends Exception {
    private static Logger logger =
            Logger.getLogger("LoggingException");
    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class c12test6 {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
    }
}