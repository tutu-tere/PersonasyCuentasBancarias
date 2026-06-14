import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {
  public static void main(String[] args) {
    // 3 instancias de persona
    Persona tere = new Persona("Teresa", 40);
    Persona ahino = new Persona("Ahinoam", 50);
    Persona pablo = new Persona("Pablo", 48);
    // 3 instancias de cuentas bancarias
    CuentaBancaria cuentaTere = new CuentaBancaria(800, tere);
    CuentaBancaria cuentaAhino = new CuentaBancaria(100, ahino);
    CuentaBancaria cuentaPablo = new CuentaBancaria(1600, pablo);

    // Movimientos en una cuenta

    System.out.println("Movimientos de Tere");
    cuentaTere.depositar(80);

    // retiro en una cuenta
    System.out.println("\nMoviemiento de Ahinoam");
    cuentaAhino.retirar(50);
    cuentaAhino.depositar(10);
    cuentaAhino.retirar(100);

    // retiro en otra cuenta

    System.out.println("\nMovimiento de Pablo");
    cuentaPablo.depositar(600);
    // Metodo que pertenece a la clase no a la instancia
    CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
  }
}
