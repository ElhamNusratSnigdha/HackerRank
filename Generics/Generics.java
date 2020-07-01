package Generics;

public class Generics implements Comparable{

    //comparing instances a & b
    public static <T extends Comparable <T>> T findMax(T a, T b){
        int n=a.compareTo(b);
        System.out.println("n: "+n);
        if (n<0){
            return b;
        }else return a;
    }

    public static void main(String[] args) {

        System.out.println(findMax(2,3));
        System.out.println(findMax(3,3));
        System.out.println(findMax(3,2));
        System.out.println(findMax(2.0,3.0));
        System.out.println(findMax('a','b'));
        System.out.println(findMax("hello","there"));


        Generics k = new Generics();
        System.out.println(findMax(k,k));
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
