package Tan.mcm.edu.ph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String mPW = "l";
        final String mUN = "208";

        final TextView ay = findViewById(R.id.textView);
        final TextView bi = findViewById(R.id.textView2);
        final Button btn1 = findViewById(R.id.button);
        final EditText di = findViewById(R.id.editText2);
        final EditText iy = findViewById(R.id.editText);

        btn1.setText("LOGIN");

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String typedPW = String.valueOf(di.getText());
                        String typedUN = String.valueOf(iy.getText());

                        if (typedUN.equalsIgnoreCase(mUN) && typedPW.equals(mPW)) {
                            Toast.makeText(MainActivity.this,
                                    "Welcome",
                                    Toast.LENGTH_LONG).show();
                            ay.setText("");
                            bi.setText("");
                            Intent intent1 = new Intent (MainActivity.this, Main2Activity.class);
                            startActivity(intent1);

                        } else if (typedUN != mUN || typedPW != mPW) ;
                        Toast.makeText(MainActivity.this,
                                "Faliure",
                                Toast.LENGTH_LONG).show();



                    }

                }
        );
    }
}

