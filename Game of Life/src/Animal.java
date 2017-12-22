/**
 * Program defines the methods needed to construct, change, and evaluate different animals (in this case bears and fish)
 * given an age and a gender
 * 
 * 
 * @author William Groble
 * @version 1.5=0
 */
public abstract class Animal {
	private enum Gender{
		FEMALE, MALE;
	}
	
	
	public Animal(){
		return;
	}
	
	public Animal(int age, Gender gender){
		return;
	}
	public int getAge(){
		return 0;
	}
	
	public abstract boolean maxAge();
	
	public abstract boolean incrAge();
	
	@Override
	public String toString(){
		return"";
	
	}

}
