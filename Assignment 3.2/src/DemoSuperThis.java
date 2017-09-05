class Product {     //creating class Product
	
	String name;    //declaring string variable 
	int qty;			//declaring integer type variable
	float amount;	//declaring float type variable
	float total_amount;		//declaring float type variable 
	public Product(String pname, int pqty) {		//Creating a constructor  and passing the values to the constructor
		this.name = pname;	//take the value passed in the constructor and assigning using this key word to a variable
		this.qty = pqty;		///take the value passed in the constructor and assigning using this key word to a variable
	}
	public Product(String pname, int pqty, float pamount) {  //overloading Product constructor
		this(pname, pqty);		//using the values stored in the previous constructor by using this keyword
		this.amount = pamount;	//take the value passed in the constructor and assigning using this key word to a variable
		System.out.println("Product Name: " +pname);	//printing the product name on the console
		System.out.println("Product Quantity: " +pqty);	//printing the product quantity on the console	
		System.out.println("Product Amount: " +pamount);	//printing the product amount on the console
	}
}
 
class Calculate extends Product{  //creating a new class called Calculate and extending the Product class in it
	
	float total;		//decalring float type variable
	Calculate(String name, int qty, float amount){  //creating constructor method of class Calculate
		super(name, qty, amount);		//using the variable of base class in derived class using super keyword
		total = qty * amount;	//calculating the total price
		System.out.println("The total price is: " +total);	//printing the total price on the console
	}
}

public class DemoSuperThis {    //creating main class which contains the main method
	public static void main(String[] args) {	//main method of the program
		
		Calculate cal = new Calculate("MacBook Air", 10, 65599);  //creating a obejct of Calculate class and passing parameter in the class
	}
}