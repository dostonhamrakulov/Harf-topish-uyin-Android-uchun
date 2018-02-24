package idoston.com.harftopish;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class countries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
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
