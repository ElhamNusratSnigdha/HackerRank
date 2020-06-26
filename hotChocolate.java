package ExceptionsPractice;

import java.util.concurrent.TimeUnit;

public class hotChocolate {
    public static final double tooHot=185;
    public static final double tooCold=160;

    public static void drinkHotChocolate(double cocoaTemp) throws tooHotException,tooColdException{
        if(cocoaTemp>=tooHot){
            throw new tooHotException();
        }else if(cocoaTemp<=tooCold){
            throw new tooColdException();
        }
    }
    public static void main(String[] args) throws InterruptedException,tooColdException,tooHotException {
        double currentCocoaTemp=170;
        boolean wrongTemp=true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good");
                wrongTemp=false;
            } catch (tooHotException e1) {
                System.out.println("That is too hot.");
                currentCocoaTemp-=5;
            } catch (tooColdException e2) {
                System.out.println("That is so cold");
                currentCocoaTemp+=5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone.");
    }
}
