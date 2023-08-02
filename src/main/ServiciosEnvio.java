package main;

import logica.Envio;
import logica.IEnvio;

public class ServiciosEnvio implements IEnvio {
    private Envio envio;
    public ServiciosEnvio(Envio envio){
        this.envio = envio;
    }

    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {

    }

    @Override
    public boolean permitidoEnAvion() {
        if (this.envio.getTipoEnvio().equals("Internacional")) {
            if (this.envio.getPrecio() < 100) {
                return true;
            } else {
                return false;
            }
        }
        throw new IllegalArgumentException("No es posible cargar en avión un envío que no sea internacional.");
    }
}
