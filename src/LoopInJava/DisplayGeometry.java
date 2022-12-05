package LoopInJava;

public class DisplayGeometry {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String result = "* * * * * * *";
            System.out.println(result);

        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                String result = "*";
                System.out.print(result);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 6; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                String result = "*";
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
