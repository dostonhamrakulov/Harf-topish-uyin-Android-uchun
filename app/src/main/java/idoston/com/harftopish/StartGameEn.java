package idoston.com.harftopish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartGameEn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game_en);
    }
    public void Move_animals_en(View view){
        startActivity(new Intent(StartGameEn.this, AnimalEn.class));
    }
    public void Move_countries_en(View view){
        startActivity(new Intent(StartGameEn.this, CountriesEnGame.class));
    }
}
