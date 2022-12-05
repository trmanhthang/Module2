package LoopInJava;

public class ShowPrime2 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            if (i < 2) {
                flag = false;
            } else if (i == 2) {
                flag = true;
            } else if (i % 2 ==0) {
                flag = false;
            } else {
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
    }
}
