public class NestedForLoops {

    public int addEvens(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (n % 2 == 0)
                sum += i;
        }

        return sum;
    }

    public void main(String[] args) {
        NestedForLoops nfl = new NestedForLoops();
        System.out.println(addEvens(10));
    }
}
