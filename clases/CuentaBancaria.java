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

}