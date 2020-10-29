package com.example.projectakhirlagi.ui.act;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.projectakhirlagi.R;

public class ActFragment extends Fragment {

    private ActViewModel actViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        actViewModel =
                ViewModelProviders.of(this).get(ActViewModel.class);
        View root = inflater.inflate(R.layout.act_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_act);
        actViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}