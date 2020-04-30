public class StandardDeviation{
	public static void main(String []args){
		double[]arr = new double[args.length];
        	String s = "";
		for(int i = 0; i<args.length; i++){
			if(i != args.length-1){
				s += args[i]+", ";
			}
			else if (i == args.length-1){
				s +="and "+args[i];
			}
			arr[i] = Double.parseDouble(args[i]);
		}
		double dev = stddev(arr);
		System.out.print("The standard deviation of "+s+"is "+dev);
	}
		
	public static double stddev(double... nums){
		int count = 0; 
		double sum = 0.0; 
		double stdv = 0.0;
		for(double add : nums){ 
			sum += add; count ++;
		}

		double mean = sum/count; 

		for(double add: nums){
			stdv += Math.pow(add  - mean, 2);	
		}
		return Math.sqrt(stdv/count);
	}
}
