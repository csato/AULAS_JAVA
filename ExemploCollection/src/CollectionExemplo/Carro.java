package CollectionExemplo;

public class Carro {

	private String motor;
	private String cor;
	
	
	
	/**
	 * @param motor
	 * @param cor
	 */
	public Carro(String motor, String cor) {
		super();
		this.motor = motor;
		this.cor = cor;
	}
	
	
	
	
	/**
	 * @return the motor
	 */
	public String getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(String motor) {
		this.motor = motor;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		return result;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		return true;
	}
	
	
	
	
	
	
}
