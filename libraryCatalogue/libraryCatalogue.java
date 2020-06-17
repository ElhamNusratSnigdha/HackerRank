package libraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class libraryCatalogue {

    //Properies,Fields,Global Variables
    Map<String,book> bookCollection = new HashMap<String, book>();
    int currentDay = 0;
    int lengthOfCheckedOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    //Constructors
    public libraryCatalogue(Map<String,book> collection){
        this.bookCollection = collection;
    }

    public libraryCatalogue(Map<String,book> collection,int lengthOfCheckedOutPeriod,double initialLateFee,double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckedOutPeriod=lengthOfCheckedOutPeriod;
        this.initialLateFee=initialLateFee;
        this.feePerLateDay=feePerLateDay;
    }

    //Getters
    public int getCurrentDay(){
        return this.currentDay;
    }
    public Map<String,book> getBookCollection(){
        return this.bookCollection;
    }
    public book getbook(String booktitle){
        return getBookCollection().get(booktitle);
    }
    public int getLengthOfCheckedOutPeriod(){
        return this.lengthOfCheckedOutPeriod;
    }
    public double getinitialLateFee(){
        return this.initialLateFee;
    }
    public double getfeePerLateDay(){
        return this.feePerLateDay;
    }

    //Setters
    public void nextDay(){
        currentDay++;
    }
    public void setDay(int day){
        currentDay = day;
    }

    //Instances Methods
    public void checkoutBook(String title){
        book Book = getbook(title);
        if(book.getisCheckedOut()){
            sorryBookAlreadyCheckedOut(Book);
        }else {
            book.setisCheckedout(true,currentDay);
            System.out.println("You just checked out "+title+". It is due on day "+(getCurrentDay()+getLengthOfCheckedOutPeriod()+"."));
        }
    }
    public void returnBook(String title){
        book Book = getbook(title);
        int dayLate = currentDay - (book.getDayCheckedOut()+getLengthOfCheckedOutPeriod());
        if (dayLate>0){
            System.out.println("You owe the library $"+(getinitialLateFee()+dayLate*getfeePerLateDay())+" because, your book is "+dayLate+" days overdue.");
        }else{
            System.out.println("Book returned. Thank you.");
        }
        book.setisCheckedout(false,-1);
    }
    public  void sorryBookAlreadyCheckedOut(book Book){
        System.out.println("Sorry, "+book.getTitle()+" is already checked out. It should be back on day "+(book.getDayCheckedOut()+getLengthOfCheckedOutPeriod())+".");
    }

    public static void main(String[] args) {
        Map<String,book> bookCollection = new HashMap<String, book>();
        book harry = new book("Harry Potter",51000,165468465);
        bookCollection.put("Harry Potter",harry);
        libraryCatalogue lib = new libraryCatalogue(bookCollection);
        lib.checkoutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.nextDay();
        lib.checkoutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkoutBook("Harry Potter");
    }
}
