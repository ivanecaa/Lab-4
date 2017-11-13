
public class User {
    public enum UserType{user, admin, editor};
    private String username;
    private String name;
    private UserType userType;

    public User(String userName, UserType Usertype, String Name){
        this.username=userName;
        this.userType=Usertype;
        this.name=Name;
    }

    public String getUsername() {
        return username;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }

    public void setUserType(UserType input) {
        this.userType = input;
    }
}
