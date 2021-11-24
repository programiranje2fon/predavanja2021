package dvocas8_sreda.zadatak1;

public abstract class MotornoVozilo {
	private String markaModel;
	private String registarskaOznaka;
	private int kubikaza;
	private int snaga;
	
	public String getMarkaModel() {
		return markaModel;
	}
	public void setMarkaModel(String markaModel) {
		this.markaModel = markaModel;
	}
	public String getRegistarskaOznaka() {
		return registarskaOznaka;
	}
	public void setRegistarskaOznaka(String registarskaOznaka) {
		this.registarskaOznaka = registarskaOznaka;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	public int getSnaga() {
		return snaga;
	}
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	
	@Override
	public String toString() {
		return "MotornoVozilo [markaModel=" + markaModel + ", registarskaOznaka=" + registarskaOznaka + ", kubikaza="
				+ kubikaza + ", snaga=" + snaga + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kubikaza;
		result = prime * result + ((markaModel == null) ? 0 : markaModel.hashCode());
		result = prime * result + ((registarskaOznaka == null) ? 0 : registarskaOznaka.hashCode());
		result = prime * result + snaga;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MotornoVozilo other = (MotornoVozilo) obj;
		if (!registarskaOznaka.equals(other.registarskaOznaka))
			return false;

		return true;
	}
	
	public abstract double izracunajCenuRegistracije();
	
	
	

}
