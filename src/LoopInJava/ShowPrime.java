package LoopInJava;


public class ShowPrime {
    public static void main(String[] args) {
        for (int number = 2; number <= 20; number++) {
            boolean check = false;
            if (number < 2) {
                System.out.println(number + " không phải là số nguyên tố");
            } else {
                int i = 2;
                check = true;
                while (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

            if (check) {
                System.out.println(number);
            }
        }
    }
}
