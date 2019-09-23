package org.fasttrackit;

public class LogicalOp {


    public void countUpwards(int r) {


        for (int i = r; i <= 100; i++) {
            System.out.println(i);

        }

    }

    public void countDownwards(int r) {

        for (int i = r; i >= -100; i-- ){
            System.out.println(i);
        }
    }

    public void countFromTo(int x, int y){
        for (int i = x; i == y; i++){
            if (x > y){
                System.out.println(i);
                i--;
            }else {
                System.out.println(i);
                i++;
            }
        }
    }
}
