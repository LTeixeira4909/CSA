public class Conditionals {
    public boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile)
            return true;
        else
            return false;
    }

    public boolean negPos(int a, int b, boolean negative) {
        if (negative == true) {
            if (a < 0 && b < 0)
                return true;
            else
                return false;
        } else {
            if (a < 0 && b > 0 || a > 0 && b < 0)
                return true;
            else
                return false;
        }
    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true)
            return false;
        else if (isMorning == true && isMom == false)
            return false;
        else
            return true;
    }

    public int setAlarm(int day, boolean vacation) {
        if (vacation == true) {
            if (day == 0 || day == 6)
                return 0;
            else
                return 10;
        } else {
            if (day == 0 || day == 6)
                return 10;
            else
                return 7;
        }
    }

    public boolean onesDigitSame(int a, int b, int c) {
        int a1 = a % 10;
        int b1 = b % 10;
        int c1 = c % 10;
        if (a1 == b1 || a1 == c1 || b1 == c1)
            return true;
        else
            return false;
    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21)
            return 0;
        else if (a > 21)
            return b;
        else if (b > 21)
            return a;
        else if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Conditionals c = new Conditionals();
        System.out.println(c.chimpTrouble(true, true));
        System.out.println(c.chimpTrouble(false, false));
        System.out.println(c.chimpTrouble(true, false));
        System.out.println(c.chimpTrouble(false, true));

        System.out.println();

        System.out.println(c.negPos(1, -1, false));
        System.out.println(c.negPos(-1, 1, false));
        System.out.println(c.negPos(1, 1, false));
        System.out.println(c.negPos(-1, -1, false));
        System.out.println(c.negPos(-4, -5, true));
        System.out.println(c.negPos(-4, 5, false));
        System.out.println(c.negPos(4, 5, false));
        System.out.println(c.negPos(4, -5, false));

        System.out.println();

        System.out.println(c.pickUpPhone(false, false, true));
        System.out.println(c.pickUpPhone(true, true, true));
        System.out.println(c.pickUpPhone(true, true, false));
        System.out.println(c.pickUpPhone(false, true, false));
        System.out.println(c.pickUpPhone(true, false, false));
        System.out.println(c.pickUpPhone(false, false, false));

        System.out.println();

        System.out.println(c.setAlarm(1, false));
        System.out.println(c.setAlarm(5, false));
        System.out.println(c.setAlarm(0, false));
        System.out.println(c.setAlarm(2, true));
        System.out.println(c.setAlarm(4, true));
        System.out.println(c.setAlarm(6, true));

        System.out.println();

        System.out.println(c.onesDigitSame(23, 19, 13));
        System.out.println(c.onesDigitSame(23, 19, 12));
        System.out.println(c.onesDigitSame(23, 19, 3));
        System.out.println(c.onesDigitSame(423, 13, 3));
        System.out.println(c.onesDigitSame(23, 29, 25));

        System.out.println();

        System.out.println(c.blackjack(19, 21));
        System.out.println(c.blackjack(21, 19));
        System.out.println(c.blackjack(19, 22));
        System.out.println(c.blackjack(8, 8));
        System.out.println(c.blackjack(25, 24));
        System.out.println(c.blackjack(17, 9));
        System.out.println(c.blackjack(12, 18));     
    }
}
