package edu.tecii.android.practica4_convnumdinero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputNumber)
    EditText inputNumber;
    @Bind(R.id.btnConvertion)
    Button btnConvertion;
    @Bind(R.id.inputbill100)
    TextView inputbill100;
    @Bind(R.id.inputbill50)
    TextView inputbill50;
    @Bind(R.id.inputbill20)
    TextView inputbill20;
    @Bind(R.id.inputcoin10)
    TextView inputcoin10;
    @Bind(R.id.inputcoin5)
    TextView inputcoin5;
    @Bind(R.id.inputcoin2)
    TextView inputcoin2;
    @Bind(R.id.inputcoin1)
    TextView inputcoin1;
    @Bind(R.id.inputcent50)
    TextView inputcent50;
    @Bind(R.id.inputcent20)
    TextView inputcent20;
    @Bind(R.id.inputcent10)
    TextView inputcent10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnConvertion)
    public void convertion(){
        String number = inputNumber.getText().toString();
        if (!number.isEmpty()) {
            int partint, partdec;
            int b100, b50, b20, co10, co5, co2, co1, c50, c20, c10;
            double num = Double.parseDouble(number);
            partint = (int)(num);
            b100 = partint / 100;
            partint = partint % 100;
            b50 = partint / 50;
            partint = partint & 50;
            b20 = partint / 20;
            partint = partint % 20;
            co10 = partint / 10;
            partint = partint % 10;
            co5 = partint / 5;
            partint = partint % 5;
            co2 = partint / 2;
            partint = partint % 2;
            co1 = partint;

            partdec = (int)(num * 1000+0.5);
            c50 = partdec / 500;
            partdec = partdec % 500;
            c20 = partdec / 200;
            partdec = partdec % 200;
            c10 = partdec / 100;

            String result1 = "", result2 = "", result3 = "", result4 = "", result5 = "", result6 = "",
                    result7 = "", result8 = "", result9 = "", result10 = "";
            result1 = "El total de billetes de 100 es: " + b100 + "";
            result2 = "El total de billetes de 50 es: " + b50 + "";
            result3 = "El total de billetes de 20 es: " + b20 + "";
            result4 = "El total de monedas de 10 es: " + co10 + "";
            result5 = "El total de monedas de 5 es: " + co5 + "";
            result6 = "El total de monedas de 2 es: " + co2 + "";
            result7 = "El total de monedas de 1 es: " + co1 + "";
            result8 = "El total de monedas de 50 centavos es: " + c50 + "";
            result9 = "El total de monedas de 20 centavos es: " + c20 + "";
            result10 = "El total de monedas de 10 centavos es: " + c10 + "";

            inputbill100.setText(result1);
            inputbill50.setText(result2);
            inputbill20.setText(result3);
            inputcoin10.setText(result4);
            inputcoin5.setText(result5);
            inputcoin2.setText(result6);
            inputcoin1.setText(result7);
            inputcent50.setText(result8);
            inputcent20.setText(result9);
            inputcent10.setText(result10);

        }
    }

}
