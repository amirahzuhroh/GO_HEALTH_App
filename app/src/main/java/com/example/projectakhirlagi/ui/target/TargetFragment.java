package com.example.projectakhirlagi.ui.target;

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
import com.example.projectakhirlagi.ui.act.ActViewModel;

public class TargetFragment extends Fragment {

    private TargetViewModel targetViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        targetViewModel =
                ViewModelProviders.of(this).get(TargetViewModel.class);
        View root = inflater.inflate(R.layout.target_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_target);
        targetViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}