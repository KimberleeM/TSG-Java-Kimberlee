package ObjectModeling;

/**
 *
 * @author Max
 */
public class Book02 {
    private int chapters;
    private String genre;
    private String author;
    private int year;
    
    public Book02 (String author, int year){
        this.author = author; 
        this.year = year;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

   
    
    
}
