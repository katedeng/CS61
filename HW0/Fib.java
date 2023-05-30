public class Fib {
    public static int fib(int n){
        int[] fibList = new int[n+1];
        fibList[0] = 0;
        fibList[1] = 1;
        for (int i = 2;i<n+1;i++){
            fibList[i]=fibList[i-1]+fibList[i-2];
        }
        return fibList[n];
    }
    public static int fib1(int n){
        if(n<=1){
            return n;
        }else{
            return fib1(n-1)+fib1(n-2);
        }
    }
    public static int fib2(int n,int k,int f0,int f1){
        if(n==k){
            return f0;
        }else{
            return fib2(n,k+1,f1,f0+f1);
        }
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(fib(n));
        System.out.println(fib1(n));
        System.out.println(fib2(n,0,0,1));
    }
}
