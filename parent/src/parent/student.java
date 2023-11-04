package parent;

public class student extends person{
	int height;
	
	 void inheritence () {
	
	System.out.println (height+" "+age+" "+name); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student heritence = new student ();
		heritence.height = 6;
		heritence.age = 19;
		heritence.name= "nam";
		heritence.inheritence ();
	}

}