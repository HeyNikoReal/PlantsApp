package com.mdp.plantsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private Button signups;
    private EditText etnama, etpass, etconpass, etemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etnama = findViewById(R.id.et_name);
        etpass = findViewById(R.id.et_pass);
        etemail = findViewById(R.id.et_email);
        etconpass = findViewById(R.id.et_confirmpassword);

        signups = findViewById(R.id.btn_sign_up);

        signups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama, pass, email, conpass;

                nama = etnama.getText().toString();
                pass = etpass.getText().toString();
                email = etemail.getText().toString();
                conpass = etconpass.getText().toString();


                if (nama.trim().equals("")) {
                    etnama.setError("Nama tidak boleh kosong");
                    return;
                }

                if (email.trim().equals("")) {
                    etemail.setError("Email tidak boleh kosong");
                    return;
                }

                if (pass.trim().equals("")) {
                    etpass.setError("Password tidak boleh kosong");
                    return;
                }

                if (conpass.trim().equals(pass.trim())) {
                    Toast.makeText(SignUpActivity.this, "Anda Berhasil Sign Up", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                    startActivity(intent);

                } else {
                    etconpass.setError("Confirm Password harus sama dengan Password");
                    return;
                }

            }
        });


    }
}