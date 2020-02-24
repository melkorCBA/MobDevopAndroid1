package cba.example.com.myfirstproject;


import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView counterTextView;
    private Button btnIncrement;
    private static int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTextView=(TextView)findViewById(R.id.textIncrement);
        btnIncrement=(Button)findViewById((R.id.btnIncrement));

    }

    public void onButtonIncrementClicked(View v) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        if(Integer.parseInt(counterTextView.getText().toString())>=10){
            alertDialogBuilder.setTitle("Ooops!!");
            alertDialogBuilder.setMessage("You have reached the limit");
            alertDialogBuilder.show();
        }
        else{
            counter++;
            counterTextView.setText(String.valueOf(counter));
        }




    }

}
