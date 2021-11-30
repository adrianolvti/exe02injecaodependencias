package modelo;

import java.math.BigDecimal;

public class Produto {
	  private String nome;
	  private BigDecimal valorTotal;
	  
	  public Produto(String nome, BigDecimal valorToral){
	    this.nome = nome;
	    this.valorTotal = valorToral;
	  }
	  
	  public String getNome() {
	    return nome;
	  }
	  
	  public BigDecimal getValorTotal() {
	    return valorTotal;
	  }
}
