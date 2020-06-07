package JavaProgram;

public class SceondLargest {

	public static void main(String[] args) {
		
		int[] a= {9,5,2,7,4,8};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Second Largest element is " +a[1]);
	}

}
