package com.mdp.plantsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button simponi;
    private EditText etnama,etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etnama = findViewById(R.id.et_username);
        etpass = findViewById(R.id.et_password);

        simponi = findViewById(R.id.btn_login);

        simponi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama,pass;

                nama = etnama.getText().toString();
                pass = etpass.getText().toString();

                if(nama.trim().equals(""))
                {
                    etnama.setError("Nama tidak boleh kosong");
                    return;
                }

                if(pass.trim().equals(""))
                {
                    etpass.setError("Password tidak boleh kosong");
                    return;
                }

                Toast.makeText(LoginActivity.this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show();

                Uri webPage = Uri.parse("https://plantsapp.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
                startActivity(intent);

            }



        });



    }
}