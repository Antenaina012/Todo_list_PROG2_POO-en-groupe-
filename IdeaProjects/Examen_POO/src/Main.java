import java.util.List;

public class Main {
    public static void main(String[] args) {
        class UserGroup {
            private String GroupName;
            private List UserList;
            private String Admin;

            public UserGroup(String UserName, List UserList) {
                this.GroupName = GroupName;
                this.UserList = UserList;
                this.Admin = "";
            }

            public void setGroupName(String GroupName) {
                this.GroupName = GroupName;
            }

            public List getUserList() {
                return UserList;
            }

            public String getAdmin() {
                return Admin;
            }
        }
    }
}