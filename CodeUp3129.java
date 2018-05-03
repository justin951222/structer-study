import java.util.Scanner;

public class CodeUp3129 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String data = sc.next();
		int i=0;
		int top = -1;
		for(;i<data.length(); i++) {
			if('(' == data.charAt(i)) top++;
			else top--;
			if(top == -2) {
				System.out.println("bad");
				return;
			}
		}
		if(top == -1)
			System.out.println("good");
		else
			System.out.println("bad");
	}
}
