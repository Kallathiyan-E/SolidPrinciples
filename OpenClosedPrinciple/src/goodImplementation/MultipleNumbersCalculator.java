package goodImplementation;

public class MultipleNumbersCalculator extends BaseOperation{
	
	public int add(int...numbers) {
		int sum=0;
		for(int i:numbers) {
			sum+=i;
		}
		return sum;
	}
	public int subtract(int...numbers) {
		int sum=0;
		for(int i:numbers) {
			sum-=i;
		}
		return sum;
	}
	
	public int multiply(int...numbers) {
		int product=1;
		for(int i:numbers) {
			product*=i;
		}
		return product;
	}
	
	public int divide(int...numbers) {
		int divide=1;
		for(int i:numbers) {
			if(i==0)
				System.out.println("Numbers can't divide by Zero");
			else
				divide/=i;
		}
		return divide;
	}
	
}
