import Solucion_Reto_01.LogicaDecision;
import Solucion_Reto_01.TransicionSimple;

public class MainNarrativa {
    public static void main(String[] args) {
        // Simulación inicial
        PaqueteNarrativo paquete = new PaqueteNarrativo("Inicio del viaje");

        TransicionHistoria transicion = new TransicionHistoria() {
            @Override
            public void realizarTransicion(String decision) {

            }
        };
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new LogicaDecision() {
            @Override
            public String tomarDecision() {
                return "";
            }
        };

        dialogo.mostrarDialogo(paquete);
        String accion = decision.tomarDecision();
        transicion.realizarTransicion(accion);
    }
}
