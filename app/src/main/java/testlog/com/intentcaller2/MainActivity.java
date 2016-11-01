package testlog.com.intentcaller2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button inputBtn;
    private final int CALLER_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputBtn = (Button)findViewById(R.id.inputBtn);
        inputBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, IntentCallee2.class);
        startActivityForResult(intent, CALLER_REQUEST);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent){

        if(requestCode == CALLER_REQUEST){
            if(resultCode == RESULT_OK){
                String name = intent.getExtras().get("name").toString();
                String age = intent.getExtras().get("age").toString();

                TextView text_name = (TextView) findViewById(R.id.text_name);
                TextView text_age = (TextView) findViewById(R.id.text_age);

                text_name.setText(name);
                text_age.setText(age + " ");

            }
        }
    }

}
