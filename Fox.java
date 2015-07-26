
public class Fox implements Barkable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fox fox = new Fox();
		fox.name = "ff";
		fox.bark("Hello, yilin. I'm " + fox.name + ".");

		Barkable fox2 = new Fox();
		fox2.bark("I don't know my name.");
	}

	public String name;

	@Override
	public void bark(String content) {
		// TODO Auto-generated method stub
		System.out.println(content);
	}

}
