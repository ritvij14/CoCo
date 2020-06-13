package com.example.myapplication.fragments.symptomChecker;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentSymptomCheckerInfoBinding;

public class SymptomCheckerInfoFragment extends Fragment {

    FragmentSymptomCheckerInfoBinding infoBinding;
    SymptomCheckerQuestionFragment questionFragment;
    public SymptomCheckerInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        infoBinding = FragmentSymptomCheckerInfoBinding.inflate(inflater, container,false);
        View view = infoBinding.getRoot();

        questionFragment = new SymptomCheckerQuestionFragment();
        infoBinding.continueButton.setOnClickListener( v ->
                getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.symptom_frame_layout, questionFragment)
                .addToBackStack(null)
                .commit());

        getActivity().findViewById(R.id.symptom_checker_back_button).setOnClickListener( v ->
                getActivity().finish());
        return view;
    }
}
