package BinarySearchTree;

public interface Tree<D extends Comparable> {
    public boolean inEmpty();
    public int cardinality();
    public boolean number(D elt);
    public NonEmptyBST<D> add(D elt);

    boolean member(D elt);
}
