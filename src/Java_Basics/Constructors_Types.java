package Java_Basics;

public class Constructors_Types {

	String domainName;
	

	// Constructor = ddoes not return anything and has the same name as Class Name

	// 				DEFAULT CONSTRUCTOR

	public Constructors_Types() {
		this.domainName = "Default Constructor is called and Executed Successfully  ";
	}

	// 			PARAMATERIZED CONSTRUCTOR WITH STRING ARGUMENT

	public Constructors_Types(String constype) {
		this.domainName = constype;

	}
	
	// 			PARAMATERIZED CONSTRUCTOR WITH INT ARGUMENT

		public Constructors_Types(int i,int j) {
			
			System.out.println("The sum of two number is ="+(i+j));
		}
		

	// 			METHOD

	public void getName() {
		System.out.println(this.domainName);
	}

	public static void main(String[] args) {
		Constructors_Types defaultObj = new Constructors_Types();
		Constructors_Types ParameterObj = new Constructors_Types("Paramaterized  Constructor is called and Executed Successfully  ");
		@SuppressWarnings("unused")
		Constructors_Types ParameterObj2 =  new Constructors_Types(10,20);

		defaultObj.getName();
		ParameterObj.getName();
	}
}


//NOTE: if there is atleast one constructor being defined in the class ,defaut constructor is not called automatically
