package ro.ase.cts.builder.clase;

 public class BuilderV2 implements BuilderAbstract{
		private int codRezervare;
		private boolean areMancareInclusa;
		private boolean areBauturaInclusa;
		private boolean areScaunErgonomic;
		private boolean areMuzicaAmbientala;
		private String genMuzical;
		
		public BuilderV2() {
			super();
			this.codRezervare = 0;
			this.areMancareInclusa = false;
			this.areBauturaInclusa = false;
			this.areScaunErgonomic = false;
			this.areMuzicaAmbientala = false;
			this.genMuzical = " ";
		}

		public BuilderV2 setCodRezervare(int codRezervare) {
			this.codRezervare = codRezervare;
			return this;
		}

		public BuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
			this.areMancareInclusa = areMancareInclusa;
			return this;
		}

		public BuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
			this.areBauturaInclusa = areBauturaInclusa;
			return this;
		}

		public BuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
			this.areScaunErgonomic = areScaunErgonomic;
			return this;
		}

		public BuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
			this.areMuzicaAmbientala = areMuzicaAmbientala;
			return this;
		}

		public BuilderV2 setGenMuzical(String genMuzical) {
			this.genMuzical = genMuzical;
			return this;
		}

		@Override
		public Rezervare build() {
			// TODO Auto-generated method stub
			return new Rezervare(codRezervare,areMancareInclusa, areBauturaInclusa, areBauturaInclusa, areBauturaInclusa, genMuzical);
		}
		
		
		
		
	};
