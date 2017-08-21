package sis.studentinfo;

public class Student {
	static final String IN_STATE = "경기도";
	String name;
	int credits;
	String state;
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	int length() {
		return name.length();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getCredits() {
		return this.credits;
	}

	public void addCredits(int credits) {
		this.credits += credits;
	}

	public Boolean isFullTime() {
		return this.credits >= 12;
	}

	public boolean isInState() {
		if(state==null) {
			return false;
		}
		return state.equals(IN_STATE);
	}

	public void setState(String state) {
		this.state = state;
		
	}
}