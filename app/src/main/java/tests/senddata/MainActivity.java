package tests.senddata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText password;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
    }

    public void sendData (View view) {
        Intent intent = new Intent (this, SecondActivity.class);
        intent.putExtra("login", login.getText().toString());
        intent.putExtra("pass", password.getText().toString());
        startActivity(intent);

    }
}
