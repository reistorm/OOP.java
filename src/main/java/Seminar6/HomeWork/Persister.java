package Seminar6.HomeWork;

public abstract class Persister {
	private String name;
	public Persister(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Persister{" +
				"name='" + name + '\'' +
				'}';
	}
}