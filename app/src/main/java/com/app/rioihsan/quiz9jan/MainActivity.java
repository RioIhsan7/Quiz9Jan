package com.app.rioihsan.quiz9jan;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nama, kelas, jurusan;
    TextView hasil;
    Button proses, alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Deklarasi Button
        proses = (Button)findViewById(R.id.btnProses);
        alert = (Button)findViewById(R.id.btnAlert);
        // Deklarasi TextView
        hasil = (TextView)findViewById(R.id.hasil);
        // Deklarasi EditText
        nama = (EditText)findViewById(R.id.inputNama);
        kelas = (EditText)findViewById(R.id.inputKelas);
        jurusan = (EditText)findViewById(R.id.inputJurusan);

        // Menambahkan Aksi
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proses1();
            }
        });
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert1();
            }
        });
        System.out.println("Nama anda Rio Ihsan");
        System.out.println("Kelas anda X RPL 1");
        System.out.println("Jurusan anda Rekayasa Perangkat Lunak");
    }

    private void alert1() {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Information")
                .setMessage("Nama anda :"+nama.getText().toString()+"\nKelas anda :"+kelas.getText().toString()+"\nJurusan anda :"+jurusan.getText().toString())
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .show();

    }

    private void proses1() {
        hasil.setText("Nama : "+nama.getText().toString()+"\nKelas :"+kelas.getText().toString()+"\nJurusan :"+jurusan.getText().toString());
    }


}
