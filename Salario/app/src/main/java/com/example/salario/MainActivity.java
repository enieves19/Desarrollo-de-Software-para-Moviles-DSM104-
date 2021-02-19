package com.example.salario;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText etSueldo;
    private EditText etAntiguedad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSueldo=(EditText)findViewById(R.id.txtSueldo);
        etAntiguedad=(EditText)findViewById(R.id.txtAntiguedad);
    }
    public void activityRespuesta (View v) {
        Intent i=new Intent(this, ActivityRespuesta.class);
        i.putExtra("txtSueldo", etSueldo.getText().toString());
        i.putExtra("txtAntiguedad", etAntiguedad.getText().toString());
        startActivity(i);
    }
}