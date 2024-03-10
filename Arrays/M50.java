public class M50 {
    public static void main(String args[]){
        double x=2.00000;
        int n=-2147483648;
        double ans=myPow(x, n);
        System.out.println(ans);
    }
    public static double myPow(double x,int n){
        double ans=1.0;
        boolean flag=false;
        if(n<0) {
            n=-n;
            flag=true;
        } 
        while(n>0){
            if(n%2==0){
                x=x*x;
                n=n/2;
            }
            else{
                ans=ans*x;
                n=n-1;
            }
        }
        if(flag==true) ans=(double)1.0/(double)ans; 
        return ans;
    }
}
