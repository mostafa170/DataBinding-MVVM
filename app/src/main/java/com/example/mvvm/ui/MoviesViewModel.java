package com.example.mvvm.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.pojo.MoviesModel;

public class MoviesViewModel extends ViewModel {
    MutableLiveData<String> movieNameMutableLiveData;

    public void getMovieName(){
        String movieName = getMovieFromDatabase().getName();
        movieNameMutableLiveData.setValue(movieName);
    }
    private MoviesModel getMovieFromDatabase(){
        return new MoviesModel("cast away","6-4-1995","very sad movie",1);
    }
}
