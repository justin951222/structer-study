import java.util.Scanner;

public class CodeUp3117 {
	public static void main(String[] args) {
		int[] Stack = new int[100000];
		int top = -1;
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int data = sc.nextInt();
			if (data == 0)
				top--;
			else
				Stack[++top] = data;
		}
		int sum = 0;
		while (top > -1)
			sum += Stack[top--];
		System.out.println(sum);
	}
}
