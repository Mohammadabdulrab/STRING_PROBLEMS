import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        toggleCase(n, str);
    }
    static void toggleCase(int n, String str) {
        // your code here
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            else if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}

