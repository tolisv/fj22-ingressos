package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

import br.com.caelum.ingresso.descontos.Desconto;

public class DescontoParaEstudantes implements Desconto {
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
	return precoOriginal.divide(new BigDecimal("2.0"));
	}
	

}
