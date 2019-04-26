// 计算两个字符串的汉明距离
// 计算二进制数的汉明距离
// @author 晴和羽织
public class Hamming {
    public int Distance(String str1, String str2){
        int distance;
        if(str1.length() != str2.length()){
            distance = -1;
        } else{
            distance = 0;
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    distance ++;
                }
            }
        }
        return distance;
    }
    public int Weight(int n){
        int i;
        for(i = 0; n > 0; i++){
            n &= (n - 1); //&是按位操作符与
        }
        return i;
    }
    public static void main(String[] args){
        String str1 = "0100100110011000100111000110100110010";
        String str2 = "1000101100110110100110011001001101010";
        Hamming h = new Hamming();
        int distance = h.Distance(str1,str2);
        int weight = h.Weight(255);
        System.out.println("distance: " + distance);
        System.out.println("weight: " + weight);
    }
}
