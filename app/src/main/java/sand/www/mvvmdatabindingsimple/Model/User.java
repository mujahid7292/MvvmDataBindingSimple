package sand.www.mvvmdatabindingsimple.Model;

public class User {
    private String userEmail,userEmailHint,
            userPassword, userPasswordHint;

    public User() {

    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmailHint() {
        return userEmailHint;
    }

    public void setUserEmailHint(String userEmailHint) {
        this.userEmailHint = userEmailHint;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPasswordHint() {
        return userPasswordHint;
    }

    public void setUserPasswordHint(String userPasswordHint) {
        this.userPasswordHint = userPasswordHint;
    }
}
