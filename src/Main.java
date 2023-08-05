import Transportadora.TransporteNautico;
import Transportadora.TransporteTerrestre;

public class Main {
    public static void main(String[] args){

        TransporteNautico transporteNautico = new TransporteNautico();
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre();

        System.out.println(transporteNautico.cauculaFrete(16,16));
        System.out.println(transporteTerrestre.cauculaFrete(6,3));

    }
}
