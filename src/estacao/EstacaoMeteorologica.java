package estacao;

import dispositivos.Observador;
import java.util.ArrayList;

//OBSERVADO
public abstract class EstacaoMeteorologica {

    public final ArrayList<Observador> observadores = new ArrayList<>();

    public void addObservador(Observador obs) {
        this.observadores.add(obs);
    }

    public void removerObservador(Observador obs) {
        this.observadores.remove(obs);
    }

    public void notificar(double temp, double umid) {
        this.observadores.forEach(obs -> {
            obs.atualizarDados(temp, umid);
        });
    }

}
