package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {

	@Test
	public void retornar_5_perc_para_caso_de_fronteira() {
		double esperado = 500;
		double valorVenda = 10000;
		double retorno = CalculadoraComissao.calcular(valorVenda);
		assertEquals(esperado, retorno, 0);
	}

	@Test
	public void deve_retornar_5_centavos_para_venda_de_1_real() {
		double esperado = 0.05;
		double valorVenda = 1;
		
		double retorno = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(esperado, retorno, 0);
	}
	
	@Test
	public void deve_retornar_17_centavos_e_meio_para_venda_de_3_reais_e_50_centavos() {
		double esperado = 0.175;
		double valorVenda = 3.5;
		
		double retorno = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(esperado, retorno, 0.005);
	}
	
	
	
	
	
	
}