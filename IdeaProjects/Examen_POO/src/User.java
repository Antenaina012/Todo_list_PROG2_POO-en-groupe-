import java.time.LocalDate;

public class User extends Main{
    private  String UserId;
    private  String UserName;
    private String Email;
    private LocalDate CreationDate  ;

    public User(String UserId,String UserName){
        this.UserId = UserId;
        this.UserName = UserName;
        this.CreationDate = CreationDate;
        this.Email=Email;
    }
    public String getUserId() {
        return UserId;
    }
    public String getUserName() {
        return UserName;

    }
    public LocalDate getCreationDate() {
             return CreationDate;
    }
    public String getEmail() {
        return Email;
    }
}
