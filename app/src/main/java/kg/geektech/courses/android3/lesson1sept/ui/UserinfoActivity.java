package kg.geektech.courses.android3.lesson1sept.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kg.geektech.courses.android3.lesson1sept.R;
import kg.geektech.courses.android3.lesson1sept.data.local.PreferenceUtils;
import kg.geektech.courses.android3.lesson1sept.ui.main.MainActivity;

public class UserinfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        TextView userName = findViewById(R.id.textView);
        userName.setText(PreferenceUtils.getUserName());        Button button = findViewById(R.id.btnLogOut);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PreferenceUtils.clearData();
                finish();
            }
        });
    }
}