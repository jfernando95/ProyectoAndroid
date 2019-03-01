package com.example.kamran.bluewhite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    ImageView sback;
    Button access;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        sback = (ImageView)findViewById(R.id.sinb);
        access=(Button)findViewById(R.id.ingreso);
        access.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario=((EditText)findViewById(R.id.usrusr)).getText().toString();
                String password=((EditText)findViewById(R.id.pswrd)).getText().toString();
                if(usuario.equals("admin")&& password.equals("admin")){
                    Intent it = new Intent(signin.this,mimenuNavegacion.class);
                    startActivity(it);
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña Incorrecta",Toast.LENGTH_SHORT).show();

                }
            }
        });
        /*sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(signin.this,main.class);
                startActivity(it);
            }
        });*/
    }
}
