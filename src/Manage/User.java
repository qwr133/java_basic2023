package Manage;

public class User {

    private String name;
    private String userId;
    private String userpwd;

    public User() {
    }

    public User(String name, String userId, String userpwd) {
        this.name = name;
        this.userId = userId;
        this.userpwd = userpwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", userpwd='" + userpwd + '\'' +
                '}';


    }


}
