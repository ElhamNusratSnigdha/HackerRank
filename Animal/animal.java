package Animal;

public class animal {

    private int age; //vs public int age;

    public animal(int age){
        this.age=age;
        System.out.println("An Animal has been created");
    }

    public void eat(){
        System.out.println("An animal is hungry");
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        animal a =new animal(5);
        dog d = new dog();
        cat c = new cat();
        d.ruff();
//        System.out.println(d.age); //with public int age
        System.out.println(d.getAge()); //with private
        c.meow();
//        System.out.println(c.age); //with public int age
        System.out.println(c.getAge()); //with private
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();

        /*
        what happens if..
        animal ad = new dog();
        a subclass can be generalized to a superclass
        dog da = new animal(3);
        a superclass can not become a more specific subclass
        */

        /*
        Object (SuperCLass) = animal
        animal (SuperClass) = dog, cat
         */
    }
}
