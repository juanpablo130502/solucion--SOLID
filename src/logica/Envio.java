package logica;

public class Envio {

  String tipo;
  Integer precio;


  Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  public String getTipoEnvio() {
    return this.tipo;
  }

  public Integer getPrecio() {
    return this.precio;
  }


}