package dispositivos;

public class DispositivoConsole implements Observador {

    @Override
    public void atualizarDados(double temp, double umid) {
        System.out.println("Exibição console\n "
                + "Temperatura: " + temp
                + "  |  "
                + "Umidade:" + umid);
    }

}
