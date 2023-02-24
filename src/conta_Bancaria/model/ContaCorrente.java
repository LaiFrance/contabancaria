package conta_Bancaria.model;

public class ContaCorrente {
	  
	  private int numeroDaConta;
	  private String nomeDoTitular;
	  private double saldo;
	  
	  public ContaCorrente(int numeroDaConta, String nomeDoTitular, double saldo) {
	    this.numeroDaConta = numeroDaConta;
	    this.nomeDoTitular = nomeDoTitular;
	    this.saldo = saldo;
	  }
	  
	  public int getNumeroDaConta() {
	    return numeroDaConta;
	  }
	  
	  public void setNumeroDaConta(int numeroDaConta) {
	    this.numeroDaConta = numeroDaConta;
	  }
	  
	  public String getNomeDoTitular() {
	    return nomeDoTitular;
	  }
	  
	  public void setNomeDoTitular(String nomeDoTitular) {
	    this.nomeDoTitular = nomeDoTitular;
	  }
	  
	  public double getSaldo() {
	    return saldo;
	  }
	  
	  public void setSaldo(double saldo) {
	    this.saldo = saldo;
	  }
	  
	  public void depositar(double valor) {
	    if (valor > 0) {
	      saldo += valor;
	    }
	  }
	  
	  public void sacar(double valor) {
	    if (valor > 0 && saldo >= valor) {
	      saldo -= valor;
	    }
	  }
	  
	  public void transferir(ContaCorrente contaDestino, double valor) {
	    if (valor > 0 && saldo >= valor) {
	      saldo -= valor;
	      contaDestino.depositar(valor);
	    }
	  }

	}
