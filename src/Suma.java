import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma, resta;

        System.out.println("Introduce un número: ");
        num1 = sc.nextInt();
        System.out.println("Introduce un número: ");
        num2 = sc.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);

    }
}
