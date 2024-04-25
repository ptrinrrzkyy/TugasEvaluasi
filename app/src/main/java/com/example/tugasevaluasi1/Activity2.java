package com.example.tugasevaluasi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView txtStb, txtNama;
    private EditText txtNilaiTugas, txtNilaiFinal, txtNilaiMid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtStb = findViewById(R.id.txt_stb);
        txtNama = findViewById(R.id.txt_nama);
        txtNilaiTugas = findViewById(R.id.txt_input_nilai_tugas);
        txtNilaiMid = findViewById(R.id.txt_input_nilai_mid);
        txtNilaiFinal = findViewById(R.id.txt_input_nilai_final);

        Intent intent = getIntent();
        String stb, nama;

        stb = intent.getStringExtra(MainActivity.KEY_STB);
        nama = intent.getStringExtra(MainActivity.KEY_NAMA);

        txtStb.setText(stb);
        txtNama.setText(nama);
    }

    public void inputSelesai(View view){
        Intent intent = new Intent();
        intent.putExtra(MainActivity.KEY_NILAI_TUGAS, txtNilaiTugas.getText().toString());
        intent.putExtra(MainActivity.KEY_NILAI_MID, txtNilaiTugas.getText().toString());
        intent.putExtra(MainActivity.KEY_NILAI_FINAL, txtNilaiFinal.getText().toString());
        setResult(MainActivity.RESULT_OK, intent);
        finish();
    }

    public void inputBatal(View view){
        Intent intent = new Intent();
        setResult(MainActivity.RESULT_CANCEL, intent);
        finish();
    }
}
