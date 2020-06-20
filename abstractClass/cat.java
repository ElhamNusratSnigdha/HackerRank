package abstractClass;

public class cat extends animal{
    public cat(){
        super(7);
        System.out.println("A cat has been created");
    }
    public void eat(){
        System.out.println("A cat is eating");
    }
    public void meow(){
        System.out.println("A cat meow");
    }

    public void prance(){
        System.out.println("A cat is prancing");
    }

    public void sleep(){
        System.out.println("A cat is sleeping");
    }
}
