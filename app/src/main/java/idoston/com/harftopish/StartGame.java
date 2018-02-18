package idoston.com.harftopish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
/**
 * Created by Doston on 2/18/2018.
 */
public class StartGame extends AppCompatActivity {

    ImageView image;
    CheckBox ani_1, ani_2, ani_3, ani_4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        image = (ImageView)findViewById(R.id.id_image);

        ani_1 = (CheckBox) findViewById(R.id.id_ani_1);
        ani_2 = (CheckBox) findViewById(R.id.id_ani_2);
        ani_3 = (CheckBox) findViewById(R.id.id_ani_3);
        ani_4 = (CheckBox) findViewById(R.id.id_ani_4);
        btn = (Button) findViewById(R.id.id_btn_check);


    }
}
