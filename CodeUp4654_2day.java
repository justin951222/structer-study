import java.util.Scanner;

public class CodeUp4654_2day {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		int top = -1;
		for(int i=0; i<n; i++) data[++top] = sc.nextInt();
		
		do{
			int save = data[top--];
			int i=1;
			while(data[top]<save) { 
				i++; 
				top--;
				if(top == -1) break;
			}
			for(int j=1; j<=i; j++) data[top+j] = top+1;
		} while(top>0);
		data[0] = 0;
		for(int i=0; i<n; i++) System.out.print(data[i] + " ");
		System.out.println();
	}
}
