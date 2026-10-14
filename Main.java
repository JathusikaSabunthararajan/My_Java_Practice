public class Main{
	public static void main(String[] args){
		int[] numbers = {45, 12, 98, 33, 27};
		
		int max = numbers[0];
		int min = numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(max<=numbers[i]){
				max=numbers[i];
			}
			if(min>=numbers[i]){
				min=numbers[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}
}