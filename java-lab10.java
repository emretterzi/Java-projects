package emreödev12345;

public class emreödev123456 {

    public static void main(String[] args) {

        int[] dizi = {16, 75, 78, 20, 43, 45};
        int b[] = new int[6];
        int c[] = new int[6];
        System.out.print("A=");
        for (int i = 0; i < 6; i++) {

            System.out.print(" " + dizi[i]);
        }

        for (int i = 0; i < 6; i++) {

            if (i % 2 == 0) {
                c[i] = dizi[i];
            }

        }

        for (int i = 0; i < 6; i++) {

            if (i % 2 == 1) {
                b[i] = dizi[i];
            }
        }
        System.out.println();

        System.out.print("B=");

        for (int i = 0; i < 6; i++) {

            if (b[i] != 0) {

                System.out.print(" " + b[i]);

            }

        }

        System.out.println();
        System.out.print("C=");

        for (int i = 0; i < 6; i++) {

            if (c[i] != 0) {

                System.out.print(" " + c[i]);

            }

        }

    }

}
