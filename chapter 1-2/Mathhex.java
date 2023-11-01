public class Mathhex {
    public static void main(String[] Strings){
        System.out.println(swap(345));
    }

    public static int swap(int initial){
        int ones=initial%10;
        int tens=initial%100/10;
        int hundreds=initial%1000/100;
        int answer= hundreds*100+ones*10+tens*1;
        return answer;
        
    }

}
