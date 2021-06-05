package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluri.StudentDummy;
import ro.ase.cts.dubluri.StudentFake;
import ro.ase.cts.dubluri.StudentStub;

public class TestGrupaWithMocks {

	@Test
	public void testGrupaWithDummy() {
		IStudent student = new StudentDummy();
		Grupa grupa = new Grupa(1078);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getStudenti().size());
	}
	
	@Test
	public void testGrupaWithStub() {
		IStudent student = new StudentStub();
		Grupa grupa = new Grupa(1078);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testGrupaWithFakeRight() {
		Grupa grupa = new Grupa(1078);
		//10 studenti - 7 integralisti si 3 restantieri
		
		for(int i=0; i<7;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<3; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7,grupa.getPromovabilitate(),0.01);
	}

}
