package prob7;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println("참새(" + getName() + ")가 날아다닙니다.");

	}

	@Override
	public void sing() {
		System.out.println("참새(" + getName() + ")가  소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "참새의 이름은 " + getName() + "입니다.";
	}
}