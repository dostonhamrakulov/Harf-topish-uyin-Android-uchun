package idoston.com.harftopish;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Doston on 2/18/2018.
 */
public class StartGame extends AppCompatActivity {

    ImageView image;
    RadioGroup radioGroup;
    RadioButton ani_1, ani_2, ani_3, ani_4;
    Button btn;
    int random_question;
    int random_position;

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

        ChangeQuestion();
    }
    public void Check(View view){

        switch(view.getId()){
            case R.id.id_ani_1:
                if (ani_1.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "Correct", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(StartGame.this, "Incorrect", Toast.LENGTH_LONG).show();
                }
                ani_1.setChecked(false);
                ChangeQuestion();
                break;
            case R.id.id_ani_2:
                if (ani_2.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "Correct", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(StartGame.this, "Incorrect", Toast.LENGTH_LONG).show();
                }
                ani_2.setChecked(false);
                ChangeQuestion();
                break;
            case R.id.id_ani_3:
                if (ani_3.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "Correct", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(StartGame.this, "Incorrect", Toast.LENGTH_LONG).show();
                }
                ani_3.setChecked(false);
                ChangeQuestion();
                break;
            case R.id.id_ani_4:
                if (ani_4.getText().toString() == Animals.Animal[random_question]){
                    Toast.makeText(StartGame.this, "Correct", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(StartGame.this, "Incorrect", Toast.LENGTH_LONG).show();
                }
                ani_3.setChecked(false);
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
        }, 3000);


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

    }

}
