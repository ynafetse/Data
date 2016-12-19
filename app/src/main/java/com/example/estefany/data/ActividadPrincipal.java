package com.example.estefany.data;

import android.app.DatePickerDialog;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.ArrayList;

@RequiresApi(api = Build.VERSION_CODES.N)
public class ActividadPrincipal extends AppCompatActivity {

    DateFormat formatDate = DateFormat.getDateInstance();
    Calendar dateTime = Calendar.getInstance();
    private Button btn_date;
    private TextView txt_text;

    ArrayList<Contact> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        btn_date = (Button) findViewById(R.id.btn_Date);
        txt_text = (TextView) findViewById(R.id.txt_text) ;

        contactos = new ArrayList<Contact>();

        contactos.add(new Contact("Estefany Aguilar Restrepo","5555555"));

        btn_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDate();
            }
        });

        updateTextLabel();

    }


    private void updateDate(){
        new DatePickerDialog(this, d, dateTime.get(Calendar.YEAR), dateTime.get(Calendar.MONTH), dateTime.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        }
    };

    private void updateTextLabel(){
        txt_text.setText(formatDate.format(dateTime.getTime()));
    }
}
