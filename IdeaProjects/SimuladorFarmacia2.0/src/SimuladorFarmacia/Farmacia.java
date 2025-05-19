package SimuladorFarmacia;
  import java.util.Scanner;

    //Declaramos clase principal
    public class Farmacia {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Solicitamos datos del usuario
            System.out.println("Nombre del medicamento ");
            String medicamento = scanner.nextLine();

            System.out.println("Precio unitario: ");
            double preciounitario = scanner.nextDouble();

            System.out.println("Cantidad de piezas: ");
            int cantidadpiezas = scanner.nextInt();

//Calculamos el total
            double totalSinDescuento = preciounitario * cantidadpiezas;

//Evaluamos si aplica el descuento
            var aplicaDescuento = totalSinDescuento > 500; //Al menos una implementacion de var
            double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

//Total a pagar
            double totalConDescuento = totalSinDescuento - descuento;


//Mostramos resumen
            System.out.println("Resumen de compra: ");
            System.out.println("Medicamento: " + medicamento);
            System.out.println("Cantidad: " + cantidadpiezas);
            System.out.println("Precio unitario: $" + preciounitario);
            System.out.println("Total sin descuento: $" + totalSinDescuento);
            System.out.println("¿Aplica descuento?: " + aplicaDescuento);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + totalConDescuento);

            scanner.close();
        }
    }

