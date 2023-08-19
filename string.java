public class string {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static String subString(String str, int si, int ei){
        String subStr = " ";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));
    }
}
