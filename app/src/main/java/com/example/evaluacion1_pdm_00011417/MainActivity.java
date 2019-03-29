package com.example.evaluacion1_pdm_00011417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText et1, et2;
    String numero;
    TextView tv1, tv2, tv3, tv4,tv5,tv6,tv7,tv8,tv9;
    int numero1=0, numero2=0,numero3=0,numero4=0,numero5=0,numero6=0,numero7=0,numero8=0,numero9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = numero1+1;
                tv1.setText("Producto\n"+numero1);

            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero2 = numero2+1;
                tv2.setText("Producto\n"+numero2);

            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero3 = numero3+1;
                tv3.setText("Producto\n"+numero3);

            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero4 = numero4+1;
                tv4.setText("Producto\n"+numero4);

            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero5 = numero5+1;
                tv5.setText("Producto\n"+numero5);

            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero6 = numero6+1;
                tv6.setText("Producto\n"+numero6);

            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero7 = numero7+1;
                tv7.setText("Producto\n"+numero7);

            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero8 = numero8+1;
                tv8.setText("Producto\n"+numero8);

            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero9 = numero9+1;
                tv9.setText("Producto\n"+numero9);

            }
        });




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent avanzar = new Intent(MainActivity.this,New.class);
                int total = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7+ numero8 + numero9;
                avanzar.putExtra("dato",et1.getText().toString());
                avanzar.putExtra("dato2",et2.getText().toString());
                avanzar.putExtra("dato3",total);
                startActivity(avanzar);

            }
        });



    }

    public void inicializar()
    {
        btn1 = (Button)findViewById(R.id.button);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        tv6 = (TextView)findViewById(R.id.tv6);
        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
        tv9 = (TextView)findViewById(R.id.tv9);

    }
}
