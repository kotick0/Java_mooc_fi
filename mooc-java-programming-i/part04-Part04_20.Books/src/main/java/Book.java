public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String initTitle, int initPages, int initPubYear) {
        this.title = initTitle;
        this.pages = initPages;
        this.publicationYear = initPubYear;
    }

    public String getTitle() {
        return this.title;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
   
}
