package abstractclass;

public abstract class Countable {
	
	String name;
	int num;
	
	public Countable() {
		
	}
	
	public Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	abstract public void count();

	public void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다.");
	}
	
	public void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
}
