package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import model.User;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        User user = getIntent().getParcelableExtra("user");

        if (extras != null) {
            // TODO: display value here
            usernameText.setText(user.getUsername());
            nameText.setText(user.getName());
            ageText.setText(String.valueOf(user.getAge()));

        }
    }
}
