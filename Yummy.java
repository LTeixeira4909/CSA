public class Yummy {
    public static void main (String [] args){
        System.out.println("Yummy");
        Chocolate();              //call the choclate method
        iceCream();
        System.out.println("done");
    }
    public static void Chocolate (){
        System.out.print("Chocolate ");
        System.out.println("Cake");
    }
    public static void frenchFries() {
        System.out.println("frnech fries with ketchup");
        Chocolate();
        System.out.println("that was yummy");
    }
    public static void iceCream(){
        System.out.println("ice");
        frenchFries();
        System.out.println("cream");
    }
}
