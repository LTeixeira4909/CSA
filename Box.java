public class Box {
    private double length;
    private double width;
    private double height;
    private String color;
    private boolean hasALid;

    // constructor - methods that creates/initializes an 
    // instance of a class
    public Box(double l, double w, double h, String c, boolean lid){
        length = l;
        width = w;
        height = h;
        color = c;
        hasALid= lid;
    }
    // overloaded constructor
    public Box(double l, double w, double h){
        length = l;
        width = w;
        height = h;
        color = "white";
        hasALid= false;
    }
    // default constructor
    public Box(){
        length =1.0;
        width = 1.0;
        height = 1.0;
        color = "white";
        hasALid= true;
    }
    //accessor methods get/set
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        if(h>0){
            height=h;
        }
    }

    public String toString(){
        String s= "A box with dimensions " +length +" "+ width + " "+ height;
        s+= "\nColor is " + color+ " has a lid? " + hasALid;
        return s;
    }

 
        
    
    public static void main(String [] args){
        Box b1 = new Box(5.6, 2.5, 3.7,"blue",true);
       
        Box b2 = new Box(3.7,2.8,9.1);

        Box b3 = new Box ();
        b3.setHeight(4.5);
        double h3 = b3.getHeight();
        System.out.println(h3);
        double h1= b1.getHeight();
        System.out.println(h1);
        double h2= b2.getHeight();
        System.out.println(h2);

        System.out.println("The volume of b1 is " + b1.getVolume());
        System.out.println(b1);
         System.out.println(b2);
     
    }
}





