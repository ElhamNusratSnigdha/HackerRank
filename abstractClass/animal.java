package abstractClass;

public abstract class animal {
    private int age;

    public animal(int age) {
        this.age = age;
        System.out.println("An Animal has been created");
    }

    public abstract void eat() ;

    public void sleep(){
        System.out.println("An animal is sleeping");
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        //Casting
        Object Dog = new dog();
        dog realDog = (dog) Dog;
        realDog.ruff();

        //Examples
        Object str = "est";
        String realS = (String) str;
        realS.getBytes();

        //what happens when..
        dog doggy = new dog();
        if(doggy instanceof animal){
            animal Animal = (animal) doggy;
            Animal.sleep();

        }
        doggy.sleep();
    }
}