
public class Dog {
	
	private String voice;
	
	public void bark() {
		System.out.println(this.voice);
	}
	
	public void bark(int times){
		for (int i = 0; i < times; i++){
			System.out.println(this.voice);
		}
	}
	
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.bark(5);
	}
}
