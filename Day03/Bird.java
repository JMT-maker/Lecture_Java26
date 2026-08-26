package abstractclass;

public class Bird extends Countable{
	
	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void count() {
        System.out.println(name + "가 " + num + "마리 있습니다.");
    }

}
