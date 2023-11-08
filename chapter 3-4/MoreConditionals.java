public class MoreConditionals {

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0)
                return true;
            else if (year % 400 == 0)
                return true;
        }
        return false;
    }

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1 > year2)
            return true;
        else if (year1 == year2) {
            if (month1 > month2)
                return true;
            else if (month1 == month2) {
                if (day1 > day2)
                    return true;
            }
        }
        return false;
    }

    public int findBestFit(int size1, int size2, int space) {
        if (size1 + size2 <= space)
            return 3;
        else if (size1 <= space)
            return 1;
        else if (size2 <= space)
            return 2;
        else
            return 0;
    }

    public boolean makeBenches(int small, int big, int goal) {
        if (small + big * 5 < goal)
            return false;
        else if (goal % 5 > small)
            return false;
        else {
            if (big * 5 > goal)
                return true;
            else if (big * 5 == goal)
                return true;
            else {
                if (small >= goal - big * 5)
                    return true;
                else
                    return false;
            }
        }

    }

    public static void main(String[] args) {
        MoreConditionals mc = new MoreConditionals();

        // is leap year
        System.out.println("isLeapYear");
        System.out.println("2000 " + mc.isLeapYear(2000));
        System.out.println("2004 " + mc.isLeapYear(2004));
        System.out.println("2003 " + mc.isLeapYear(2003));
        System.out.println("2100 " + mc.isLeapYear(2100));

        System.out.println();

        // is sooner
        System.out.println("isSooner");
        System.out.println("1/2/2010 is sooner than 1/2/2011 " + mc.isSooner(1, 2, 2010, 1, 2, 2011));
        System.out.println("2/1/2011 is sooner than 2/2/2010 " + mc.isSooner(2, 1, 2011, 2, 2, 2010));
        System.out.println("1/2/2011 is sooner than 2/2/2010 " + mc.isSooner(1, 2, 2011, 2, 2, 2010));
        System.out.println("1/5/2010 is sooner than 3/2/2010 " + mc.isSooner(1, 5, 2010, 3, 2, 2010));
        System.out.println("3/2/2010 is sooner than 1/2/2010 " + mc.isSooner(3, 2, 2010, 1, 2, 2010));
        System.out.println("1/3/2010 is sooner than 1/2/2010 " + mc.isSooner(1, 3, 2010, 1, 2, 2010));
        System.out.println("5/2/2010 is sooner than 1/3/2011 " + mc.isSooner(5, 2, 2010, 1, 3, 2011));
        System.out.println("1/2/2010 is sooner than 1/2/2010 " + mc.isSooner(1, 2, 2010, 1, 2, 2010));
        System.out.println("4/8/2010 is sooner than 1/2/2010 " + mc.isSooner(4, 8, 2010, 1, 2, 2010));

        System.out.println();

        // Best Fit
        System.out.println("Best Fit");
        System.out.println("Find Best fit 6 2 3 is " + mc.findBestFit(6, 2, 3));
        System.out.println("Find Best fit 6 4 3 is " + mc.findBestFit(6, 4, 3));
        System.out.println("Find Best fit 6 3 4 is " + mc.findBestFit(6, 3, 4));
        System.out.println("Find Best fit 1 2 3 is " + mc.findBestFit(1, 2, 3));
        System.out.println("Find Best fit 4 6 3 is " + mc.findBestFit(4, 6, 3));
        System.out.println("Find Best fit 4 3 6 is " + mc.findBestFit(4, 3, 6));
        System.out.println("Find Best fit 4 3 3 is " + mc.findBestFit(4, 3, 3));
        System.out.println("Find Best fit 4 4 3 is " + mc.findBestFit(4, 4, 3));

        System.out.println();

        // Make Bench
        System.out.println("Make benches");
        System.out.println("Make benches 3 1 8 is " + mc.makeBenches(3, 1, 8));
        System.out.println("Make benches 3 1 9 is " + mc.makeBenches(3, 1, 9));
        System.out.println("Make benches 11 1 15 is " + mc.makeBenches(11, 1, 15));
        System.out.println("Make benches 4 2 15 is " + mc.makeBenches(4, 2, 15));
        System.out.println("Make benches 20 0 20 is " + mc.makeBenches(20, 0, 20));
        System.out.println("Make benches 3 4 20 is " + mc.makeBenches(3, 4, 20));
        System.out.println("Make benches 0 6 30 is " + mc.makeBenches(0, 6, 30));
        System.out.println("Make benches 0 5 30 is " + mc.makeBenches(0, 5, 30));
        System.out.println("Make benches 2 6 23 is " + mc.makeBenches(2, 6, 23));
        System.out.println("Make benches 3 2 23 is " + mc.makeBenches(3, 2, 23));

    }
}
