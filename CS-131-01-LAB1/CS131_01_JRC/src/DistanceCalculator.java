



public class DistanceCalculator {

	public DistanceCalculator() {
		
	}//end empty argument constructor
	
	public static double calculateDistance(int x, int y, int a, int b) 
	{
		double distance=Math.sqrt(Math.pow((x-a),2)+Math.pow((y-b),2));
		
		return distance;
        
		
		
	}//end calculateDistance
	
	
	
}//end class
