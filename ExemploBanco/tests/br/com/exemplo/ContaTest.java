package br.com.exemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ContaTest {

	@Test
	public void criacaoContaTest() {
		
		
		Conta conta = new Conta();
		
	assertEquals("Conta criada com saldo diferente de 0",0.0,conta.getSaldo());
		
	}
	
	
	
	@Test
	public void depositoTest(){
		
		Conta conta = new Conta();
		
		conta.depositar(10.0);
		
		assertEquals("conta criada com saldo",10.0,conta.getSaldo());
	}

	@Test
	public void debitoContaTest(){
		
		Conta conta = new Conta();
		
		conta.debitar(1);
		
		assertEquals("foi debitado da conta",9.0,conta.getSaldo());
		
		
		
		
	}





}
