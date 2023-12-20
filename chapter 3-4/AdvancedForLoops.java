public class AdvancedForLoops {
    public static void eights() {
        for (int i = 8; i > 0; i -= 2) {
            for (int k = 0; k < 8 - i; k += 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void alternate(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; i % 2 != 0 && j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i; i % 2 == 0 && k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void isosceles(int num) {
        for (int i = 1; i <= num; i++) {
            for (int c = 0; c < num - i; c++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i - 1; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void upSideDown(int num1, int num2) {
        for (int i = 0; i <= num1 - num2; i++) {
            for (int c = 0; c < i; c++) {
                System.out.print(" ");
            }
            for (int j = num1 - i; j >= num2; j--) {
                System.out.print(j);
            }
            for (int k = num2 + 1; k <= num1 - i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdvancedForLoops a = new AdvancedForLoops();
        System.out.println();
        System.out.println("eights");
        System.out.println();
        a.eights();

        System.out.println();

        System.out.println("alternate");
        System.out.println();
        a.alternate(5);
        System.out.println();
        a.alternate(6);

        System.out.println();

        System.out.println("isosceles");
        System.out.println();
        a.isosceles(5);

        System.out.println();

        System.out.println("upsidedown");
        System.out.println();
        a.upSideDown(9, 5);
        System.out.println();
        a.upSideDown(8, 6);
    }
}
// output
// eights

// 88888888
// 666666
// 4444
// 22

// alternate

// 1
// 21
// 123
// 4321
// 12345

// 1
// 21
// 123
// 4321
// 12345
// 654321

// isosceles

// 1
// 121
// 12321
// 1234321
// 123454321

// upsidedown

// 987656789
// 8765678
// 76567
// 656
// 5

// 87678
// 767
// 6