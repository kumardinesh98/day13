package uc2;

public class MaximumNumber {
	public double findMax(double x, double y, double z) {
		if(x > y && x > z) {
			return x;
		}
		if(y > x && y > z) {
			return y;
		}
		if(z > x && z > y) {
			return z;
		}

		return 0;
	}
	
	public static void main(String[] args) {
		double x = 6.6;
		double y = 4.5;
		double z = 89.9;
		MaximumNumber max = new MaximumNumber();
		System.out.println(max.findMax(x, y, z));
		
	}
}
