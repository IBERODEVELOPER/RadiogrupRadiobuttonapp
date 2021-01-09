package informatico.to.radiogrupradiobuttonapp;
/*El blog el informatico ibero https://mpersonales.blogspot.com/*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
/*CREATE BY RAUL TAMANI*/
public class MainActivity extends AppCompatActivity {
    //Variable locales
    private EditText num1,num2;
    private RadioButton Radiobuttonsuma,Radiobuttonresta;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Instanciamos las variables con los controles de la vista*/
        num1=(EditText)findViewById(R.id.etvalor1);
        num2=(EditText)findViewById(R.id.etvalor2);
        Radiobuttonsuma=(RadioButton)findViewById(R.id.radioButtonsuma);
        Radiobuttonresta=(RadioButton)findViewById(R.id.radioButtonresta);
        resultado=(TextView)findViewById(R.id.txtvresultado);
    }
/*Craemos un metodo para realizar el calculo*/
    public  void Operar(View view){
        /*Convertimos a string los datos de edittext*/
        String valor1=num1.getText().toString();
        String valor2=num2.getText().toString();
        /*Convertimos los datos de cadena a entero*/
        int nume1=Integer.parseInt(valor1);
        int nume2=Integer.parseInt(valor2);
/*Condicional si cualquier de los dos es diferente de true activo */
            if( !Radiobuttonsuma.isChecked()|| !Radiobuttonresta.isChecked()){
                /*Indicamos que muestre en el edittext*/
                resultado.setText("Seleccione una operación");
            }
            /*si el radiobuttonsuma esta activo entonces que realice una suma*/
            if(Radiobuttonsuma.isChecked()==true){
                /*creamos una variable entero y decimos que sea igual los dos numeros sumados*/
                int suma=nume1 + nume2;
                /*creamos el string y lo convertimos al entero en cadena
                para poder mostrarlo en el textview*/
                String res=String.valueOf(suma);
                /*Indicamos que se escriba el resultado de la operacion*/
                resultado.setText("La suma es: " + res);
            }
        /*si el radiobuttonresta esta activo entonces que realice una resta*/
            if(Radiobuttonresta.isChecked()==true){
                /*creamos una variable entero y decimos que sea igual los dos numeros restados*/
                int resta=nume1-nume2;
                 /*creamos el string y lo convertimos al entero en cadena
                para poder mostrarlo en el textview*/
                String resu=String.valueOf(resta);
                /*Indicamos que se escriba el resultado de la operacion*/
                resultado.setText("La resta es: " + resu);
            } }}