package stringExamples;

public class LastIndexOfCharacter {

    public static int lastIndex(String str){
        int li=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='a'){
                li=i;
                break;
            }
        }
        return li;
    }
    public static void main(String[] args) {
        String str="mohammad abdul rab";
        System.out.println(str.lastIndexOf('a'));
        System.out.println(lastIndex(str));

    }
}
