package kg.geektech.courses.android3.lesson1sept.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import kg.geektech.courses.android3.lesson1sept.R;
import kg.geektech.courses.android3.lesson1sept.data.local.PreferenceUtils;
import kg.geektech.courses.android3.lesson1sept.ui.UserinfoActivity;

public class MainActivity
        extends AppCompatActivity
        implements  View.OnClickListener {

    private EditText userName;
    private EditText userPass;
    private Button logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.user_name_et);
        userPass = findViewById(R.id.user_pass_et);
        logIn = findViewById(R.id.log_in_btn);
        logIn.setOnClickListener(this);

        if (!PreferenceUtils.getUserName().isEmpty()) {
            startActivity(new Intent(this, UserinfoActivity.class));
        }
    }
    

    @Override
    public void onClick(View view) {
        PreferenceUtils.saveUserName(userName.getText().toString());
        Intent intent = new Intent(this, UserinfoActivity.class);
        startActivity(intent);
    }
}