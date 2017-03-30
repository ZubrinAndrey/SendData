package tests.senddata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ANDREY on 30.03.2017.
 */

public class SecondActivity extends AppCompatActivity {

   private TextView txtLogin;
   private TextView txtPass;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_layout);

        txtLogin = (TextView) findViewById(R.id.txtLogin);
        txtPass = (TextView) findViewById(R.id.txtPass);

        txtLogin.setText(getIntent().getStringExtra("login"));
        txtPass.setText(getIntent().getStringExtra("pass"));
    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
