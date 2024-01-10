public class StringsExercises {
    public static String scroll(String s){
        String s1 = s.substring(0,1);
        String s2 = s.substring(1);
        String s3 = s2 + s1;
        return s3;
       
}


public static void main(String[] args) {
System.out.println(scroll("Hello World"));
System.out.println(scroll("happy"));
System.out.println(scroll("h"));

}
}