package idoston.com.harftopish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity_0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_0);
    }
    public void Move_uz(View view){
        startActivity(new Intent(MainActivity_0.this, MainActivity.class));
    }
    public void Move_en(View view){
        startActivity(new Intent(MainActivity_0.this, MainActivity.class));
    }
}
