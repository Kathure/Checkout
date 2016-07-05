package io.google.checkout;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;

public class IntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        super.onCreate(savedInstanceState);
        addSlide(Sampleslide.newInstance(R.layout.first_fragment));
        addSlide(Sampleslide.newInstance(R.layout.second_fragment));
        addSlide(Sampleslide.newInstance(R.layout.third_fragment));


        setProgressButtonEnabled(true);
    }


    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        Intent intent = new Intent(IntroActivity.this,MainActivity.class);
        startActivity(intent);
    }


}

