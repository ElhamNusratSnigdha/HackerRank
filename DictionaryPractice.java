import java.util.HashMap;
import java.util.Map;
public class DictionaryPractice {

    public String printIt(String s, Map a){
        String z = (String) a.get(s);
        if(z==null){
            return "'"+s+"'"+", I do not know, please tell me in French.";
        }
        else return z;
    }

    //shoplist is empty or not
    public void listEmptyOrNot(Map a){
        if (a.isEmpty()==true){
            System.out.println("Yes. ^_^");
        }
        else System.out.println("No :(");
    }

    public static void main(String[] args) {
        //English to French Dictionary
        //key(the word)=value(translation)
        Map<String,String> engToFrench = new HashMap<String,String>();

        //putting words into dictionary
        engToFrench.put("Saturday","Samedi");
        engToFrench.put("Sunday","Dimanche");
        engToFrench.put("Monday","Lundi");
        engToFrench.put("Tuesday","Mardi");
        engToFrench.put("Wednesday","Mercredi");
        engToFrench.put("Thursday","Jeudi");
        engToFrench.put("Friday","Vendredi");


        //printing word-meaning from dictionary
        System.out.println("'Monday' in French is: "+engToFrench.get("Monday"));
        System.out.println();


        DictionaryPractice d = new DictionaryPractice();
        System.out.println(d.printIt("Hello",engToFrench));
        System.out.println();


        //printing all the keys/words & values/meanings
        System.out.println(engToFrench.keySet()+": "+engToFrench.values());
        System.out.println();


        //print out the size
        System.out.println("The size of out dictionary is: "+engToFrench.size());
        System.out.println();
        System.out.println();

        //The Shopping List
        Map<String,Boolean> shopList = new HashMap<String, Boolean>();

        //Put some stuff in list
        shopList.put("Banana",true);
        shopList.put("Bread", Boolean.TRUE);
        shopList.put("Chocolate",true);
        shopList.put("Eggs",false);
        shopList.put("Sugar", Boolean.FALSE);

        System.out.println("In Shoplist: ");
        //Retrieving the items
        System.out.println("Do I need to buy 'Banana'? "+shopList.get("Banana"));
        System.out.println("Do I need to buy 'Eggs'? "+shopList.get("Eggs"));
        System.out.println("Do I need to buy 'Sugar'? "+shopList.get("Sugar"));
        System.out.println();

        //Key-value Pairs Printout
        System.out.println(shopList.toString());
        //shoplist is empty or not
        System.out.println("Is my list Empty? ");
        d.listEmptyOrNot(shopList);
        System.out.println();

        //removing a item from list
        shopList.remove("Eggs");
        System.out.println("After removing Eggs from thelist");
        System.out.println(shopList.toString());
        System.out.println();

        //Replacing value for a certain key
        shopList.replace("Bread",Boolean.FALSE);
        System.out.println("After replacing Bread's value");
        System.out.println(shopList.toString());
        System.out.println();

        //Clear our List
        shopList.clear();
        System.out.println("What do I have left? "+shopList.toString());
        System.out.println("Is my list Empty? ");
        d.listEmptyOrNot(shopList);
    }
}
