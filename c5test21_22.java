// 第5章练习21 & 22
// @author 晴和羽织
enum RaraDegree{
    SP, SSR, SR, R, N, GUA
}
public class c5test21_22 {
    static void describe(RaraDegree r){
        System.out.print(r + "'s describe: ");
        switch(r){
            case SP: System.out.println("special");
                     break;
            case SSR: System.out.println("super super rare");
                      break;
            case SR: System.out.println("super rare");
                     break;
            case R: System.out.println("rare");
                    break;
            case N: System.out.println("normal");
                    break;
            case GUA: System.out.println("gua gua gua~~");
                      break;
        }
    }
    public static void  main(String[] args){
        for(RaraDegree s : RaraDegree.values()){
            System.out.println(s + ",ordinal " + s.ordinal());
            describe(s);
        }
    }
}