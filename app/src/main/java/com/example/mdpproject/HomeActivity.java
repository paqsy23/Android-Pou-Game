package com.example.mdpproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
    Fragment fragment;
    public static int pages=0;
    public static user u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        u = new user(0,0,0,100,100,100,100,null);
        fragment = new BedroomFragment();
        openFragment(fragment);

    }

    private void openFragment(Fragment fr){
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction();
        ft.replace(R.id.myFragment, fr);
        ft.commit();
    }
}
