/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author  n-c0de-r
 * @version 2021.07.21
 * @version 2022.07.28
 */
class Book
{
    // The fields.
    private String author;
    private String refNumber;
    private String title;
    private int pages;
    private int borrowed;
    private final boolean courseText;

    /**
     * Set the author and title fields
     * when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isText)
    {
        author = bookAuthor;
        refNumber = "";
        title = bookTitle;
        pages = bookPages;
        borrowed = 0;
        courseText = isText;
    }

    // Add the methods here ...
    /**
     * Increases the number of times a book was borrowed.
     */
    public void borrow()
    {
        borrowed = borrowed + 1;

        // Same as above:
        // borrowed += 1;
        // borrowed++;
    }

    /**
     * Get the book's author's name.
     * @return    The name of this book's author.
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Get the number of times the book was borrowed.
     * @return      The integer number of times borrowed.
     */
    public int getBorrowed()
    {
        return borrowed;
    }

    /**
     * Get the book's number of pages.
     * @return    The pages count of this book.
     */
    public int getPages()
    {
        return pages;
    }

    /**
     * Get the book's reference number.
     * @return    The reference number of this book.
     */
    public String getRefNumber()
    {
        return refNumber;
    }

    /**
     * Get the book's title.
     * @return    The title of this book.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the boolean value of a book being a course text.
     */
    public boolean isCourseText()
    {
        return courseText;
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
        printReferenceNumber();
        printBorrowed();
        printCourseText();
    }

    /**
     * Prints the author's name.
     */
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }

    /**
     * Prints the times a book was borrowed.
     */
    public void printBorrowed()
    {
        System.out.println("Borrowed " + borrowed + " times.");
    }

    /**
     * Prints the book's pages number.
     */
    public void printPages()
    {
        System.out.println("Pages: " + pages);
    }

    /**
     * Prints the book's course text status.
     */
    public void printCourseText()
    {
        // Usual solution, BUT lots of duplications
        if(isCourseText())
        {
            System.out.println("This book is used as a text book on a course.");
        }
        else
        {
            System.out.println("This book is not used as a text book on a course.");
        }

        // Alternative solution with only one if statement to avoid duplication
        //String text = "This book is ";
        //if (!isCourseText())
        //{
        //    text += "not "; // Add the only different word if it is needed.
        //}
        //text += "used as a text book on a course.";
        //System.out.println(text); // Print only the resulting text
    }

    /**
     * Prints the book's reference number.
     */
    public void printReferenceNumber()
    {
        String reference = "No reference number";
        // Only print the reference number, if it is set (not length 0).
        if (refNumber.length() != 0)
        {
            reference = "Reference Number: " + refNumber; // Exchange text to print
        }
        System.out.println(reference); // Print either text.
    }

    /**
     * Prints the book's title.
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);       
    }

    /**
     * Set a reference number for this book.
     * @param num    The number to set.
     */
    public void setRefNumber(String num)
    {
        // Only set the reference number if it's of a certain length.
        if(num.length() >= 3)
        {
            refNumber = num;
        }
        // Otherwise prompt a message.
        else
        {
            System.out.println("Please input a longer ID.");
        }
    }
}
