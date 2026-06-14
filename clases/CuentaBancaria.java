package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {

  // Atributos
  private double saldo;
  private Persona titular;
  private int numeroCuenta;

  public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

  // Constructor

  public CuentaBancaria(double saldo, Persona titular) {
    this.saldo = saldo;
    this.titular = titular;

    // numero aleatorio de 6 digitos a la cuenta

    Random random = new Random();
    this.numeroCuenta = 100000 + random.nextInt(900000);

    // Una vez creado el n de cuenta se agrega a la lista de cuentas

    listaDeCuentasBancarias.add(this);
  }
  // Getters y setters

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public Persona getTitular() {
    return titular;
  }

  public void setTitular(Persona titular) {
    this.titular = titular;
  }

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public void depositar(double monto) {
    this.saldo += monto;
    System.out.println("Deposito de: " + monto + " realizado con exito");
    System.out.println("Saldo actualizado a: $" + getSaldo());
  }

  public void retirar(double monto) {
    if (monto > 0 && this.saldo >= monto) {
      this.saldo -= monto;
      System.out.println("Dinero retirado " + monto + " pesos");
      System.out.println("Su nuevo saldo es: $ " + getSaldo());
    } else {
      System.out.println("Fondos insuficientes");
    }
  }

  public void despliegaInformacion() {
    System.out.println("\n----------------Datos de la cuenta----------------");
    System.out.println("Numero de cuenta: " + this.numeroCuenta);
    System.out.println("Saldo de la cuenta: " + this.saldo);
    System.out.println("Titular de la cuenta: " + this.titular.getNombre());
    System.out.println("-----------------------------------------------------");
  }

  public static void imprimeInformacionDeTodasLasCuentas() {
    System.out.println("Informacion de todas las cuentas bancarias");
    for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
      cuenta.despliegaInformacion();
    }
  }
}