package numerocentralwhile;

import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class NumeroCentralWHILE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int casos;

        casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {

            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();

            if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
                System.out.println("El numero central es: " + num1);
            } else if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
                System.out.println("El numero central es: " + num2);
            } else if (num3 > num1 && num3 < num2 || num3 < num1 && num3 > num2) {
                System.out.println("El numero central es: " + num3);
            }

        }
    }
}
