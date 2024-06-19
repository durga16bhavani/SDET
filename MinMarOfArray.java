package javaprograms;

public class MinMarOfArray {
	
	public int max(int [] array) {
		int max=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	public int min(int [] array) {
		int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] myArray= {23,92,43,89,97};
		MinMarOfArray obj=new MinMarOfArray();
		System.out.println("Maximum value in aray is:"+obj.max(myArray));
		System.out.println("Maximum value in aray is:"+obj.min(myArray));

	}

}
