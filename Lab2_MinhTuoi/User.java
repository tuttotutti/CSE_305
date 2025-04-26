package Lab2_MinhTuoi;

public class User {
    
    private String userID;
    private String password;
    private String email;
    private String userType;

    public User(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public void resetPassword(){
        this.password = "";
    }

    public User createUser(){
        return new User(userID, password, email, userType);
    }
}
