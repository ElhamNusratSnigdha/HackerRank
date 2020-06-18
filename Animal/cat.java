package Animal;

public class cat extends animal{
    public cat(){
        super(7);
        System.out.println("A cat has been created");
    }

    public void meow(){
        System.out.println("A cat meow");
    }

    public void prance(){
        System.out.println("A cat is prancing");
    }
}
