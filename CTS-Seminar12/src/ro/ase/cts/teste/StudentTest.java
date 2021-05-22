package ro.ase.cts.teste;

import static org.junit.Assert.*;
// metoda fail -> testul pica automat, nu mai intra in partea de testare

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTest {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume,student.getNume());
		
	}
	
	@Test
	public void testConstructorFaraParametri() {
        Student student = new Student();
		assertNotNull("Numele studentului este null",student.getNume());
		assertNotNull("Lista de note nu este initializata",student.getNote());
	}
    
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota =10;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	
	@Test 
	public void testAdaugaNotaSingura() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		student.adaugaNota(8);
		assertEquals(3,student.getNote().size());
	}
	
	//regula 0, 1, n
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(10);
		student.adaugaNota(8);
		assertEquals(9f, student.calculeazaMedie(), 0.01);
    }
	@Test
	public void testCalculMedieVarAlternativa() {
		Student student = new Student();
		int nota1 = 7;
		int nota2 = 10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		float medie1 = student.calculeazaMedie();
		float medie2 = (nota1 + nota2)/2.0f;
		
		assertEquals(medie1,medie2,0.2f);
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(4);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testAreRestanteX2() {
		Student student = new Student();
		student.adaugaNota(7);
		student.adaugaNota(7);
		assertEquals(true,student.areRestante());
	}
	
	
}
