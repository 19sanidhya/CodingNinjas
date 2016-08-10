package com.utilities.sanidhya.codingninjas.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.utilities.sanidhya.codingninjas.R;

public class MentorsActivity extends AppCompatActivity {
    TextView name;
    TextView qualification;
    TextView vision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentors);

            name = (TextView)findViewById(R.id.mentorsNameTextView);
            qualification = (TextView)findViewById(R.id.qualification);
            vision = (TextView)findViewById(R.id.vision);
            String mentorName = getIntent().getStringExtra("name");
            String mentorQualification = getIntent().getStringExtra("qualification");
            String mentorVision = getIntent().getStringExtra("vision");

            if(name!=null && qualification!=null && vision!=null){
                name.setText(mentorName);
                //qualification.setText(mentorQualification);

                qualification.setCompoundDrawablesWithIntrinsicBounds(R.drawable.friendly, 0, 0, 0);
//
//                SpannableStringBuilder builder = new SpannableStringBuilder();
//                builder.append(" ");
//                builder.setSpan(new ImageSpan(this, R.drawable.friendly),
//                        builder.length() - 1, builder.length(), 0);
//                builder.append("My string.  Cree by Dexode i3wtuqo[n[ounhonh[jtiohkthioehioetihje");

//                qualification.setText(builder);
                vision.setText(mentorVision);

        }
    }
}
