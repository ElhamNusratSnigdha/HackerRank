package abstractClass;

public class dog extends animal{
    public dog(){
        super(15); //calling "abstractClass.animal"/superclass constructor
        System.out.println("A dog has been created");
    }

    //extended class has to override & implement the abstract method**must
    public void eat(){
        System.out.println("A dog is eating");
    }
    /* or,
    public abstract eat(); -->for next subset
     */

    //overriding [same method from superclass/parentClass]
    public void sleep(){
        System.out.println("A dog is sleeping");
    }
    public void ruff(){
        System.out.println("The dog says ruff");
    }

    public void run(){
        System.out.println("A dog is running");
    }
}
