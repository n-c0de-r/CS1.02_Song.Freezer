/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author n-c0de-r
 * @version 2021.07.21
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    /**
     * Get the book's author's name.
     * @return	The name of this book's author.
     */
    public String getAuthor()
    {
    	return author;
    }
    
    /**
     * Get the book's number of pages.
     * @return	The pages count of this book.
     */
    public int getPages()
    {
    	return pages;
    }
    
    /**
     * Get the book's title.
     * @return	The title of this book.
     */
    public String getTitle()
    {
    	return title;
    }
    
    /**
     * Prints all the details of the book.
     */
    public void printDetails()
    {
    	//Calls all the following methods, that deal with the details.
    	printAuthor();
    	printTitle();
    	printPages();
    }
    
    /**
     * Prints the author's name.
     */
    public void printAuthor()
    {
    	System.out.println("Author: " + author);
    }
    
    /**
     * Prints the book's pages number.
     */
    public void printPages()
    {
    	System.out.println("Pages: " + pages);
    }
    
    /**
     * Prints the book's title.
     */
    public void printTitle()
    {
    	System.out.println("Title: " + title);
    }
}
