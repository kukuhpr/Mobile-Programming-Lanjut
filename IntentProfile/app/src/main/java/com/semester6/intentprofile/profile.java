package com.semester6.intentprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity {
    private Button btnTelpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnTelpon = (Button) findViewById(R.id.btnTelpon);
        btnTelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaIntentTelpon();
            }
        });
    }

    private void BukaIntentTelpon() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:089618815501"));
        startActivity(intent);
    }
}
