package CajeroAutomatico;

import java.util.Scanner;

public class Cajeroautomatico {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //crear objeto
        var saldo = 1000.0; //saldo inicial
        int opcion; //variable para almacenar la opcion de menu

        //Repetir el menu mientras la opcion no sea salir (4)
        do {
            //mostrar menu de operaciones
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("5. Selecciona una opción: ");

            opcion = scanner.nextInt(); //Leer la opcion elegida por el usuario
            //Estructura switch para manejar las opciones del menu

            switch (opcion) {
                case 1 -> {
                    // Consultar saldo
                    System.out.println("Tu saldo actual es: $" + saldo);
                }
                case 2 -> {
                    //Depositar dinero
                    System.out.println("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        //Validacion: el monto debe ser mayor a cero
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; //Volver al menu sin modificar el saldo
                    }

                    saldo += deposito; //Aumentar el saldo
                    System.out.println("Deposito realizado. Saldo actualizado: $" + saldo);
                }
                case 3 -> {
                    //Retirar dinero
                    System.out.println("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        //Validación: El monto debe ser mayor a cero
                        System.out.println("El monto debe ser mayor a 0.");
                        continue; //Volver al menú sin hacer nada
                    }

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; //Restar el monto del saldo
                        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                    }
                }
                case 4 -> {
                    //Salir del programa
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                }
                default -> {
                    //Opción no válida
                    System.out.println("Opción inválida. Intenta nuevamente.");
                }
            }
        }
            while (opcion != 4) ; // Salir cuando el usuario elije opción 4

        scanner.close(); //Cerrar el Scanner
    }
}
