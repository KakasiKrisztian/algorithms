package org.fasttrackit;

public class LogicalOp {


    public void countUpwards(int r) {


        for (int i = r; i <= 100; i++) {
            System.out.println(i);

        }

    }

    public void countDownwards(int r) {

        for (int i = r; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void countFromTo(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= y; i--) {
                System.out.println(i);
            }
        }


    }

    public void countFromSmallerToBigger(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }

        }
    }

    public void countOnlyPairNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void countOnlyNonPairNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void countSumOfNumbersFromTo(int r) {
        int sum = 0;
        for (int i = r; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void averageOfTheCountedSum(int r) {
        double sum = 0;
        double x = 100 - r;
        for (int i = r; i <= 100; i++) {
            sum = sum + i;
        }
        double average = sum / (x + 1);
        System.out.println(average);
    }

    public void printingStars() {
        String i = " ";
        for (i = "*******"; i.length() > 0; i = i.substring(0, i.length() - 1)) {
            if (i.length() % 4 == 0) {
                System.out.println();
            }
            System.out.println(i);

        }
    }
}

