
public class MathEX {   
    public static void main(String [] args){
         int y= swap(483);
        System.out.println(y);
        int x= swap (357);
        System.out.println(x);
        int w = swap(692);
        System.out.println(w);
       
    }
    public static int swap(int z){
        int result = z/100*100+z%10*10+z%100/10;
        return result;
    }


    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int a = (depHour*60+depMin)- (curHour*60+curMin);
        int b = a/60;
        int c = a%60;
        System.out.println( b+" hours "+ c+ " minutes");


}