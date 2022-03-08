import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
	    long f=1;
	    for(long i=1;i<=n;i++){
	        f=f*i;
	    }
		System.out.println("Factorial of a given number is "+ f);

	}

}
