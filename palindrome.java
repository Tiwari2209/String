public class palindrome {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) == str.charAt(n-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String name = "car";
        System.out.println(isPalindrome(name));
    }
}
