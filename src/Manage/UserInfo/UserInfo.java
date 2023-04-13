package Manage.UserInfo;

import java.io.Serializable;

public class UserInfo  implements Serializable {
    private String userId;
    private String userPwd;
    private String userName;
    private String userAddr;
    private int userAge;

    public UserInfo() {
    }

    public UserInfo(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }


    public UserInfo(String userId, String userPwd, String userName, String userAddr, int userAge) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.userAddr = userAddr;
        this.userAge = userAge;

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddr='" + userAddr + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
