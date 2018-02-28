package idoston.com.harftopish;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class countries extends AppCompatActivity {

    private ImageView image;
    private RadioGroup radioGroup;
    private RadioButton con_1, con_2, con_3, con_4;
    private Button btn;
    private int random_question;
    private int random_position;
    private int score = 0;
    private TextView scoring;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        image = (ImageView)findViewById(R.id.id_m_image);

        radioGroup = (RadioGroup) findViewById(R.id.id_m_radio_g);
        con_1 = (RadioButton) findViewById(R.id.id_m_1);
        con_2 = (RadioButton) findViewById(R.id.id_m_2);
        con_3 = (RadioButton) findViewById(R.id.id_m_3);
        con_4 = (RadioButton) findViewById(R.id.id_m_4);

        scoring = (TextView) findViewById(R.id.text_m_5);

        int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Country.country_image[getRandomForCountry()], null, null);
        image.setImageResource(id);
        ChangeQuestion();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    public void Check_m(View view){

        switch(view.getId()){
            case R.id.id_m_1:
                if (con_1.getText().toString() == Country.country_name[random_question]){
                    Toast.makeText(countries.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(countries.this, "Noto`g`ri. J: " + Country.country_name[random_question], Toast.LENGTH_LONG).show();
                }
                ChangeQuestion();
                break;
            case R.id.id_m_2:
                if (con_2.getText().toString() == Country.country_name[random_question]){
                    Toast.makeText(countries.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(countries.this, "Noto`g`ri. J: " + Country.country_name[random_question], Toast.LENGTH_LONG).show();
                }
                ChangeQuestion();
                break;
            case R.id.id_m_3:
                if (con_3.getText().toString() == Country.country_name[random_question]){
                    Toast.makeText(countries.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(countries.this, "Noto`g`ri. J: " + Country.country_name[random_question], Toast.LENGTH_LONG).show();
                }
                ChangeQuestion();
                break;
            case R.id.id_m_4:
                if (con_4.getText().toString() == Country.country_name[random_question]){
                    Toast.makeText(countries.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(countries.this, "Noto`g`ri. J: " + Country.country_name[random_question], Toast.LENGTH_LONG).show();
                }
                ChangeQuestion();
                break;
        }

    }
    private void ChangeQuestion(){
        final Handler handler = new Handler();
        //IntialColors();
        //Toast.makeText(getApplicationContext(),"Preparing game board!", Toast.LENGTH_LONG).show();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                random_position = getRandomForPosition();
                random_question = getRandomForCountry();

                scoring.setText("Ball: " + score);
                con_1.setChecked(false);
                con_2.setChecked(false);
                con_3.setChecked(false);
                con_4.setChecked(false);

                if(random_position == 0){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Country.country_image[random_question], null, null);
                    image.setImageResource(id);
                    con_1.setText(Country.country_name[random_question]);
                    con_2.setText(Country.country_name[getRandomForCountry()]);
                    con_3.setText(Country.country_name[getRandomForCountry()]);
                    con_4.setText(Country.country_name[getRandomForCountry()]);
                }  else if ( random_position == 1){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Country.country_image[random_question], null, null);
                    image.setImageResource(id);
                    con_1.setText(Country.country_name[getRandomForCountry()]);
                    con_2.setText(Country.country_name[random_question]);
                    con_3.setText(Country.country_name[getRandomForCountry()]);
                    con_4.setText(Country.country_name[getRandomForCountry()]);
                } else if ( random_position == 2){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Country.country_image[random_question], null, null);
                    image.setImageResource(id);
                    con_1.setText(Country.country_name[getRandomForCountry()]);
                    con_2.setText(Country.country_name[getRandomForCountry()]);
                    con_3.setText(Country.country_name[random_question]);
                    con_4.setText(Country.country_name[getRandomForCountry()]);
                } else if (random_position == 3){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Country.country_image[random_question], null, null);
                    image.setImageResource(id);
                    con_1.setText(Country.country_name[getRandomForCountry()]);
                    con_2.setText(Country.country_name[getRandomForCountry()]);
                    con_3.setText(Country.country_name[getRandomForCountry()]);
                    con_4.setText(Country.country_name[random_question]);
                }
            }
        }, 1000);


    }
    private int getRandomForCountry(){
        Random random = new Random();
        return random.nextInt(66);
    }
    private int getRandomForPosition(){
        Random random = new Random();
        return random.nextInt(4);
    }
    public void Finish_m(View view){
        Exit_alert();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);

        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.id_changing_language) {
            Toast.makeText(countries.this, "Moving to English version", Toast.LENGTH_LONG).show();
            startActivity(new Intent(countries.this, StartGameEn.class));
            return true;
        }
        switch(id){
            case R.id.id_about_using:
                Toast.makeText(countries.this, "Instruction", Toast.LENGTH_LONG).show();
                return true;
            case R.id.id_exit_app_home:
                Exit_alert();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void Exit_alert(){
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
