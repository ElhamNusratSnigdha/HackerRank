import java.util.Random;
import java.util.Scanner;
public class MadLibs {

    Scanner ens = new Scanner(System.in);

    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    //Getters
    public String getStory(){
        return story;
    }
    public String getName(){
        return name;
    }
    public String getAdjective1(){
        return adjective1;
    }
    public String getAdjective2(){
        return adjective2;
    }
    public String getNoun1(){
        return noun1;
    }
    public String getNoun2(){
        return noun2;
    }
    public String getNoun3(){
        return noun3;
    }
    public String getAdverb(){
        return adverb;
    }
    public String getRandomNums(){
        return randomNums;
    }


    //Setters
    public void setStory(String newStory){
        this.story = newStory;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setAdjective1(String newAd1){
        this.adjective1 = newAd1;
    }
    public void setAdjective2(String newAd2){
        this.adjective2 = newAd2;
    }
    public void setNoun1(String newNoun1){
        this.noun1 = newNoun1;
    }
    public void setNoun2(String newNoun2){
        this.noun2 = newNoun2;
    }
    public void setNoun3(String newNoun3){
        this.noun3 = newNoun3;
    }
    public void setAdverb(String newAdv){
        this.adverb = newAdv;
    }

    public void setRandomNums(){
        int num = Math.abs(rand.nextInt())%100;
        int index = 0;
        int[] numberHolder = new int[3];
        while(index<numberHolder.length){
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not "+numberHolder[0]+", not"+numberHolder[1]+", but "+numberHolder[2];
    }

    // Print Instructions to player
    public void printInstructions(){
        System.out.println("Welcome to the MadLibs game. If you type in"+
                "words, we'll give you a story. Start by typing in a name");
    }

    //Get Data from Player
    public void enterName(){
        setName(ens.nextLine());
    }
    public void enterNoun1(){
        System.out.println("Give me a noun!");
        setNoun1(ens.nextLine());
    }
    public void enterNoun2(){
        System.out.println("Give me another noun!");
        setNoun2(ens.nextLine());
    }
    public void enterNoun3(){
        System.out.println("Give me the last noun!");
        setNoun3(ens.nextLine());
    }
    public void enterAdjective1(){
        System.out.println("Give me an adjective");
        setAdjective1(ens.nextLine());
    }
    public void enterAdjective2(){
        System.out.println("Give me an another adjective");
        setAdjective2(ens.nextLine());
    }
    public void enterAdverb(){
        System.out.println("Give me an adverb");
        setAdverb(ens.nextLine());
    }

    public void putTogetherTheStory(){
        String story;
        int num = Math.abs(rand.nextInt())%2;
        if (num==0){
        story = "Jesse and her best friend "+getName()+" went to Disney World today! "
                +"They saw a "+getNoun1()+" in a show at the Magic Kingdom "
                +"and ate a "+getAdjective1()+" feast for dinner. The next day, I"
                +" ran "+getAdverb()+" to met Mickey Mouse in his "+getNoun2()
                +" and then, that night I gazed at the "+getRandomNums()+" "
                +getAdjective2()+" fireworks shooting from the "+getNoun3()+".";
        }else{
            story = "Amanda and her frenemy "+getName()+" went to the zoo last summer. "
                    +"The saw a huge "+getNoun1()+" and a tiny little "+getNoun2()
                    +". That night, they decided to climb "+getAdverb()+" into the "
                    +getNoun3()+" to get a closer look. "+"The zoo was "+getAdjective1()
                    +" at night, but they didn't care... until"+getRandomNums()+" "
                    +getAdjective2()+" apes yelled in their faces, making "+"Ananda and "+getName()+" sprint all the way back home.";
        }
        setStory(story);
    }

    public void play(){
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }
}
