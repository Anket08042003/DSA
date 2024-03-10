public class EDay1GeeksIMP {
    public static void main(String args[]){
        
        System.out.println(smallestSubstring("01212"));
    }
    public static int smallestSubstring(String s) {
        // Code here
        if(s.length()==0 || s.length()<3){
            return -1;
        }
        int count=0;
        int count0=1;
        int count1=1;
        int count2=1;
        for(int i=0;i<s.length();i++){
            if(count0!=0 && s.charAt(i)=='0'){
                count0--;
            }
            if(count1!=0 && s.charAt(i)=='1'){
                count1--;
            }
            if(count2!=0 && s.charAt(i)=='2'){
                count2--;
            }
            if(count0==0 && count1==0 && count2==0){
                count++;
                break;
            }
            count++;
        }
        return count;
    }
}
