package StarWarsInterfacePractice;

import java.util.Random;

public class StarWarsInterfacePractice {
    public static Character summomCharacter(){
        Random rand = new Random();
        if(Math.abs(rand.nextInt())%2==0){
            return new Enemy();
        }else {
            return new Hero();
        }
    }
    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero Obi_Wan_Kenobi = new Hero();
        darthVader.attack();
        Obi_Wan_Kenobi.attack();
        darthVader.heal();
        Obi_Wan_Kenobi.heal();
        System.out.println("Enemy weapon: "+darthVader.getWeapon());
        System.out.println("Hero weapon: "+Obi_Wan_Kenobi.getWeapon());
        System.out.println();
        Character spy = summomCharacter();
        spy.attack();
        spy.heal();
    }
}
