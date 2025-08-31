import java.util.ArrayList;
import java.util.List;

public class Post {
    private String Content;
    private User Author;
    private List<Comments> Comments = new ArrayList<>();

    public void Publication(String Content, User Author) {
        this.Content = Content;
        this.Author = Author;
    }


    public void AddComments(Comments Comments) {
        Comments.add(Comments);
    }

    public void DeleteComments(Comments Comments) {
        Comments.remove(Comments);
    }

    public boolean KeyWords(String KeyWords) {
        return Content.toLowerCase().contains(KeyWords.toLowerCase());
    }
}
