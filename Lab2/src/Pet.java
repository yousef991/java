
public class Pet extends Animal{


	
	private String name;
	private int age;
	private double weight;
	
	public String toString(){
		
		return ("name: "+name + "Age: "+age + "Years"
				+ "\n Weight" + weight + "pounds");
	
	}
	

		public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {  //추가
			
			super(iniGender);  // 부모 클래스 생성자 초기화
			name = initialName;
			if ((initialAge < 0) || (initialWeight < 0)) {
				System.out.println("Error: Negative age or weight.");
				System.exit(0);
			} else {
				age = initialAge;
				weight = initialWeight;
			}
		}

		
	public Pet (String initialName){
		name= initialName;
		age= 0;
		weight= 0;
	}
	
	public Pet( int initialAge) {
		name = "No name yet.";
		weight = 0;
		if (initialAge < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}
	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}
	public void set(String newName, int newAge, double newWeight) {

		name = newName;
		age = newAge;
		weight =newWeight;
	}
	
	public void setAge( int newAge) {
		age = newAge;
		
	}
	
	public void setWeight( double newWeight) {
		weight =newWeight;
		
       }
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
}
