import java.util.Scanner;

public class Lab1Application {

	
		public static void main(String[] args) {
	        int  x,y,a,b;
	        
	        
	        Scanner sc = new Scanner(System.in);
	      
	        System.out.println();
	        System.out.println("***************   The following code will Calculate the distance between 2 points entered:  ******************");
	        System.out.println();
	        
	      
	        
	        	System.out.print("Enter value for X:");
	        	x=sc.nextInt();
	        	
	        	System.out.print("Enter value for Y:");
	        	y=sc.nextInt();
	        	
	        	System.out.print("Enter value for A:");
	        	a=sc.nextInt();
	        	
	        	System.out.print("Enter value for B:");
	        	b=sc.nextInt();
	        	
	        	
	        	double d=DistanceCalculator.calculateDistance(x,y,a,b);
	        
	        	System.out.println("Distance between two points is "+d);
	        
	        System.out.println();
	        System.out.println("***************   The following code will Add, Subtract, Mutliply and Divide the 2 numbers entered:  ******************");
	        System.out.println();
	        
	       	System.out.print("Enter value first number:");
	       	a=sc.nextInt();
	       	System.out.print("Enter value for second number:");
	       	b=sc.nextInt();
	        
	       		BasicMath bMa=new BasicMath();
	       			double e=bMa.add(a,b);
	       			System.out.println("The sum of the 2 numbers is: "+e);
	        
	       				BasicMath bMs=new BasicMath();
	       				double f=bMs.subtract(a,b);
	       				System.out.println("The difference of the 2 numbers is: "+f);
	        
	       				BasicMath bMm=new BasicMath();
	       				double g=bMm.multiply(a,b);
	       				System.out.println("The product of the 2 numbers is: "+g);
	        
	       				BasicMath bMd=new BasicMath();
	       				double h=bMd.divide(a,b);
	       				System.out.println("The quotient of the 2 numbers is: "+h);
		
	        
	        
	        System.out.println();
	        System.out.println("***************   The following code will identify a leap year:  ******************");
	        System.out.println();
	        
	        System.out.print("Enter the 4 digit year you want to check: ");
	        a=sc.nextInt();
	        
	        	DateManipulator dTe=new DateManipulator();
	        	boolean a1=dTe.isLeapYear(a);
	        
	        		if(a1==true) 
	        		{
	        			System.out.print(+a);
	        			System.out.println(" is Leap year");
	        		}
	        		else
	        		{
	        			System.out.print(+a);
	        			System.out.println(" is Not a leap year");
	        		}
		
	        System.out.println();
   	        System.out.println("***************   The following code will identify are and permiter of a rectangle:  ******************");
	        System.out.println();
	        		
	        		
	        		
	        	System.out.print("Enter value for length of rectangle:");
	   	       	x=sc.nextInt();
	           	System.out.print("Enter value for width of rectangle:");
	   	       	y=sc.nextInt();	
	        		
	        		Rectangle  area= new Rectangle(x,y);
	        		int a2=area.calculateArea();
	        		
	        		Rectangle  perm= new Rectangle(x,y);
	        		int p1=perm.calculatePerimeter();
	        		
	        		
	        		System.out.println();
	        		System.out.println("The area of the rectangle is "+a2);
	        		System.out.println();
	        		System.out.println();
	        		System.out.println("The area of the perimemter is "+p1);
	        		System.out.println();
	        		
	        		
	        		
	        		sc.close();
	
		
		}
		
		
	
		
		

}
