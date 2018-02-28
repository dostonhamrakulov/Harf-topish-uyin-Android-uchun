package idoston.com.harftopish;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

            Toast.makeText(StartGameEn.this, "Moving to English version", Toast.LENGTH_LONG).show();
            startActivity(new Intent(StartGameEn.this, StartGameEn.class));
            return true;
        }
        switch(id){
            case R.id.id_about_using:
                Toast.makeText(StartGameEn.this, "Instruction", Toast.LENGTH_LONG).show();
                return true;
            case R.id.id_exit_app_home:
                Exit_alert();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void Exit_alert(){
        AlertDialog.Builder alert_builder = new AlertDialog.Builder(this);
        alert_builder.setMessage("Would you like to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(StartGameEn.this, "Bye!", Toast.LENGTH_SHORT).show();
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alert = alert_builder.create();
        alert.setTitle("Warning!");
        alert.show();
    }
}
