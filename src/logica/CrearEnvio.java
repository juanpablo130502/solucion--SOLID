package logica;

import bd.BDEnvio;

public class CrearEnvio {

    IBD bd;
    public CrearEnvio(IBD bd){
        this.bd= bd;
    }

    public CrearEnvio(BDEnvio bdEnvio) {
    }

    public Envio[] generarEnvio(){
        Envio[] envios = {
                new Envio("Municipal",5000),
                new Envio("Internacional",25000)
        };

        return envios;
    }
    public void TiempoDeEnvio() {
        Envio[] envios = this.generarEnvio();
        for (Envio envio : envios) {
            if (envio.getTipoEnvio().equals("Municipal")) {
                System.out.println("Tiempo envío 12 horas");
            } else if (envio.getTipoEnvio().equals("Internacional")) {
                System.out.println("Tiempo envío 190 horas");
            }
        }
    }

}
