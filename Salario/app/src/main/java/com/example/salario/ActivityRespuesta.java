package com.example.salario;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityRespuesta extends AppCompatActivity {

        private TextView tvAntiguedad;
        private TextView tvSueldo;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_respuesta);
            tvAntiguedad=(TextView)findViewById(R.id.txtviewantiguedad);
            tvSueldo=(TextView)findViewById(R.id.txtviewsalario);
            Bundle bundle = getIntent().getExtras();
            String sueldo=bundle.getString("txtSueldo");
            String antiguedad=bundle.getString("txtAntiguedad");
            Double SI  = Double.parseDouble(sueldo);
            Double AN = Double.parseDouble(antiguedad);
            Double M = null;
            Double  AU ;
            if ((SI<500)&&(AN>=10)){
                M=SI*0.20;
                AU=SI+M;
            }
            else if((SI<500)&&(AN<10)){

                    M=SI*0.05;
                    AU=SI+M;

            } else{
                M=0.0;
                AU=SI;
            }
            tvAntiguedad.setText(M.toString());
            tvSueldo.setText(AU.toString());

        }

    public void finalizar(View v) {
        Toast.makeText(ActivityRespuesta.this,"REGRESANDO...", Toast.LENGTH_LONG).show();
            finish();
    }

}
