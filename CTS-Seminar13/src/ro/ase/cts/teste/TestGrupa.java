package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {

	//right-bicep
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1078);
		assertEquals(1078,grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundaryInf() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorBoundarySuperior() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorError() {
		Grupa grupa = new Grupa(1250);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorSubLimitaInferioara() {
		Grupa grupa = new Grupa(150);
	}
	
	@Test(timeout =200)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1078);
	}
	// correct 
	// e -existence
	@Test
	public void testConstructorExistaLista() {
		Grupa grupa = new Grupa(1078);
		assertNotNull(grupa.getStudenti());
	}
	
	// right-bicep pentru getPromovabilitate
	@Test
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<8;i++) {
			Student student=new Student("Florin");
			student.adaugaNota(4);
			student.adaugaNota(5);
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			Student student=new Student("Bianca");
			student.adaugaNota(10);
			student.adaugaNota(9);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.199,grupa.getPromovabilitate(),0.05);
	}
	@Test
	public void testPromovabilitateBoundary() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student=new Student("Anca");
			student.adaugaNota(4);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Bianca");
			student.adaugaNota(10);
			student.adaugaNota(4);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(0,grupa.getPromovabilitate(),0.05);
	}
	@Test
	public void testPromovabilitateBoundarySup() {
		Grupa grupa=new Grupa(1076);
		for(int i=0;i<7;i++) {
			Student student=new Student("Florin");
			student.adaugaNota(5);
			student.adaugaNota(5);
			student.adaugaNota(6);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<5;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(10);
			student.adaugaNota(5);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(1,grupa.getPromovabilitate(),0.05);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1078);
		grupa.getPromovabilitate();
	}
	// inverse rel
	@Test
	public void testGetPromovabilitateInverse() {
		int nrIntegralisti = 8;
		int nrRestantieri = 2;
		Grupa grupa = new Grupa(1078);
		for(int i=0; i<nrIntegralisti;i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<nrRestantieri;i++) {
			Student student = new Student();
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		assertEquals(nrIntegralisti,grupa.getPromovabilitate()*grupa.getStudenti().size(), 0.01);
	}
	@Test(timeout = 500)
	public void testGetPromovabilitatePerformance() {
		Grupa grupa = new Grupa(1078);
		for(int i=0; i<35;i++) {
			Student student = new Student();
			for(int j=0;j<7;j++) {
				student.adaugaNota(9);
			}
			grupa.adaugaStudent(student);
		}
	  grupa.getPromovabilitate();
	}
	@Test
	public void testGetPromovabilitateCardinalityAreRestante() {
		Grupa  grupa = new Grupa(1078);
		Student student= new Student();
		student.adaugaNota(4);
		grupa.adaugaStudent(student);
		assertEquals(0,grupa.getPromovabilitate(),0.001);
	}
	@Test
	public void testGetPromovabilitateCardinalityNuAreRestante() {
		Grupa  grupa = new Grupa(1078);
		Student student= new Student();
		student.adaugaNota(10);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.001);
	}
	

}
