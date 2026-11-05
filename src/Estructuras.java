import java.util.Scanner;

public class Estructuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 3:
                ejercicio3(sc);
                break;
            case 4:
                ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
                break;
            case 6:
                ejercicio6(sc);
                break;
            case 7:
                ejercicio7(sc);
                break;
            case 8:
                ejercicio8(sc);
                break;
            case 9:
                ejercicio9(sc);
                break;
            case 10:
                ejercicio10(sc);
                break;
            case 11:
                ejercicio11(sc);
                break;

        }
    }

    public static void ejercicio1(Scanner sc) {
        System.out.print("Dime tu edad en números: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.print("Eres mayor de edad");
        }
    }

    public static void ejercicio2(Scanner sc) {
        System.out.print("Dime tu edad en números: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.print("Eres mayor de edad");
        } else {
            System.out.print("Eres un niño");
        }
    }

    public static void ejercicio3(Scanner sc) {
        System.out.print("Dame el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el segundo número: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int divi = num1 / num2;

        System.out.println("La suma de: " + num1 + "+" + num2 + "=" + suma);
        System.out.println("La resta de: " + num1 + "-" + num2 + "=" + resta);
        System.out.println("La multiplcicación de: " + num1 + "*" + num2 + "=" + multi);
        System.out.println("La división de: " + num1 + "/" + num2 + "=" + divi);
    }

    public static void ejercicio4(Scanner sc) {
        System.out.print("Dame un número: ");
        int num1 = sc.nextInt();
        System.out.print("Dame otro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.print("El mayor es: " + num1);
        } else {
            System.out.print("El mayor es: " + num2);
        }
    }

    public static void ejercicio5(Scanner sc) {
        System.out.print("Dame un número: ");
        int num1 = sc.nextInt();
        System.out.print("Dame otro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);
        }
    }

    public static void ejercicio6(Scanner sc) {
        System.out.print("Dame un número: ");
        int num1 = sc.nextInt();
        System.out.print("Dame otro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.print(num1 + " es igual que " + num2);
        }
    }

    public static void ejercicio7(Scanner sc) {
        System.out.print("Dame un número: ");
        int num1 = sc.nextInt();
        System.out.print("Dame otro número: ");
        int num2 = sc.nextInt();
        System.out.print("Dame otro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("el mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("el mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.print("el mayor es: " + num3);
        }
    }

    public static void ejercicio8(Scanner sc) {
        System.out.print("Dame el precio de el producto en  €: ");
        double precio = sc.nextDouble();

        double descuento = precio / 10;
        double subtotal = precio - descuento;
        if (precio >= 100) {
            System.out.print("El descuento se aplica y es de: " + subtotal);
        }
    }

    public static void ejercicio9(Scanner sc) {
        System.out.print("Dame el precio de el producto en  €: ");
        int precio = sc.nextInt();

        int descuento = precio / 10;
        int subtotal = precio - descuento;
        int subtotal2 = precio + 2;
        if (precio >= 100) {
            System.out.print("El descuento se aplica y es de: " + subtotal);
        } else if (precio < 30) {
            System.out.print("Al ser menor de 30 se cobran 2€ de envío: " + subtotal2);
        }
    }

    public static void ejercicio10(Scanner sc) {
        System.out.print("Dame un número entre 0 y 10: ");
        int num = sc.nextInt();

        if (num < 3) {
            System.out.print(num + " < 3 muy deficiente");
        } else if (num < 5 && num > 3) {
            System.out.print(num + " < 5 Insuficiente");
        } else if (num <= 6 && num > 5) {
            System.out.print(num + " < 6 Bien");
        } else if (num <= 9 && num > 6) {
            System.out.print(num + " < 9 Notable");
        } else if (num == 10 && num > 9) {
            System.out.print(num + " <= 10 Sobresaliente");
        }
    }

    public static void ejercicio11(Scanner sc) {
        int n1 = 0, n2 = 0;
        n1 = validaInt("Introduce un número: ");
        n2 = validaInt("Introduce otro: ");
    }
    public static int validaInt(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        while (sc.hasNextInt()){
            System.out.println("Eso no es un número! ");
            sc.next();
        }
        return sc.nextInt();
    }
}
