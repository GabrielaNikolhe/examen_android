package com.example.unitek.findmyago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText etDOB;
    TextView MostrarAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDOB=(EditText)findViewById(R.id.etDOB);
        MostrarAge=(TextView)findViewById(R.id.MostrarAge);
    }

    public void buEdad(View view) {
        int DOB= Integer.parseInt(etDOB.getText().toString());

        Calendar calendar=Calendar.getInstance();
        int year= calendar.get(Calendar.YEAR);
        int Age=year-DOB;
        MostrarAge.setText("Tu edad es: " + Age + " y en meses" +Age+12 + ", en días " + Age*356);
    }
}
