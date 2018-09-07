package sand.www.mvvmdatabindingsimple;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sand.www.mvvmdatabindingsimple.Model.User;
import sand.www.mvvmdatabindingsimple.ViewModel.MainViewModel;
import sand.www.mvvmdatabindingsimple.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        User user = new User();
        user.setUserEmailHint("Enter your email");
        user.setUserPasswordHint("Enter your password");
        MainViewModel viewModel = new MainViewModel(user);
        mainBinding.setLogin(viewModel);
    }
}
