public class Factorial {
    public int calcFactorial(int a) {
        int factorial = 1;
        int i = 1;
        while (i <= a) {
            factorial *= i;
            i++;
        }
        return factorial;

    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        for (int i = 1; i <= 10; i++) {
            System.out.println("The factorial of " + i + " is: " + f.calcFactorial(i));
        }
        System.out.println(f.calcFactorial(4));
        System.out.println(f.calcFactorial(8));

    }
}