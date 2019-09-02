package mx.edu.itl.a2019.c16130811.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mx.edu.itl.a2019.c16130811.platzigram.view.ContainerActivity;
import mx.edu.itl.a2019.c16130811.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View v){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void goLoginAccount(View v){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
