package com.example.appmovil1538800;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnCancelar = findViewById(R.id.btnCancelar);
        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        Button btnLimpiar = findViewById(R.id.btnLimpiar);

        EditText txtNombres = findViewById(R.id.txtNombresRegister);
        EditText txtEmail = findViewById(R.id.txtEmailRegister);
        EditText txtNumero = findViewById(R.id.txtNumeroRegister);
        EditText txtPassword = findViewById(R.id.txtPassRegister);




        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conectar = new Intent(Register.this, MainActivity.class);
                startActivity(conectar);
            }
        });
    }
}