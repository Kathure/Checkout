package io.google.checkout;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import shem.com.materiallogin.MaterialLoginView;
import shem.com.materiallogin.MaterialLoginViewListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final MaterialLoginView login = (MaterialLoginView) findViewById(R.id.login);
        login.setListener(new MaterialLoginViewListener() {
            @Override
            public void onRegister(TextInputLayout registerUser, TextInputLayout registerPass, TextInputLayout registerPassRep) {

            }

            @Override
            public void onLogin(TextInputLayout loginUser, TextInputLayout loginPass) {
                //Handle login
            }
        });
    }
}
