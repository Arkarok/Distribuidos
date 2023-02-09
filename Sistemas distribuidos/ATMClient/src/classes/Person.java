package classes;

public abstract class Person {

	protected String name;
	protected String last;
	
	public Person(String name, String last) {
		this.name = name;
		this.last = last;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	
	
	
	
}
