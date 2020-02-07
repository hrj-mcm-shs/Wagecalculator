package Tan.mcm.edu.ph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView one;
    TextView two;
    TextView three;
    TextView four;
    ImageView img1;
    ImageView img2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        img1 = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView3);
        one = findViewById(R.id.textView13);
        btn3 = findViewById(R.id.button3);
        four = findViewById(R.id.textView12);

        String fname = getIntent().getStringExtra("edittext8");
        String lname = getIntent().getStringExtra("edittext9");
        String age = getIntent().getStringExtra("edittext11");
        String ID = getIntent().getStringExtra("edittext12");
        String sex = getIntent().getStringExtra("spn1");
        String depart = getIntent().getStringExtra("spn2");
        String hrsnf = getIntent().getStringExtra("hors");


        int hrs = Integer.parseInt(hrsnf);


        if (fname.equalsIgnoreCase("First name:Abraham") && lname.equalsIgnoreCase("Last name:Tan")) {

            img1.setVisibility(View.VISIBLE);
            img2.setVisibility(View.GONE);


        }
        four.setText("1.  " + fname + "\n"
                + "2. " + lname + "\n"
                + "3.: " + ID + "\n"
                + "4. " + age + "\n"
                + "5. Sex: " + sex + "\n"
                + "6. " + depart);


            if (depart == "Human Resources") {
                if (hrs < 9) {
                    one.setText("Hours: " + hrs + "\n"
                            + "Rate: \u20B1" + 100 + "/hrs" + "/n"
                            + "Wage: \u20B1" + 100 + 100);


                } else if (hrs > 8) {
                    one.setText("Hours: " + hrs + "\n"
                            + "Overtime Hours: " + (hrs - 8) + "\n"
                            + "\n"
                            + "Rate: \u20B1" + 100 + "hr" + "\n"
                            + "Overtime rate: \u20B1" + 130 + "/hr" + "\n"
                            + "Wage: \u20B1" + ((880 + (hrs - 8) * 150))
                    );
                }
            } else if (depart == "Academic") {
                if (hrs < 9) {
                        one.setText("Hours: " + hrs + "\n"
                                + "Rate: \u20B1" + 90 + "hr" + "\n"
                                + "\n"
                                + "Rate: \u20B1" + 90 + "hr" + "\n"
                                + "Overtime rate: \u20B1" + 140 + "/hr" + "\n"
                                + "Wage: \u20B1" + ((880 + (hrs - 8) * 150))
                        );
                } else if (hrs > 8) {
                    one.setText("Hours: " + hrs + "\n"
                            + "Overtime Hours: " + (hrs - 8) + "\n"
                            + "\n"
                            + "Rate: \u20B1" + 90 + "hr" + "\n"
                            + "Overtime rate: \u20B1" + 140 + "/hr" + "\n"
                            + "Wage: /u20B1" + ((880 + (hrs - 8) * 150))
                    );

                } else if (depart == "Adminstrative") {
                    if (hrs < 9) {
                            one.setText("Hours: " + hrs + "\n"
                                    + "Rate: \u20B1" + 90 + "hrs" + "\n"
                                    + "Wage: \u20B1" + hrs + 110);


                    } else if (hrs > 8) {
                        one.setText("Hours: " + hrs + "\n"
                                + "Overtime Hours: " + (hrs - 8) + "\n"
                                + "\n"
                                + "Rate: \u20B1" + 110 + "hr" + "\n"
                                + "Overtime rate: \u20B1" + 150 + "/hr" + "\n"
                                + "Wage: /u20B1" + ((880 + (hrs - 8) * 150))
                        );
                    }


                }


            }
                btn3.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent main = new Intent(Main3Activity.this, MainActivity.class);
                                startActivity(main);
                            }


                        }
                );


    }
}
