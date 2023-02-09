public class javastring7 {
    public static void main(String args[]){
        String s1="vardhan";
        String s2="vvardhan";
        String s3="VARDHAN";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
}
}
