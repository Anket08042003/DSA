public class E169 {
    public static void main(String args[]){
        int num[]={2,2,1,1,1,2,2};
        int majority=majorityElement(num);
        System.out.println(majority);
    }
    public static int majorityElement(int num[]){
        int count=0;
        int majority=num[0];
        for(int i=0;i<num.length;i++){
            if(count==0){
                majority=num[i];
                count++;
            }
            else{
                count--;
            }
        }
        return majority;
    }
}
