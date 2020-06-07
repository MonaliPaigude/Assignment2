
	package JavaProgram;

	

	public class ChildClass extends ParentClass {
		double radius=5;
	
		public static void main(String[] args) {
		      ChildClass obj=new ChildClass();
		         obj.AreaSquare();//parent
		         obj.AreaCircle();//child
		      
		     
		    
}

				

	     public void AreaCircle() {
	    	    //Super();
				double area;
				
				area= Math.PI*super.radius*super.radius;
				System.out.println("Area of Circle is" +area);
				System.out.println("Super Class Radius" + super.radius);
				
			}

}
