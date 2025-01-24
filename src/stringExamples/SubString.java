package stringExamples;

public class SubString {

//    public static String substring(String str,int si,int ei){
//        String substr="";
//        for(int i=si;i<ei;i++){
//            substr=substr+str.charAt(i);
//        }
//        return substr;
//    }
    public static void main(String[] args) {
        String str="Mohammad Abdul Rab";
        String substring=(str.substring(0,16));
        System.out.println(substring);
        //System.out.println(substring(str,0,5));
    }
}
