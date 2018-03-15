package xyz.cybersapien.jokes;

/**
 * Created by cybersapien on 13/3/18.
 */

public class Joke {

    private int id;
    private String content;
    private String title;
    private String author;
    private int likes;
    private int dislikes;
    private String category;

    public Joke(String content, String title, String category) {
        this.content = content;
        this.title = title;
        this.category = category;
    }

    public Joke(int id, String content, String title, String author, int likes, int dislikes, String category) {
        this.id = id;
        this.content = content;
        this.title = title;
        this.author = author;
        this.likes = likes;
        this.dislikes = dislikes;
        this.category = category;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
