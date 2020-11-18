/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacao;

import sensores.SensorTemperatura;
import sensores.SensorUmidade;

/**
 *
 * @author camil
 */
// Observador concreto
public class EstacaoMeteorologicaConcreta extends EstacaoMeteorologica {

    private SensorTemperatura sensorTemp;
    private SensorUmidade sensorUmidade;

    public SensorTemperatura getSensorTemp() {
        return sensorTemp;
    }

    public void setSensorTemp(SensorTemperatura sensorTemp) {
        this.sensorTemp = sensorTemp;
    }

    public SensorUmidade getSensorUmidade() {
        return sensorUmidade;
    }

    public void setSensorUmidade(SensorUmidade sensorUmidade) {
        this.sensorUmidade = sensorUmidade;
    }

    public double getTemperatura() {
        return temp;
    }

    public double getUmidade() {
        return umid;
    }

    private double umid;
    private double temp;

    public void ligar() {
        Thread t = new Thread() {

            @Override
            public void run() {
                while (true) {
                    temp = sensorTemp.getMedicao();
                    umid = sensorUmidade.getMedicao();

                    notificar(temp, umid);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        t.start();
    }

}
