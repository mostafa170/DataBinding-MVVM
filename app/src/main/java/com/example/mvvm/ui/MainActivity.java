package com.example.mvvm.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvm.R;
import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Button getMovieButton;
    MoviesViewModel moviesViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setViewModel(moviesViewModel);
        binding.setLifecycleOwner(this);

    }
}
