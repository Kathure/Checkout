package io.google.checkout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;

public class IntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        addSlide(first_fragment);
        addSlide(second_fragment);
        addSlide(third_fragment);
        addSlide(fourth_fragment);

        setProgressButtonEnabled();
    }
}
