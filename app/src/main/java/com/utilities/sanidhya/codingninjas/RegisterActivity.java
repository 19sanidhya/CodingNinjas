package com.utilities.sanidhya.codingninjas;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    Button dOB;
    EditText fatherName;
    EditText houseNo;
    EditText district;
    EditText city;
    EditText state;
    EditText emailId;
    EditText mobileNo;
    EditText college;
    EditText year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firstName=(EditText)findViewById(R.id.register_first_name_et);
        lastName=(EditText)findViewById(R.id.register_last_name_et);
        dOB = (Button)findViewById(R.id.register_dob_b);
        fatherName=(EditText)findViewById(R.id.register_father_name_et);
        houseNo=(EditText)findViewById(R.id.register_house_et);
        district=(EditText)findViewById(R.id.register_district_et);
        city=(EditText)findViewById(R.id.register_city_et);
        state=(EditText)findViewById(R.id.register_state_et);
        emailId=(EditText)findViewById(R.id.register_email_id_et);
        mobileNo=(EditText)findViewById(R.id.register_mobile_et);
        college=(EditText)findViewById(R.id.register_college_et);
        year=(EditText)findViewById(R.id.register_year_et);

        dOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(RegisterActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        dOB.setText("" + i + "-" + i1 + "-" + i2);
                    }
                },0,0,0);
                datePickerDialog.show();
            }
        });
    }

}
