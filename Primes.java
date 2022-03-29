
package primes;


public class Primes {

  
    public static void main(String[] args) {
    
    }
   
    public static int M(int n){
        if(n==0)return 4;
        return (int) (Math.pow(M(n-1), 2)-2);
    }
    
    public static boolean IsPrime(int n){
        if(n==2||n==3)return true;
        else{
            if(n%2==0||n%3==0)return false;
        for(int i=1;i<n-6;){
            i+=4;
            if(n%i==0)return false;
            i+=2;
            if(n%i==0)return false;
        }
        }
        return true;
    } 
}
