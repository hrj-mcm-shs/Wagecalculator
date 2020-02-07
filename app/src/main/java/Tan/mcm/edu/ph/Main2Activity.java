package Tan.mcm.edu.ph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button button2;
    String namefirst="";
    String namelast="";
    String age="";
    String id="";
    String hrs="";


    int x;
    int y;

    EditText fname;
    EditText lname;
    EditText Age;
    EditText ID;
    EditText hours;


    Spinner spinner;
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         fname = findViewById(R.id.editText8);
         lname = findViewById(R.id.editText9);
         Age = findViewById(R.id.editText11);
         ID = findViewById(R.id.editText12);
         hours = findViewById(R.id.editText3);


        button2 = findViewById(R.id.button2);

        spinner = findViewById(R.id.sex);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.sex, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner1 = findViewById(R.id.department);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.department, android.R.layout.simple_spinner_item);
        spinner1.setAdapter(adapter1);


        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           namefirst = String.valueOf(fname.getText());
                                           namelast = String.valueOf(lname.getText());
                                           age = String.valueOf(Age.getText());
                                           id = String.valueOf(ID.getText());
                                           hrs = String.valueOf(hours.getText());

                                           if (namefirst.equals("") || namelast.equals("") || hours.equals("") || age.equals("") || id.equals("")) {
                                               Toast.makeText(Main2Activity.this,
                                                       "Fill up every blank",
                                                       Toast.LENGTH_LONG).show();
                                           } else {


                                               Intent press = new Intent(Main2Activity.this, Main3Activity.class);
                                               press.putExtra("edittext8", namefirst);
                                               press.putExtra("edittext9", namelast);
                                               press.putExtra("edittext11", age);
                                               press.putExtra("edittext12", id);
                                               press.putExtra("hors", hrs);
                                             ; press.putExtra("spn1", String.valueOf(spinner.getSelectedItem()));
                                               press.putExtra("spn2", String.valueOf(spinner1.getSelectedItem()));

                                               startActivity(press);
                                           }
                                       }

           }
        );
    }







}