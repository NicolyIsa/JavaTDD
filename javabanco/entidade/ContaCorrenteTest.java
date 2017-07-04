package javabanco.entidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import java.util.ArrayList;

import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void testSaldo() {
		ContaCorrente cc = new ContaCorrente(0, null);
		assertEquals();
	}

	@Test
	public void testCredito() {
		ContaCorrente cc = new ContaCorrente(0, null);
		cc.Credito(100);
		assertEquals();
	}

	@Test
	public void testDebito() {
		ContaCorrente cc = new ContaCorrente(0, null);
		cc.Debito(100);
		assertEquals();
	}

	@Test
	public void testExtrato() {
		ContaCorrente cc = new ContaCorrente(0, null);
		cc.Credito(100);
		cc.Debito(100);
		ArrayList<Float> op = cc.Extrato();
		assertEquals();
		assertEquals();
		assertEquals();
	}
	
	@Test
	public void testSaldoPequenosFloats() {
		ContaCorrente cc = new ContaCorrente(0, null);
		cc.Credito(0.1f);
		cc.Credito(0.2f);
		assertEquals();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreditoValorNegativo() {
		ContaCorrente cc = new ContaCorrente(0, null);
		
		cc.Credito(-10);		
	}
	@Test
	public void testConstrutor(){
		ContaCorrente cc = new ContaCorrente(0, null);
		assertNotNull(cc);
	}
	
@Test 
	public void testGetTitular(){
		ContaCorrente cc = new ContaCorrente(0, null);
		assertEquals();
	}
	
private void assertEquals() {
	// TODO Auto-generated method stub
	
}

@Test 
	public void testGetNumero(){
		ContaCorrente cc = new ContaCorrente(0, null);
		assertEquals ();
	}
	
@Test
	public void testTrensferencia(){
		ContaCorrente cc = new ContaCorrente(0, null);
		ContaCorrente ccDestino = new ContaCorrente (0, null);
		cc.Debito(10);
		ccDestino.Credito(10);
		assertEquals();
		assertEquals();
		
	}
@Test
public void testContaCorrente(){
	ContaCorrente cc = new ContaCorrente(0, null);
	assertEquals();
	
}
	
	
}
	