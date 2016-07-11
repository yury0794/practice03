package prob7;

public abstract class Bird {
	private String name;
	private int legs;
	private int length;

	public abstract void fly();

	public abstract void sing();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public abstract String toString();
}