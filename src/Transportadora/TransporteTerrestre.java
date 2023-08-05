package Transportadora;

public class TransporteTerrestre extends Transporte {
    @Override
    public Double cauculaFrete(Integer altura, Integer largura) {
        return altura / largura * 0.2;
    }
}
