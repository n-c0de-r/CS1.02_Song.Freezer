/**
 * A class that maintains information on a Song.
 * This might form part of a larger application
 * such as a music player, for instance.
 *
 * @author  n-c0de-r
 * @version 2023.02.05
 */
class Song
{
    // The fields.
    private String artist;
    private String refNumber;
    private String title;
    private int seconds;
    private int played;
    private final boolean ringTone;

    /**
     * Set the artist and title fields
     * when this object is constructed.
     * @param songArtist    The name of the artist of this song.
     * @param songTitle     The name of this song.
     * @param songSeconds   The duration of the song in seconds.
     * @param isTone        Status if the song is used as a ring tone.
     */
    public Song(String songArtist, String songTitle, int songSeconds, boolean isTone)
    {
        artist = songArtist;
        refNumber = "";
        title = songTitle;
        seconds = songSeconds;
        played = 0;
        ringTone = isTone;
    }

    // Add the methods here ...
    /**
     * Increases the number of times a song was played.
     */
    public void play()
    {
        played = played + 1;

        // Same as above:
        // played += 1;
        // played++;
    }

    /**
     * Get the song's artist's name.
     * @return    The name of this song's artist.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Get the number of times the song was played.
     * @return  The integer number of times played.
     */
    public int getplayed()
    {
        return played;
    }

    /**
     * Get the song's number of seconds.
     * @return  The seconds count of this song.
     */
    public int getSeconds()
    {
        return seconds;
    }

    /**
     * Get the song's reference number.
     * @return  The reference number of this song.
     */
    public String getRefNumber()
    {
        return refNumber;
    }

    /**
     * Get the song's title.
     * @return  The title of this song.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Get the boolean value of a song being a ring tone.
     * @return  The current boolean value of the status.
     */
    public boolean isRingTone()
    {
        return ringTone;
    }

    /**
     * Prints all the details of the song.
     */
    public void printDetails()
    {
        //Calls all the following methods, that deal with the details.
        printArtist();
        printTitle();
        printSeconds();
        printReferenceNumber();
        printPlayed();
        printRingTone();
    }

    /**
     * Prints the artist's name.
     */
    public void printArtist()
    {
        System.out.println("Artist: " + artist);
    }

    /**
     * Prints the times a song was played.
     */
    public void printPlayed()
    {
        System.out.println("Played " + played + " times.");
    }

    /**
     * Prints the song's seconds number.
     */
    public void printSeconds()
    {
        System.out.println("Seconds: " + seconds);
    }

    /**
     * Prints the song's ring tone status.
     */
    public void printRingTone()
    {
        // Usual solution, BUT lots of duplications
        if(isRingTone())
        {
            System.out.println("This song is used as a ring tone.");
        }
        else
        {
            System.out.println("This song is not used as a ring tone.");
        }

        // Alternative solution with only one if statement to avoid duplication
        //String text = "This song is ";
        //if (!isRingTone())
        //{
        //    text += "not "; // Add the only different word if it is needed.
        //}
        //text += "used as a ring tone.";
        //System.out.println(text); // Print only the resulting text
    }

    /**
     * Prints the song's reference number.
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
     * Prints the song's title.
     */
    public void printTitle()
    {
        System.out.println("Title: " + title);       
    }

    /**
     * Set a reference number for this song.
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
