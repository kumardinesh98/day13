package uc3;

public class MaximumNumber< T extends Comparable<T>> {
	public T findMax(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) >= 1) {
			max = y;
		}
		if(y.compareTo(max) >= 1) {
			max = y;
		}
		return max;
	}
	
	public static void main(String[] args) {
		String x = "java";
		String y = "python";
		String z = "c++";
		MaximumNumber<String> max = new MaximumNumber<String>();
		System.out.println(max.findMax(x, y, z));
		
	}

}
