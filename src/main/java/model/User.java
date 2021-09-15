package model;

public class User {

    int userId;
    String userName;
    String userPassword;
    String userEmail;
    String userFullNames;
    String userCardNo;
    String userNiD;
    String userAddress;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCardNo() {
        return userCardNo;
    }

    public void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo;
    }

    public String getUserNiD() {
        return userNiD;
    }

    public void setUserNiD(String userNiD) {
        this.userNiD = userNiD;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserFullNames() {
        return userFullNames;
    }

    public void setUserFullNames(String userFullNames) {
        this.userFullNames = userFullNames;
    }
}
