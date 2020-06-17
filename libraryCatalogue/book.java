package libraryCatalogue;

public class book {
    //Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //whether or not the book is checked out
    int dayCheckedOut=-1;

    //Constructors
    public book(String bookTitle,int bookPageCount,int bookISBN){
        this.title=bookTitle;
        this.pageCount=bookPageCount;
        this.ISBN=bookISBN;
        isCheckedOut=false;
    }

    //Getters ---->instance values
    public String getTitle(){
        return this.title;
    }
    public int getPageCount(){
        return this.pageCount;
    }
    public int getISBN(){
        return this.ISBN;
    }
    public boolean getisCheckedOut(){
        return this.isCheckedOut;
    }
    public int getDayCheckedOut(){
        return this.dayCheckedOut;
    }

    //Setters
    public void setisCheckedout(boolean newIsCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut=newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){
        this.dayCheckedOut=day;
    }
}
