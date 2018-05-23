import java.util.Scanner;

public class CodeUp1928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		f(n);
	}
	public static void f(int n) {
		System.out.println(n);
		if(n==1) return;
		if(n%2==0) f(n/2);
		else f(3*n+1);
	}
}
