public class Recursion {
    //5+4+3+2+1; 2+1; 1;

    public static int summation(int n){
        //base case
        if(n==0) return 0;
        //recursive case: 3+2+1+0
        else return n+summation(n-1);
    }
    public static int Factorial(int n){
        //base case:
        if(n==1) return 1;
        //recursive case: 3*2*1
        else return n*Factorial(n-1);
        /*
        Factorial(3)
        3*Factorial(2)
        3*2*Factorial(1)
        3*2*1
        = 6
         */
    }

    public static int Exponentiation(int n, int p){
        //base-case
        if(p==0) return 1;
        //recursive case
        else return n*Exponentiation(n,p-1);
        /*
        Exp(3,2)
        3*Exp(3,1)
        3*3*Exp(3,0)
        3*3*1 = 9
         */
    }

    public static int nTimesK(int n,int k){
        System.out.println("n: "+n+" k: "+k);
        if (n>1) return k+nTimesK(n-1,k);
        else return k;
    }
    public static void main(String[] args) {
        System.out.println("Summation: "+summation(3));
        System.out.println("Factorial: "+Factorial(3));
        System.out.println("Exponentiation: "+Exponentiation(3,2));
        System.out.println("Result of mnTimesK is: "+nTimesK(4,4));
    }
}
