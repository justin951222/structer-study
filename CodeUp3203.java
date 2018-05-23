import java.util.Scanner;
 
public class CodeUp3203 {
    static char[] T;
    public static void main(String[] args) {
        String tree;
        Scanner sc = new Scanner(System.in);
        tree = sc.nextLine();
        T = new char[tree.length()+1];
        for(int i=1; i<T.length; i++) T[i] = (char)tree.charAt(i-1);
        postorder(1);
    }
    public static void postorder(int now) {
        if(now>=T.length) return;
        postorder(2*now);
        postorder(2*now+1);
        System.out.print(T[now]);
    }
}
 