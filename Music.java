// 第9章
// @author 晴和羽织
import static lyprint.Print.*;
interface Instrument1 {
    int VALUE = 5; // static & final
    void play(Note n); // Automatically public
    void adjust();
}

class Wind1 implements Instrument1 {
    public void play(Note n) {
        printl(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Percussion1 implements Instrument1 {
    public void play(Note n) {
        printl(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Stringed1 implements Instrument1 {
    public void play(Note n) {
        printl(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + ".adjust()"); }
}

class Brass1 extends Wind1 {
    public String toString() { return "Brass"; }
}

class Woodwind1 extends Wind1 {
    public String toString() { return "Woodwind"; }
}
public class Music {
    static void tune(Instrument1 i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument1[] e) {
        for(Instrument1 i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Instrument1[] orchestra = {
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new Woodwind1()
        };
        tuneAll(orchestra);
    }
}
