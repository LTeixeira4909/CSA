public class Factorial {
    public static long calcFactorial(long a) {
        long factorial = 1;
        long i = 1;
        while (i <= a) {
            factorial *= i;
            i++;
        }
        return factorial;

    }

    public static long calcE() {
        long e = 1;
        long i = 1;
        while (i <= 20) {
            e += 1 / calcFactorial(i);
            i++;
        }
        return e;
    }

    public static double calcEX(int num) {
        double currentE = 1;
        double prevE = 0;
        Factorial f = new Factorial();

        for (int i = 1; currentE - prevE > 0.001; i++) {
            prevE = currentE;
            currentE += (Math.pow(num, i) / f.calcFactorial(i));
        }

        return currentE;
    }

    // public static void main(String[] args) {
    // for (int i = 1; i <= 20; i++) {
    // System.out.println(calcFactorial(i));
    // }

    // System.out.printf("\ne = %2.3f \n \n", calcE());

    // for (int i = 1; i <= 5; i++) {
    // System.out.printf("e to the power of %d = %2.3f \n", i, calcEX(i));
    // }

}

// }