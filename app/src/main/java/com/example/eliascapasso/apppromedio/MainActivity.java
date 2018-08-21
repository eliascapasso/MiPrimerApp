package com.example.eliascapasso.apppromedio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_mat;
    private EditText et_fis;
    private EditText et_qui;
    private TextView tv_estatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_mat = (EditText)findViewById(R.id.txt_mat);
        et_fis = (EditText)findViewById(R.id.txt_fis);
        et_qui = (EditText)findViewById(R.id.txt_qui);
        tv_estatus = (TextView)findViewById(R.id.tv_estatus);
    }

    public void evaluarAlumno(View view){
        int matematicas = Integer.parseInt(et_mat.getText().toString());
        int fisica = Integer.parseInt(et_fis.getText().toString());
        int quimica = Integer.parseInt(et_qui.getText().toString());

        int promedio = (matematicas + fisica + quimica) / 3;

        if(promedio >=6){
            tv_estatus.setText("Estatus aprobado con " + promedio);
        }
        else{
            tv_estatus.setText("Estatus reprobado con " + promedio);
        }
    }
}
