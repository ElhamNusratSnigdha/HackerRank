package Generics;

public class ArrayGenerics {

    public static <E> void printArray(E[] array){
        for(E element:array){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static <E> E[] passArray(E[] array){
        return array;
    }
    public static <E, T> E findIndexValue(E[] array1, T b){
        E value=null;
        for(Integer i=0;i<array1.length;i++){
            if(i==b){
                value=array1[i];
            }
        }
        return value;
    }
    public static <E, T> int findIndex(E[] array2, E a){
        int index=-1;
        for(Integer i=0;i<array2.length;i++){
            if(array2[i].equals(a)){
                index= i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Integer[] array1= {1, 9, 5, 7, 6, 2};
        String[] array2= {"Cloe", "Trixie", "Dan", "Ella", "Charlotte", "Lucifer", "Mazikeen", "Linda", "Amenadiel", "Charlie", "Eve", "Adam", "Clay", "God"};

        printArray(array1);
        printArray(array2);

        Integer[] array3= passArray(array1);
        printArray(array3);
        String[] array4= passArray(array2);
        printArray(array4);

        System.out.println("Index value from array1: "+findIndexValue(array1, 5));
        System.out.println("Index value from array2: "+findIndexValue(array2, 5));

        System.out.println("IndexValue from array3: "+findIndex(array3,7));
        System.out.println("IndexValue from array4: "+findIndex(array4,"Trixie"));
    }
}
