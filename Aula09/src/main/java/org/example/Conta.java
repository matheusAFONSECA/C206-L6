package org.example;

public class Conta {
    // atributos
    private double saldo;       // saldo da conta
    private String dono;        // nome do dono da conta

    // construtor
    public Conta(double saldo, String dono) {
        this.saldo = saldo;
        this.dono = dono;
    }

    // metodos
    public void sacar(double valorSaque) {      // saque da conta
        // -> tratamos o erro nesse metodo com uma exceção que nos criamos
        // -> usamos o TRY e CATCH aqui no metodo
        try {
            if (valorSaque > this.saldo) {
                throw new SemSaldoException(valorSaque);
            } else {
                System.out.println("Valor disponível: " + (this.saldo - valorSaque));
            }
        } catch (SemSaldoException e) {
            System.out.println(e);
        }
    }

    public void sacar1(double valorSaque) throws SemSaldoException {      // saque da conta
        // -> tratamos o erro nesse metodo com uma exceção que nos criamos
        // -> nessa caso temos que fazer o uso de TRY e CATCH na main
        if (valorSaque > this.saldo) {
            throw new SemSaldoException(valorSaque);
        } else {
            System.out.println("Valor disponível: " + (this.saldo - valorSaque));
        }
    }

    // getter e setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
