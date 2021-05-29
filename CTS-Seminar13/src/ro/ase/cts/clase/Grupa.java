package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

//O grupa contine maxim 35 de studenti
//Numarul grupei pentru facultatea noastra este cuprins intre 1000 - 1100

public class Grupa {
 private List<IStudent> studenti;
 private int nrGrupa;

 public Grupa(int nrGrupa){
 	if(nrGrupa>=1000 && nrGrupa<=1100) {
 		 this.nrGrupa=nrGrupa;
 	     studenti=new ArrayList<>();
 	}else {
 		throw new IllegalArgumentException("Numarul grupei este incorect, atentie la limitele de interval.");
 	}
    
 }

 public void importaStudenti(List<IStudent> studenti){
     this.studenti.addAll(studenti);
 }

 public void adaugaStudent(IStudent student){
     studenti.add(student);
 }

 public IStudent getStudent(int index){
     if(index>=0 && index< studenti.size()){
         return studenti.get(index);
     }
     throw new IndexOutOfBoundsException();
 }

 public float getPromovabilitate(){
 	if(studenti.size()==0) {
 		throw new IllegalArgumentException("Lista este goala");
 	}
     int nrRestantieri=0;
     for(IStudent student:studenti){
         if(student.areRestante()){//referinta externa
             nrRestantieri++;
         }
     }
     return 1-(float)nrRestantieri/studenti.size();
 }

	public List<IStudent> getStudenti() {
		return studenti;
	}

	public int getNrGrupa() {
		return nrGrupa;
	}
 
 
 
}