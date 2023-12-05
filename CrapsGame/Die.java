public class Die {
    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }

    public int getNumDots() {
        return 0;
    }
}
