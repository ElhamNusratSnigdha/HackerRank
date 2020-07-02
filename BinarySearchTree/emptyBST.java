package BinarySearchTree;

public class emptyBST<D extends Comparable> implements Tree<D>{
    public emptyBST(){

    }
    public boolean isEmpty(){
        return true;
    }

    @Override
    public boolean inEmpty() {
        return false;
    }

    public int cardinality(){
        return 0;
    }

    @Override
    public boolean number(D elt) {
        return false;
    }

    public boolean member(D elt){
        return false;
    }
    public NonEmptyBST<D> add(D elt){
        return new NonEmptyBST<D>(elt);
    }
}
