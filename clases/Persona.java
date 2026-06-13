package clases;

public class Persona {
  // atributos
  private String nombre;
  private int edad;

  // Metodo constructor

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  // Getters y Setters

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  // metodo para mostrar informacion
  public void despliegaInformacion() {
    System.out.println("Nombre: " + this.nombre + "Edad: " + this.edad);
  }

}
