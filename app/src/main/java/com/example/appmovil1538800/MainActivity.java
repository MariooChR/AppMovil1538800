package com.example.appmovil1538800;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        //Iniciar objetos para cada control en XML (Llamada de FrontEnd)

        Button btnLogin = findViewById(R.id.lblLogin);
        TextView lblRegistrate = findViewById(R.id.lblRegistrate);
        TextView lblResetPass = findViewById(R.id.lblResetPass);
        EditText txtUser = findViewById(R.id.lblUsernameLogin);
        EditText txtPassLogin = findViewById(R.id.lblContraseñaLogin);

        //TextView lblRegistrate debe abrir la vista -> Register

        lblRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conectar = new Intent(MainActivity.this,Register.class);
                startActivity(conectar);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent con = new Intent(MainActivity.this,IngresoApp.class);
                startActivity(con);
            }
        });



    }
}