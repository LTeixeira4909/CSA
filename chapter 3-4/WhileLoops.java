public class WhileLoops {
    public int addOddNumbers(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        return sum;
    }

    public int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop) {
        int years = 0;
        while (startpop < endpop) {
            startpop = startpop * 0.0113 + startpop;
            years++;
        }
        return years;
    }

    public void printSum(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }
    }

    public boolean isPerfectSquare(int n) {
        int i = 1;
        while (i * i <= n) {
            if (i * i == n) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        WhileLoops wl = new WhileLoops();
        System.out.println();
        System.out.println("addOddNumbers");

        System.out.println(wl.addOddNumbers(1));
        System.out.println(wl.addOddNumbers(5));
        System.out.println(wl.addOddNumbers(3));

        System.out.println();
        System.out.println("sumDigits");

        System.out.println(wl.sumDigits(123));
        System.out.println(wl.sumDigits(1234));
        System.out.println(wl.sumDigits(12345));

        System.out.println();
        System.out.println("howManyYears");

        System.out.println(wl.howManyYears(111.2, 120));
        System.out.println(wl.howManyYears(111.2, 150));

        System.out.println();
        System.out.println("printSum");

        wl.printSum(6);
        System.out.println();
        wl.printSum(8);
        System.out.println();
        wl.printSum(5);

        System.out.println();
        System.out.println("isPerfectSquare");

        System.out.println(wl.isPerfectSquare(9));
        System.out.println(wl.isPerfectSquare(25));
        System.out.println(wl.isPerfectSquare(19));
        System.out.println(wl.isPerfectSquare(43));
    }
}

// output
// WhileLoops

// addOddNumbers
// 1
// 9
// 4

// sumDigits
// 6
// 10
// 15

// howManyYears
// 7
// 27

// printSum
// i = 1, sum = 1
// i = 2, sum = 3
// i = 3, sum = 6
// i = 4, sum = 10
// i = 5, sum = 15
// i = 6, sum = 21

// i = 1, sum = 1
// i = 2, sum = 3
// i = 3, sum = 6
// i = 4, sum = 10
// i = 5, sum = 15
// i = 6, sum = 21
// i = 7, sum = 28
// i = 8, sum = 36

// i = 1, sum = 1
// i = 2, sum = 3
// i = 3, sum = 6
// i = 4, sum = 10
// i = 5, sum = 15

// isPerfectSquare
// true
// true
// false
// false