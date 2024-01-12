public class StringsExercises {
    public static String scroll(String s){
        String s1 = s.substring(0,1);
        String s2 = s.substring(1);
        String s3 = s2 + s1;
        return s3;
       
}

public static String convertName(String s){
    int space = s.indexOf(" ");
    String first = s.substring(0,space);
    String last = s.substring(space+1);
    String name = last + ", " + first;
    return name;
}

public static String negative(String s){
    String s1 = "";
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '0'){
            s1 += '1';
        }
        else{
            s1 += '0';
        }
    }
    return s1;
}
public static String dateString(String s){
    String month = s.substring(0,2);
    String day = s.substring(3,5);
    String year = s.substring(6);
    String date = day + "-" + month + "-" + year;
    return date;
}

public static String dateString2(String s){
    int slash1 = s.indexOf("/");
    int slash2 = s.indexOf("/", slash1 + 1);
    String month = s.substring(0,slash1);
    String day = s.substring(slash1 + 1, slash2);
    String year = s.substring(slash2 + 1);
    String date = day + "-" + month + "-" + year;
    return date;
}

public static boolean startsWith(String s1, String s2){
    if(s1.indexOf(s2) == 0){
        return true;
    }
    else{
        return false;
    }
}

public static boolean endsWith(String s1, String s2){
    if(s1.indexOf(s2) == s1.length() - s2.length()){
        return true;
    }
    else{
        return false;
    }
}

public static String removeTag(String s1, String s2){
    int start = s1.indexOf("<" + s2 + ">");
    int end = s1.indexOf("</" + s2 + ">");
    if(start == -1 || end == -1){
        return s1;
    }
    else{
        String s3 = s1.substring(0,start);
        String s4 = s1.substring(end + s2.length() + 3);
        return s3 + s4;
    }
}


public static void main(String[] args) {
    System.out.println(scroll("scroll"));
    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));

    System.out.println("convertName");
    System.out.println(convertName(" Reubenstein, Lori Renee "));
    System.out.println(convertName("Biden,Joe"));
    System.out.println(convertName("the Clown, Bozo"));

    System.out.println("negative");
    System.out.println(negative("0010111001"));
    System.out.println(negative("11111111"));

    System.out.println("dateString");
    System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));
    System.out.println("04/20/2014 becomes" + dateString2("04/20/2014"));
    System.out.println("4/20/2014 becomes" + dateString2("4/20/2014"));
    System.out.println("04/2/2014 becomes" + dateString2("04/2/2014"));
    System.out.println("4/2/2014 becomes" + dateString2("4/2/2014"));
    System.out.println("\nstartsWith");

    System.out.println("startsWith");
    System.out.println(startsWith("architecture", "arch"));
    System.out.println(startsWith("architecture", "a"));
    System.out.println(startsWith("arch", "architecture"));
    System.out.println(startsWith("architecture", "rch"));
    System.out.println(startsWith("architecture", "architecture"));     
    
    System.out.println("endsWith");
    System.out.println(endsWith("astronomy", "nomy"));
    System.out.println(endsWith("astronomy", "y"));
    System.out.println(endsWith("astronomy", "nom"));
    System.out.println(endsWith("nomy", "astronomy"));
    System.out.println(endsWith("astronomy", "astronomy"));
    
    System.out.println("removeTag");
    System.out.println(removeTag("<b>Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World</b>", "head"));
    System.out.println(removeTag("Hello World</b>", "b"));
    System.out.println(removeTag("<b>Hello World", "b"));
    System.out.println(removeTag("</img>Hello World<img>", "img"));
    System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
    System.out.println(removeTag("<title>Hello World</title> Happy Birthday",
"title"));
    System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));

    }
}
//scroll
// ello WorldH
// appyh
// h

// convertName
// Lori Renee Reubenstein
// Joe Biden
// Bozo the Clown

// negative
// 1101000110
// 00000000

// dateString
// 04/20/2014 becomes 20-04-2014

// dateString2
// 04/20/2014 becomes 20-04-2014
// 4/20/2014 becomes 20-4-2014
// 04/2/2014 becomes 2-04-2014
// 4/2/2014 becomes 2-4-2014

// startsWith
// true
// true
// false
// false
// true

// endsWith
// true
// true
// false
// false
// true

// removeTag
// Hello World
// <b>Hello World</b>
// Hello World</b>
// <b>Hello World
// </img>Hello World<img>
// Happy Birthday Hello World
// Hello World Happy Birthday
// Happy Hello World Birthday