package com.example.evaluacion1_pdm_00011417;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class New extends AppCompatActivity {

    TextView tv1, tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        inicializar();
        String dato = getIntent().getStringExtra("dato");
        String dato2 = getIntent().getStringExtra("dato2");
        int dato3 = getIntent().getIntExtra("dato3",0);

        tv1.setText("Usuario: "+dato);
        tv2.setText("Correo: "+dato2);
        tv3.setText("Total: "+dato3);

    }


    public void inicializar()
    {
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
    }
}
