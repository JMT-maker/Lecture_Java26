package abstractclass;

public class Tree extends Countable{
	
	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}

}
