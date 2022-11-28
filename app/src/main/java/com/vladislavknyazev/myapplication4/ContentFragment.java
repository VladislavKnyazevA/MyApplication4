package com.vladislavknyazev.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vladislavknyazev.myapplication2.R;

import java.util.Date;

public class ContentFragment extends Fragment {

    public ContentFragment() {
        super(R.layout.fragment_content);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button backButton = view.findViewById(R.id.backButton);
        TextView updateBox = view.findViewById(R.id.dateTextView);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentFragment.this.getActivity(),
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
