import java.util.Scanner;

public class CodeUp1675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Caeser = sc.nextLine();
		for(int i=0; i<Caeser.length(); i++) {
			if((Caeser.charAt(i)>'d' && Caeser.charAt(i)<'z')||(Caeser.charAt(i)>'D' && Caeser.charAt(i)<'Z'))
				System.out.print((char)(Caeser.charAt(i)-'d' + 'a'));
			else if((Caeser.charAt(i)>'a' && Caeser.charAt(i)<'c')||(Caeser.charAt(i)>'A' && Caeser.charAt(i)<'C'))
				System.out.print((char)(Caeser.charAt(i)-'d' + 'a'));
			else
				System.out.print(Caeser.charAt(i));
		}
	}
}
