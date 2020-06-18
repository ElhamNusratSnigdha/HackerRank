package Animal;

public class dog extends animal{
    public dog(){
        super(15); //calling "animal"/superclass constructor
        System.out.println("A dog has been created");
    }

    public void ruff(){
        System.out.println("The dog says ruff");
    }

    public void run(){
        System.out.println("A dog is running");
    }
}
