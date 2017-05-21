package fatty.a53sound;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setContentView(R.layout.sound_view);
            }
        });
    }


}
