package sand.www.mvvmdatabindingsimple.ViewModel;

import android.databinding.BaseObservable;

import sand.www.mvvmdatabindingsimple.Model.User;
import sand.www.mvvmdatabindingsimple.R;

public class MainViewModel extends BaseObservable{
    private String userEmail,userEmailHint,
            userPassword, userPasswordHint;

    public MainViewModel(User user) {
        this.userEmailHint = user.getUserEmailHint();
        this.userPasswordHint = user.getUserPasswordHint();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        notifyPropertyChanged(R.id.edtEmail);
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
        notifyPropertyChanged(R.id.edtPassword);
    }

    public String getUserPasswordHint() {
        return userPasswordHint;
    }

    public void setUserPasswordHint(String userPasswordHint) {
        this.userPasswordHint = userPasswordHint;
    }
}
