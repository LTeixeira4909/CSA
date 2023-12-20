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
    }
}
