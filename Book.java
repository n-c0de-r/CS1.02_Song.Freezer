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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
     * Get the book's title.
     * @return	The title of this book.
     */
    public String getTitle()
    {
    	return title;
    }
}
