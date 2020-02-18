package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static id.ac.polinema.intent.BundleActivity.AGE_KEY;
import static id.ac.polinema.intent.BundleActivity.NAME_KEY;
import static id.ac.polinema.intent.BundleActivity.USERNAME_KEY;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;
//    String username, name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // TODO: display value here


            usernameText.setText(bundle.getString("username"));
            nameText.setText(bundle.getString("name"));
            ageText.setText(String.valueOf(bundle.getInt("age")));
        }
    }
}
