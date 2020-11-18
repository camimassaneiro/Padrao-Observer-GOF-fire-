
import dispositivos.DispositivoConsole;
import dispositivos.DispositivoWindow;
import estacao.EstacaoMeteorologicaConcreta;
import sensores.SensorTemperatura;
import sensores.SensorUmidade;

public class DefesaCivil {
    
    public void abrir() {
        
        EstacaoMeteorologicaConcreta estacao = new EstacaoMeteorologicaConcreta();
        estacao.setSensorTemp(new SensorTemperatura());
        estacao.setSensorUmidade(new SensorUmidade());
        
        DispositivoConsole console = new DispositivoConsole();
        
        DispositivoWindow window = new DispositivoWindow();
        estacao.addObservador(window);
        estacao.addObservador(console);
        estacao.ligar();
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        DefesaCivil dc = new DefesaCivil();
        dc.abrir();
        
        while (true) {
            Thread.sleep(2000);
        }
    }
    
}
