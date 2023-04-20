package org.geeksforgeeks.ver1504;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button searchButton;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    private TextView result;
    private LinearLayout log;
    private EditText first;
    private EditText third;


    @SuppressLint({"WrongViewCast", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        searchButton = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button6 = findViewById(R.id.button6);
        result = findViewById(R.id.result);
        log = findViewById(R.id.lala);
        first = findViewById(R.id.first);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setText(2);
        Button button6 = (Button)findViewById(R.id.button6);
        button1.setText(10);

        View.OnClickListener onClickListener = view -> {
            result.setText(Integer.toString(Integer.parseInt(Integer.toString(R.id.first, 10))));
        };
        searchButton.setOnClickListener(onClickListener);
    }
}
