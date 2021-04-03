package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderV2;
import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rezervare rezervare1  = new Rezervare(505,true,false,true,false,"SingSong");
       System.out.println(rezervare1.toString());
       
       RezervareBuilder rezervareBuilder=new RezervareBuilder();
		
		Rezervare rezervare3=rezervareBuilder.setAreBauturaInclusa(true).build();
		Rezervare rezervare2=new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzical("rock").build();
		
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		
		System.out.println("Test pentru builder varianta 2 = rezolvam shallow copy");
		
		BuilderV2  builderV = new BuilderV2();
		
		Rezervare rezervare5 = builderV.setCodRezervare(5).setAreBauturaInclusa(true).build();
		Rezervare rezervare6 = builderV.setAreMuzicaAmbientala(true).build();
		System.out.println(rezervare5);
		System.out.println(rezervare6);
		
	}

}
