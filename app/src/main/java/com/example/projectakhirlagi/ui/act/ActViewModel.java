package com.example.projectakhirlagi.ui.act;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ActViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ActViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Activity fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}