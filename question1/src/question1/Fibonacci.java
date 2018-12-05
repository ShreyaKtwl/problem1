package question1;

public class Fibonacci {
	
	int a = 1, b = 2, c, i = 0, sum = 2;
	
	
	public void calc(){

		System.out.println(a);
		System.out.println(b);
		
		while(sum<4000000)
		{
			
			c = a + b;
			System.out.println(c);
			
			a=b;
			b=c;
			
			
			
			if(c%2==0){
				sum=sum + c;
			}
			
		};
	
		System.out.println("Sum of even numbers= " + sum);
	}
	

}
	


