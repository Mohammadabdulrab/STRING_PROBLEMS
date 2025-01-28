package stringExamples;
import java.util.Scanner;
public class FindIndexOfCharacter {

//    public static int returnIndex(String str){
//        int index=-1;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)=='r'){
//                index=i;
//            }
//        }
//        return index;
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str.indexOf('r'));
//        System.out.println(returnIndex(str));


    }
}
