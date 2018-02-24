package idoston.com.harftopish;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class countries extends AppCompatActivity {

    private ImageView image;
    private RadioGroup radioGroup;
    private RadioButton ani_1, ani_2, ani_3, ani_4;
    private Button btn;
    private int random_question;
    private int random_position;
    private int score = 0;
    private TextView scoring;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        image = (ImageView)findViewById(R.id.id_image);

        radioGroup = (RadioGroup) findViewById(R.id.id_radio_g);
        ani_1 = (RadioButton) findViewById(R.id.id_ani_1);
        ani_2 = (RadioButton) findViewById(R.id.id_ani_2);
        ani_3 = (RadioButton) findViewById(R.id.id_ani_3);
        ani_4 = (RadioButton) findViewById(R.id.id_ani_4);

        scoring = (TextView) findViewById(R.id.text_d_1);

        ChangeQuestion();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    private void ChangeQuestion(){

    }
    public void Finish_m(View view){
        Exit_alert();
    }
    public void Check_m(View view){

    }
    public void Exit_alert(){
        AlertDialog.Builder alert_builder = new AlertDialog.Builder(this);
        alert_builder.setMessage("O`yinni tugatishni xoxlaysizmi?")
                .setCancelable(false)
                .setPositiveButton("Ha", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(countries.this, "Xayr!", Toast.LENGTH_SHORT).show();
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton("Yo`q", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alert = alert_builder.create();
        alert.setTitle("Tasdiqlang");
        alert.show();
    }
}
