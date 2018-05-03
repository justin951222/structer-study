import java.util.Scanner;

public class Codeup2016 {
	public static void main(String[] args) {
		int n;
		String data;
		char[] Stack = new char[267];
		int top = -1;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		data = sc.next();
		
		for(int i=0; i<n; i++) {
			if(i % 3 == 0 && i != 0)
				Stack[++top] = ',';
			Stack[++top] = data.charAt(n-i-1);
		}
		while(top>-1)
			System.out.print(Stack[top--]);
	}
}
