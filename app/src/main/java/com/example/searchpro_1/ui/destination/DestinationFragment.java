package com.example.searchpro_1.ui.destination;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.searchpro_1.NavActivityActivity;
import com.example.searchpro_1.R;
import com.example.searchpro_1.ui.budget.Budget;

public class DestinationFragment extends Fragment {

   // public static DestinationFragment newInstance() {return new DestinationFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_destination, container, false);
       /* Button button = root.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((NavActivityActivity)getActivity()).replaceFragment(Budget.newInstance());
            }
        });
*/
        return root;
    }
}