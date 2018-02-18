package idoston.com.harftopish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
 *   Created by Doston Hamrakulov 18.02.2018
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Start_game(View view){
        startActivity(new Intent(MainActivity.this, StartGame.class));
    }
    private void Name(){
        String name = "Doston Hamrakulov";
        String email = "doston2509@gmail";
        String city = "Samarkand";
        String country = "Uzbekistan";
    }
}
