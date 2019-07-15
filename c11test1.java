import java.util.ArrayList;

// 第11章练习1
// @author 晴和羽织
class Gerbil1{
    private final int gerbilNumber;
    Gerbil1(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public String toString(){
        return "gerbil" + gerbilNumber;
    }
    public void hop(){
        System.out.println(this + " is hopping");
    }
}
public class c11test1 {
    public static void main(String args[]){
        ArrayList<Gerbil1> gerbil1s = new ArrayList<Gerbil1>();
        for(int i = 0; i < 10; i++){
            gerbil1s.add(new Gerbil1(i));
        }
        for(int i = 0; i < 10; i++){
            gerbil1s.get(i).hop();
        }
    }
}
