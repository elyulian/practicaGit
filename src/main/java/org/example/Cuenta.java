package org.example;

public class Cuenta {
    private double saldo;
    private String titular;
    private String numeroCuenta;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular, String numeroCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}
