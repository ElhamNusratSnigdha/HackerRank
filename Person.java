package person;
//import static person.HairColor.BLONDE;
//import static person.HairColor.BLACK;
import static person.HairColor.*;
public class Person {
    HairColor hairColor=BLACK;
    public Person(){

    }
    public static void main(String[] args) {
        Person peterParker =new Person();
        Person spiderMan = peterParker;

        spiderMan.hairColor=PINK;
        System.out.println("Hair color of Peter Parker: "+peterParker.hairColor);
        System.out.println("Hair color of Spiderman: "+spiderMan.hairColor);
    }
}
