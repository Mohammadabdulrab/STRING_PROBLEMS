package stringExamples;

import java.util.Scanner;
public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(countWords(s));
            t--;
        }
    }

    public static int countWords(String s) {
        // your code here
        s=s.trim();

        int count=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) != ' '){
                continue;
            }
            count++;
            while(s.charAt(i)==' '){
                i++;
            }
        }
        return count+1;
    }
}

