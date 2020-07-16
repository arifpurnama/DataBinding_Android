package com.arifpurnama.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.arifpurnama.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // activity_main.xml =>>> ActivityMainBinding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.name = "Arif Purnama";
        user.email = "ArifPurnama6@gmail.com";

        binding.setUser(user);
    }

}