package week1.day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range= 8;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=2;i<=range;i++)
		{
		sum= firstNum + secNum;
		System.out.println(sum);
		firstNum=secNum;
		secNum=sum;
		
		}
		
		
		
	}
	

}
