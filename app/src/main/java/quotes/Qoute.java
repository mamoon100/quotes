package quotes;

import java.util.ArrayList;

public class Qoute {
    /*
    "tags": [],
    "author": "Patrick Ness",
    "likes": "19 likes",
    "text": " “But what is a dream...?...Who is to say that it is not everything "*/

    private ArrayList<String> tags;
    private String author;
    private String likes;
    private String text;

    public Qoute(ArrayList<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public Qoute(String author, String text) {
        this.likes = "0 likes";
        this.author = author;
        this.text = text;
        this.tags = new ArrayList<>();
        this.tags.add("online");
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
//        return "Quote{" +
//                "tags=" + tags +
//                ", author='" + author + '\'' +
//                ", likes='" + likes + '\'' +
//                ", text='" + text + '\'' +
//                '}';

        return  "tags=" + tags +
                ", author='" + author + '\'' +
                ", likes='" + likes + "'\n"+
                "quote =>>  " + text;
    }
}
