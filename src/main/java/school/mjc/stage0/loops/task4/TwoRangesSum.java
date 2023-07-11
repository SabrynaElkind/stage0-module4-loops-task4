package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
         int skippedSum = 0;
         int countedSum = 0;
         int sum = 0;


            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bigger then the last");

            } else if (lastInRow < 0) {
                System.out.println("last number in row is negative");

            } else {


                for (int k = 1; k <= lastInRow; k++) {
                    if (k % numberToSkip == 0) {
                        skippedSum += k;
                    } else {
                        countedSum += k;
                    }
                }


                System.out.println("skipped sum is " + skippedSum);
                System.out.println("counted sum is " + countedSum);


            }}
    }

