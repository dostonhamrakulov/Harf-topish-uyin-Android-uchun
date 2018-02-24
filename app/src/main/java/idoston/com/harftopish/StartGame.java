package idoston.com.harftopish;
/*
 *   Created by Doston Hamrakulov 18.02.2018
 */
import android.content.DialogInterface;
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

public class StartGame extends AppCompatActivity {

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
        setContentView(R.layout.activity_start_game);

        image = (ImageView)findViewById(R.id.id_image);

        radioGroup = (RadioGroup) findViewById(R.id.id_radio_g);
        ani_1 = (RadioButton) findViewById(R.id.id_ani_1);
        ani_2 = (RadioButton) findViewById(R.id.id_ani_2);
        ani_3 = (RadioButton) findViewById(R.id.id_ani_3);
        ani_4 = (RadioButton) findViewById(R.id.id_ani_4);

        scoring = (TextView) findViewById(R.id.text_d_1);

        int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Animals.Animal_two[getRandomForAnimal()], null, null);
        image.setImageResource(id);

        ChangeQuestion();

        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    public void Check(View view){

        switch(view.getId()){
            case R.id.id_ani_1:
                if (ani_1.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(StartGame.this, "Noto`g`ri. J: " + Animals.Animal[random_question], Toast.LENGTH_LONG).show();
                }
                ChangeQuestion();
                break;
            case R.id.id_ani_2:
                if (ani_2.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(StartGame.this, "Noto`g`ri. J: " + Animals.Animal[random_question], Toast.LENGTH_LONG).show();
                }
                ChangeQuestion();
                break;
            case R.id.id_ani_3:
                if (ani_3.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(StartGame.this, "Noto`g`ri. J: " + Animals.Animal[random_question], Toast.LENGTH_LONG).show();
                }
                ChangeQuestion();
                break;
            case R.id.id_ani_4:
                if (ani_4.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "To`g`ri", Toast.LENGTH_LONG).show();
                    score = score + 1;
                } else {
                    Toast.makeText(StartGame.this, "Noto`g`ri. J: " + Animals.Animal[random_question], Toast.LENGTH_LONG).show();
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
                random_question = getRandomForAnimal();

                scoring.setText("Ball: " + score);
                ani_1.setChecked(false);
                ani_2.setChecked(false);
                ani_3.setChecked(false);
                ani_4.setChecked(false);

                if(random_position == 0){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Animals.Animal_two[random_question], null, null);
                    image.setImageResource(id);
                    ani_1.setText(Animals.Animal[random_question]);
                    ani_2.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_3.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_4.setText(Animals.Animal[getRandomForAnimal()]);
                }  else if ( random_position == 1){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Animals.Animal_two[random_question], null, null);
                    image.setImageResource(id);
                    ani_1.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_2.setText(Animals.Animal[random_question]);
                    ani_3.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_4.setText(Animals.Animal[getRandomForAnimal()]);
                } else if ( random_position == 2){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Animals.Animal_two[random_question], null, null);
                    image.setImageResource(id);
                    ani_1.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_2.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_3.setText(Animals.Animal[random_question]);
                    ani_4.setText(Animals.Animal[getRandomForAnimal()]);
                } else if (random_position == 3){
                    int id = getResources().getIdentifier("idoston.com.harftopish:drawable/" + Animals.Animal_two[random_question], null, null);
                    image.setImageResource(id);
                    ani_1.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_2.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_3.setText(Animals.Animal[getRandomForAnimal()]);
                    ani_4.setText(Animals.Animal[random_question]);
                }
            }
        }, 1000);


    }
    private int getRandomForAnimal(){
        Random random = new Random();
        return random.nextInt(34);
    }
    private int getRandomForPosition(){
        Random random = new Random();
        return random.nextInt(4);
    }
    public void Finishing(View view){
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
            Toast.makeText(StartGame.this, "Moving to English version", Toast.LENGTH_LONG).show();
            return true;
        }
        switch(id){
            case R.id.id_about_using:
                Toast.makeText(StartGame.this, "Instruction", Toast.LENGTH_LONG).show();
                return true;
            case R.id.id_exit_app_home:
                Exit_alert();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void Exit_alert(){
        AlertDialog.Builder alert_builder = new AlertDialog.Builder(this);
        alert_builder.setMessage("O`yinni tugatishni xoxlaysizmi?")
                .setCancelable(false)
                .setPositiveButton("Ha", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(StartGame.this, "Xayr!", Toast.LENGTH_SHORT).show();
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
    private void Name(){
        String name = "Doston Hamrakulov";
        String email = "doston2509@gmail";
        String city = "Samarkand";
        String country = "Uzbekistan";
    }
      /*   private void Name(){
        Stringsdcd name = "Doston Hamrakulov";
        Stringsdc email = "doston2509@gmail";
        Stringsdc city = "Samarkand";
        String sdccountry = "Uzbekistan";
    }*/

}
