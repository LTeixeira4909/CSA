
public class TwoSpinners {

    int z = 0;

    public int spin(int min, int max) {
        int result = 0;
        result = (int) (Math.random() * (max - min)) + min;
        return result;
    }

    public void playRound() {
        int player = spin(1, 10);
        int computer = spin(1, 10);

        if (player > computer) {
            System.out.println("You Won! " + (player - computer) + " points");
        } else if (player < computer) {
            System.out.println("You Lose! " + (player - computer) + " points");
        } else if (player == computer) {
            if (z < 2) {
                z++;
                playRound();
            } else {
                System.out.println("Tie. 0 points");
            }

        }
    }

    public static void main(String[] args) {
        TwoSpinners ds = new TwoSpinners();
        for (int i = 0; i < 10; i++) {
            ds.playRound();
        }
    }
}

// Output
// You Won! 1 points
// You Won! 8 points
// You Lose! -3 points
// You Lose! -4 points
// You Won! 2 points
// You Lose! -5 points
// You Lose! -4 points
// You Won! 1 points
// You Lose! -1 points
// You Won! 1 points
