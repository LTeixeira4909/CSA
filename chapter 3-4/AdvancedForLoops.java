public class AdvancedForLoops {

    public void eights() {
        for (int j = 8; j >= 2; j -= 2) {
            for (int i = 1; i <= j; i++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        AdvancedForLoops a = new AdvancedForLoops();
        a.eights();

    }
}
