package laboratorio_3_fernando_picado;

import java.util.Scanner;

public class Laboratorio_3_Fernando_Picado {

    public static void main(String[] args) {

        // variables\
        validation();

    }

    public static void validation() {

        Scanner input = new Scanner(System.in);
        String num_tarj = "1234", tarj_password = "12345";
        int option;
        int intentos = 0;
        int val_random = 0;
        double monto_inicial;
        boolean login = false;

        System.out.println("Cajero automatico \n");
        System.out.println("Ingrese su numero de tarjeta: \n");
        num_tarj = input.next();
        System.out.println("Ingrese su numero de pin: \n");
        tarj_password = input.next();

        if (num_tarj.compareToIgnoreCase("1234") == 0 && tarj_password.compareTo("12345") == 0) {
            login = true;

        } else {
            intentos++;
            System.out.println("Intentos fallidos, try again.");
        }

        if (login) {

            do {
                monto_inicial = Math.floor(Math.random() * 1000000);
                System.out.println("Monto inicial de su cuenta: " + monto_inicial);
                System.out.println("Seleccione una opcion \n");
                System.out.println("1- Retirar dinero");
                System.out.println("2- Depositar dinero");
                System.out.println("3- Consulta de saldo");
                System.out.println("4- Salir");
                option = input.nextInt();

                switch (option) {
                    case 1:
                        retiroDinero();
                        break;
                    case 2:
                        depositoDinero();
                        break;
                    case 3:
                        consultaSaldo();
                        break;
                }

                System.out.println("Desea realizar otra consulta? 1-SI 2-NO");
                option = input.nextInt();

            } while (option != 2);
        }
    }

    public static void retiroDinero() {
        Scanner input = new Scanner(System.in);
        double monto_inicial;
        double montoRetirar;
        double nuevo_monto;

        monto_inicial = Math.floor(Math.random() * 1000000);
        System.out.println("Cuanto desea retirar?");
        montoRetirar = input.nextDouble();

        if (montoRetirar <= monto_inicial) {
            nuevo_monto = monto_inicial - montoRetirar;
            System.out.println("Monto retirado: " + montoRetirar);
            System.out.println("Monto total de la cuenta: " + nuevo_monto);
        } else {
            System.out.println("Digite un monto valido");
        }
    }

    public static void depositoDinero() {
        Scanner input = new Scanner(System.in);
        int monto_valido = 1;
        double nuevoMonto, monto_inicial, montoIngresar;
        monto_inicial = Math.floor(Math.random() * 1000000);

        System.out.println("El monto inicial en su cuenta es de " + monto_inicial);
        System.out.println("Cuanto dinero desea depositar en su cuenta? ");
        montoIngresar = input.nextInt();

        if (montoIngresar >= monto_valido) {
            nuevoMonto = monto_inicial + monto_valido;
            System.out.println("Su deposito se realizo con exito, saldo total: " + nuevoMonto);

        } else {
            System.out.println("Digite un monto valido");

        }

    }

    public static void consultaSaldo() {
        Scanner input = new Scanner(System.in);

        int option;

        double monto_inicial, saldo_actual, nuevo_monto;
        saldo_actual = Math.floor(Math.random() * 1000000);

        System.out.println("Desea consultar su saldo actual? 1-SI 2-NO");
        option = input.nextInt();
        System.out.println("Su saldo actual es de : " + saldo_actual);

    }

}
