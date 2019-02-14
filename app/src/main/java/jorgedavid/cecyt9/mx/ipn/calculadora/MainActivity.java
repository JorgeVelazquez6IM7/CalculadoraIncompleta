package jorgedavid.cecyt9.mx.ipn.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSum,btnRes,btnMult,btnDiv,btnIgual;

    TextView operaciones, resultados;

    StringBuffer cadenaNumeritos = new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crea los botones

        btn0 = findViewById(R.id.Cero);
        btn1 = findViewById(R.id.Uno);
        btn2 = findViewById(R.id.Dos);
        btn3 = findViewById(R.id.Tres);
        btn4 = findViewById(R.id.Cuatro);
        btn5 = findViewById(R.id.Cinco);
        btn6 = findViewById(R.id.Seis);
        btn7 = findViewById(R.id.Siete);
        btn8 = findViewById(R.id.Ocho);
        btn9 = findViewById(R.id.Nueve);

        btnSum = findViewById(R.id.Suma);
        btnRes = findViewById(R.id.Resta);
        btnMult = findViewById(R.id.Mult);
        btnDiv = findViewById(R.id.Div);
        btnIgual = findViewById(R.id.Igual);
    }


    @Override
    public void onClick(View v) {

        if(v.getId() == btn0.getId()){
            anadeNumCadena("0");
        }else if (v.getId() == btn1.getId()){
            anadeNumCadena("1");
        }else if (v.getId() == btn2.getId()){
            anadeNumCadena("2");
        }else if (v.getId() == btn3.getId()){
            anadeNumCadena("3");
        }else if (v.getId() == btn4.getId()){
            anadeNumCadena("4");
        }else if (v.getId() == btn5.getId()){
            anadeNumCadena("5");
        }else if (v.getId() == btn6.getId()){
            anadeNumCadena("6");
        }else if (v.getId() == btn7.getId()){
            anadeNumCadena("7");
        }else if (v.getId() == btn8.getId()){
            anadeNumCadena("8");
        }else if (v.getId() == btn9.getId()){
            anadeNumCadena("9");
        }else if(v.getId() == btnSum.getId()){
            anadeNumCadena("+");
        }else if(v.getId() == btnRes.getId()){
            anadeNumCadena("-");
        }else if(v.getId() == btnMult.getId()){
            anadeNumCadena("x");
        }else if(v.getId() == btnDiv.getId()){
            anadeNumCadena("/");
        }else if(v.getId() == btnIgual.getId()){

        }

        //Perdi mi codigo donde tenia la calculadora bien profe, fue lo unico que pude hacer en 1 dia.
        //Perdi mi codigo donde tenia la calculadora bien profe, fue lo unico que pude hacer en 1 dia.
        //Perdi mi codigo donde tenia la calculadora bien profe, fue lo unico que pude hacer en 1 dia.
        //Perdi mi codigo donde tenia la calculadora bien profe, fue lo unico que pude hacer en 1 dia.
        //Perdi mi codigo donde tenia la calculadora bien profe, fue lo unico que pude hacer en 1 dia.
        //Perdi mi codigo donde tenia la calculadora bien profe, fue lo unico que pude hacer en 1 dia.

    }

    public void anadeNumCadena(String numerito){

        operaciones = findViewById(R.id.Operaciones);
        resultados = findViewById(R.id.Resultado);
        resultados.setText("0");

        operaciones.append(numerito);

    }



}


