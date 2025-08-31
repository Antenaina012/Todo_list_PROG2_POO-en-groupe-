import java.time.LocalDate;

public class UserTypes {


    public class StandartUser extends User {
        public StandartUser(String UserId, String UserName) {
            super(UserId, UserName);
        }

        public StandartUser(String UserId, String UserName, String Email) {
            super(UserId, UserName);
        }
    }
    public class Moderator extends StandartUser {
        public Moderator(String UserId, String UserName, String Email) {
            super(UserId, UserName, Email);
        }

    }
    public class Admin extends Moderator {
        public Admin(String id, String nomUtilisateur, String email) {
            super(id, nomUtilisateur, email);
        }
    }



}
