package stringExamples;

public class CountVowels {

    public static int numberOfVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                count++;
            }
            if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Sabina is in B Com";
        System.out.println(numberOfVowels(str));
    }
}
