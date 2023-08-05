package Transportadora;

public class TransporteNautico extends Transporte{

    @Override
    public Double cauculaFrete(Integer altura, Integer largura) {
        return (altura + largura) * 0.1;
    }
}
