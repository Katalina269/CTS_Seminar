package ro.ase.cts.teste;

import static org.junit.Assert.*;
// metoda fail -> testul pica automat, nu mai intra in partea de testare

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTest {
	
	// am putea crea un setup care sa initializeze un obiect de tip Student
	// ca sa nu mai facem asta in fiecare metoda

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
	
	//test pentru setter
	
	@Test
	public void testSetNume() {
		Student student = new Student();
		String nume = "Florin";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	// specifica pentru JUnit3
	   @Test
       public void testGetNotaIndexInvalid() {
    	   Student student = new Student();
    	   student.adaugaNota(10);
    	   try {
    		   //2
    		   int nota = student.getNota(-1);
    		   //3- nu este executata
    		   fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
    	   }
    	   catch(IndexOutOfBoundsException exception) {
    		   //4
    		   
    	   }
    	   catch(Exception exception) {
    		  //5  nici aceasta linie nu este executata
    		   fail("Tipul exceptiei aruncate nu este corect, adica nu e IndexOutOfBounds");
    	   }
          //6
       }
       
       @Test(expected = IndexOutOfBoundsException.class)
       public void testGetNotaIndexInvalidJUnit4() {
    	   Student student = new Student();
    	   student.adaugaNota(10);
    	   
    	   int nota = student.getNota(-1);
       }
       
       @Test
       public void testGetNotJUnit5() {
    	   Student student = new Student();
    	   student.adaugaNota(10);
    	   assertThrows(IndexOutOfBoundsException.class,()->{
    		   student.getNota(-1);
    	   });
       }
       
       @Test
       public void testAdaugaNotaNegativa() {
    	   Student student = new Student();
    	   student.adaugaNota(10);
    	   
    	   if(student.getNota(0) >10 && student.getNota(0) <0) {
    		   assertThrows(IllegalArgumentException.class, ()->{
    			   student.getNota(0);
    		   });
    	   }
       }
	
	
}
