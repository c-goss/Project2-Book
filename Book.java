/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber = "";
    private int pages;
    private int borrowed = 0;
    private final boolean courseText;
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numOfPages, boolean courseRequired)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numOfPages;
        this.courseText = courseRequired;
    }
    
    /**
     * Increments the amount of times the book has been borrowed
     */
    public void borrow()
    {
        borrowed++;
    }
    
    /**
     * Sets the reference number
     * @param the reference number
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() < 3)
        {
            System.out.println("ERROR: Reference number cannot be less than 3 digits "
            + "long. Number not saved.");
        } else {
            refNumber = ref;
        }
    }
    
    /**
     * Returns the amount of times the book has been borrowed
     * @return Number of times the book has been borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * Returns the reference number
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Returns the author
     * @return the book's author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Returns the title
     * @return the book's title
     */
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /**
     * Prints the author's name
     */
    public void printAuthor()
    {
        System.out.print(author);
    }
    
    /**
     * Prints the book title
     */
    public void printTitle()
    {
        System.out.print(title);
    }
    
    /**
     * Print the book's title, author, and number of pages
     */
    public void printDetails()
    {
        System.out.println("Title:\t" + title);
        System.out.println("Author:\t" + author);
        System.out.println("Pages:\t" + pages);
        System.out.print("Reference Number:\t");
        if (refNumber.length() > 0){
            System.out.print(refNumber); 
        } else {
            System.out.print("ZZZ");
        }
        System.out.println();
        System.out.println("Number of Times Borrowed:\t" + borrowed);
    }
    
    
}
