package com.example.final_3ercorte;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usuario, contraseña;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contraseña = findViewById(R.id.contraseña);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = usuario.getText().toString();
                String pass = contraseña.getText().toString();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Campo(s) vacío(s)", Toast.LENGTH_SHORT).show();
                } else {
                    // Llamar al servicio de login
                    loginService(user, pass);
                }
            }
        });
    }

    private void loginService(String user, String pass) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, new HomeFragment());
        transaction.commit();
    }
}