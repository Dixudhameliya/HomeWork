import java.util.Scanner;

public class FirstArraycase {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter totalnumbers of array:");
		int totalnumbers=sc.nextInt();
		int numbers[]=new int[totalnumbers];
		
		for(int i=0;i<totalnumbers;i++) {
			System.out.println("Enter number:"+(i+1));
			int value=sc.nextInt();
			numbers[i]=value;
			}
		int maxNumber=findMaxNumber(numbers);
		System.out.println("maxNumber is:"+maxNumber);
		
		int minNumber=findMinNumber(numbers);
		System.out.println("minNumber is:"+minNumber);
		
		int sum=findSumOfNumber(numbers);
		System.out.println("Sum of Numbers is:"+sum);
		
		System.out.println("avg of Numbers is:"+sum/totalnumbers);
		
		int secondHighestNumber=findSecondHighestNumber(numbers);
		System.out.println("Second highest number is:"+secondHighestNumber);
		
		int Number=findEvenNumber(numbers);
		
		
	}  
		public static int findMaxNumber(int numbers[]) {
			int maxNumber=0;
			for(int number:numbers) {
				if(maxNumber<number) {
					maxNumber=number;
				}
			}return maxNumber;
			
		}
		
		public static int findMinNumber(int numbers[]) {
			int minNumber=numbers[0];
			for(int number:numbers) {
				if(minNumber>number) {
					minNumber=number;
				}
			}return minNumber;
		
	}
		public static int findSumOfNumber(int numbers[]) {
			int sum=0;
			for(int number:numbers) {
				sum=sum+number;
			}return sum;		
			
		}
		
		public static int findSecondHighestNumber(int numbers[]) {
			int highest=0;
			int secondHighestNumber=highest;
			for(int number:numbers) {
				if(number>highest) {
					secondHighestNumber=highest;
				highest=number;
				}
				else if (number>secondHighestNumber) {
				secondHighestNumber=number;}
			}return secondHighestNumber;
		}
		public static int findEvenNumber(int numbers[]) {
			int Number=0;
			for(int number:numbers) {
				if((number%2)==0) {
					System.out.println("Even number is:"+number);
					
				}
			}
				
			return Number;	
		}
}
		
		




