package testlog.com.intentcaller2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by next on 2016. 11. 1..
 */
public class IntentCallee2 extends AppCompatActivity implements View.OnClickListener{

    Button inputBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentcalle2);

        inputBtn = (Button)findViewById(R.id.inputBtn);
        inputBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_age = (EditText) findViewById(R.id.et_age);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("name", et_name.getText());
        intent.putExtra("age", et_age.getText());
        setResult(RESULT_OK, intent);
        finish();

    }
}
