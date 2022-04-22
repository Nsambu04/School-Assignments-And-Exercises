
public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal lion = new Lion();
		Animal snake = new Snake();
		Animal whale = new Animal();
		
		//Animal Array
		Animal[] myAnimals = {dog,cat,lion,snake,whale};
		
		for(int j = 0; j < myAnimals.length; j++) {
			System.out.println(myAnimals[j].getClass().getSimpleName() + " makes this sound " + myAnimals[j].makeNoise());
		}
		
	}
}
