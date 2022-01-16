
class Accessspecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

 class Accessspecifier1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		Accesspecifier1 obj = new Accesspecifier1(); 		  
        obj.display(); 

	}
}



class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 
 class AccessSpecifier {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		Accessspecifier  obj = new Accessspecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}


public class Accessspecifier {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}


 class accessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}
}

public class Accessspecifier2 {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}


 class accessSpecifiers4 {

	public static void main(String[] args) {
		
		Accessspecifier2 obj = new Accessspecifier2(); 
        obj.display();  
		
	}
}

