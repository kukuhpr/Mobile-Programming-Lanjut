package com.semester6.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang;
    private EditText etLebar;
    private EditText etTinggi;
    private TextView tvHasil;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        initEvent();
    }

    private void initEvent() {
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HitungVolume();
            }
        });
    }

    private void HitungVolume() {
        int Panjang = Integer.parseInt(etPanjang.getText().toString());
        int Lebar = Integer.parseInt(etLebar.getText().toString());
        int Tinggi = Integer.parseInt(etTinggi.getText().toString());
        int volume = Panjang * Lebar * Tinggi;
        tvHasil.setText("Volume Balok =" + volume);
    }

    private void initUi() {
        etPanjang=(EditText) findViewById(R.id.etPanjang);
        etLebar=(EditText) findViewById(R.id.etLebar);
        etTinggi=(EditText) findViewById(R.id.etTinggi);
        tvHasil=(TextView) findViewById(R.id.tvHasil);
        btnHitung=(Button) findViewById(R.id.btnHitung);
    }
}
