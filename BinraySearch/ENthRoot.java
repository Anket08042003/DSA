import java.util.Scanner;

class ENthRoot{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.println("Enter digit");
        double digit = m.nextDouble();

        System.out.println("Enter root to find");
        double root = n.nextDouble();

        double ans = letsFind(digit, root);
        System.out.println("Result: " + ans);

    }
    public static double letsFind(double m, double n){
        double low=1;
        double high=m;
        double diff=1e-6;
        while((high-low)>diff){
            double mid=(high+low)/2.0;
            if(ans(mid, n)>m){
                high=mid;
            }
            else{
                low=mid;
            }
        }
        return high;
    }
    public static double ans(double mid, double n){
        while(n>1){
            mid=mid*mid;
            n--;
        }
        return mid;
    }
}