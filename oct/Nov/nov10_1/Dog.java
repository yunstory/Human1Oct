package nov10_1;

public class Dog { //문제1 dog 클래스를 만들어보자 

	public int dogAge = 0;
	public String dogName = "";
	public Boolean Vaccination = false;
	
	
	public Dog() {};

	public Dog(String dogName, int dogAge, Boolean vaccination) {
		super();
		this.dogAge = dogAge;
		this.dogName = dogName;
		Vaccination = vaccination;
	}

	public int addAge(int x) { //문제3 addAge메소드 추가 
		return dogAge += x;
	}

	public Boolean isVaccination() { //문제5 isVaccination메소드 추가
		if(dogAge>5 && Vaccination == false ) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "강아지 이름은 " + dogName + "이고 나이는 " + dogAge + " 살 입니다.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Vaccination == null) ? 0 : Vaccination.hashCode());
		result = prime * result + dogAge;
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode());
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
		Dog other = (Dog) obj;
		if (Vaccination == null) {
			if (other.Vaccination != null)
				return false;
		} else if (!Vaccination.equals(other.Vaccination))
			return false;
		if (dogAge != other.dogAge)
			return false;
		if (dogName == null) {
			if (other.dogName != null)
				return false;
		} else if (!dogName.equals(other.dogName))
			return false;
		return true;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public Boolean getVaccination() {
		return Vaccination;
		
	}

	public void setVaccination(Boolean vaccination) {
		Vaccination = vaccination;
	}
	
	

	
	
	
	
	
	
}
