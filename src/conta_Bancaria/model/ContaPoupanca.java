package conta_Bancaria.model;

public class ContaPoupanca {
		  
		  private int numeroDaConta;
		  private String nomeDoTitular;
		  private double saldo;
		  private double rendimentoMensal;
		  
		  public ContaPoupanca(int numeroDaConta, String nomeDoTitular, double saldo, double rendimentoMensal) {
		    this.numeroDaConta = numeroDaConta;
		    this.nomeDoTitular = nomeDoTitular;
		    this.saldo = saldo;
		    this.rendimentoMensal = rendimentoMensal;
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
		  
		  public double getRendimentoMensal() {
		    return rendimentoMensal;
		  }
		  
		  public void setRendimentoMensal(double rendimentoMensal) {
		    this.rendimentoMensal = rendimentoMensal;
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
		  
		  public void transferir(ContaPoupanca contaDestino, double valor) {
		    if (valor > 0 && saldo >= valor) {
		      saldo -= valor;
		      contaDestino.depositar(valor);
		    }
		  }
		  
		  public void render(){
		    saldo += saldo * rendimentoMensal;
		  }

		}

