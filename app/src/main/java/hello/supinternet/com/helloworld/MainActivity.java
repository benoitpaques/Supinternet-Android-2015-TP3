package hello.supinternet.com.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Button button;

    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        fillValues();
        fillViews();
        handleEvents();

    }

    private void fillValues(){
        list.add("Hello");
        list.add("Bonjour");
        list.add("Hola");
    }

    private void fillViews(){

        textView = (TextView) findViewById(R.id.activity_main_text);

        button = (Button) findViewById(R.id.activity_main_button);

    }

    public void handleEvents(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(list);
                textView.setText(list.get(0));
            }
        });
    }


}
