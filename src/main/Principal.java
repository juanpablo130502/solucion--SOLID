package main;

import bd.BDEnvio;
import logica.CrearEnvio;

public class Principal {

  public static void main(String[] args) {
    CrearEnvio crearEnvio = new CrearEnvio(new BDEnvio());
    crearEnvio.TiempoDeEnvio();
  }
}




