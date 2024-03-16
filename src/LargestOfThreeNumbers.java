
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		
		largestNumber();
		
	}
		
		public static void largestNumber(){
		
		
		int a=10, b=20, c=30;
		
		int largest1 = a>b?a:b;
		
		
		int largest2 = largest1>c?largest1:c;
		
		System.out.println(largest2);
		
		}
	}


