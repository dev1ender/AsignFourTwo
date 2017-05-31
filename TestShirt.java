

class Shirt{
	private int collarSize;
	private int sleeveLen;
	private String material;
	
	//count is used to record the no of shirt
	private static  int Count; //method will not be static but variable can
	
	
	//defination of getter and setter for private variable
	public int getCount() {
		return ++Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getCollarSize() {
		return collarSize;
	}
	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}
	public int getSleeveLen() {
		return sleeveLen;
	}
	public void setSleeveLen(int sleeveLen) {
		this.sleeveLen = sleeveLen;
	}

	//parameterized counstructor used to set the values of sleeve length and collar size of a each shirt
	public Shirt(int colsize,int slvLen){
		this.setCollarSize(colsize);
		this.setSleeveLen(slvLen);
		material="Cotton";
	}
	
	//method to print the shirt material of each shirt
	public void ShirtMaterial(){
		System.out.println("The Material is "+material);
	}
	
	//Default constructor is defined
	public Shirt(){
		this.setSleeveLen(10);
		this.setCollarSize(5);
		this.setMaterial("Cotton");
		setCount(0);
	}
	
	//allshirt method is used to print the constraints of each shirt
	public void allShirt(){
	 
	System.out.println("Shirt "+getCount()+":");	
	ShirtMaterial();
	System.out.println("Sleeve Length :"+ this.getSleeveLen()+"  Collar Size :"+this.getCollarSize());
	System.out.println();
	}
	
}


public class TestShirt {

	public static void main(String[] args) {
		Shirt s1= new Shirt();		
		Shirt s2= new Shirt(7,10);
		Shirt s3= new Shirt(5,20);
		s1.allShirt();
		s2.allShirt();
		s3.allShirt();
		
		
		
		
	}

}
