package prob7;

public class Duck extends Bird {

	@Override
	public String toString() {
		return "오리의 이름은 " + getName() + "입니다.";
	}

	@Override
	public void fly() {
		System.out.println("오리(" + getName() + ")는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.println("오리(" + getName() + ")가  소리내어 웁니다.");
	}	
}