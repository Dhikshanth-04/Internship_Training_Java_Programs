public class MockAnagram {
    public static void main(String[] args){
        String str1 = "army";
        String str2 = "mary";
        str1.toLowerCase();
        str2.toLowerCase();
        int[] freq = new int[256];
        if(str1.length()!=str2.length()){
            System.out.print("not");
            return;
        }
        for(int i=0;i<str1.length()-1;i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for(int count :freq){
            if(count!=0){
                System.out.print("not ");
                return;
            }
        }
        System.out.print("Anagram");
    }
}
