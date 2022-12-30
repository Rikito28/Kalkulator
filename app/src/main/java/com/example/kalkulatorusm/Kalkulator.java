package com.example.kalkulatorusm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    TextView textInput, textOutput;

    String input, output, outputBaru;

    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonTambah, buttonKali, buttonKurang, buttonBagi, buttonKoma,
            buttonPersen, buttonPangkat, buttonHasil, buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textInput = findViewById(R.id.input_text);
        textOutput = findViewById(R.id.output_text);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonTambah = findViewById(R.id.btnTambah);
        buttonKali = findViewById(R.id.btnKali);
        buttonBagi = findViewById(R.id.btnBagi);
        buttonKurang = findViewById(R.id.btnKurang);
        buttonKoma = findViewById(R.id.btnKoma);
        buttonPangkat = findViewById(R.id.btnPangkat);
        buttonHasil = findViewById(R.id.btnHasil);
        buttonPersen = findViewById(R.id.btnPersen);
        buttonClear = findViewById(R.id.btnClear);

    }
    public void onButtonClicked(View view){

        Button button = (Button) view;
        String data = button.getText().toString();
        switch (data){
            case "C":
                input=null;
                output=null;
                outputBaru=null;
                textOutput.setText("");
                break;

            case "^":
                solve();
                input+="^";
                break;

            case "x":
                solve();
                input+="*";
                break;

            case "=":
                solve();
                break;

            case "%":
                input+="%";
                double d= Double.parseDouble(textInput.getText().toString()) / 100;
                textOutput.setText(String.valueOf(d));
                break;

            default:
                if(input == null){
                    input = "";
                }
                if (data.equals("+") || data.equals("/") || data.equals("-")){
                    solve();
                }
                input +=data;
        }
        textInput.setText(input);
    }

    private void solve(){
        if (input.split("\\+").length==2){
            String numbers [] = input.split("\\+");
            try{
                double d = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                outputBaru = cutDecimal(output);
                textOutput.setText(outputBaru);
                input = d +"";
            }catch (Exception e){
                textOutput.setError(e.getMessage().toString());
            }
        }

        if (input.split("\\*").length==2){
            String numbers [] = input.split("\\*");
            try{
                double d = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                outputBaru = cutDecimal(output);
                textOutput.setText(outputBaru);
                input = d +"";
            }catch (Exception e){
                textOutput.setError(e.getMessage().toString());
            }
        }

        if (input.split("\\/").length==2){
            String numbers [] = input.split("\\/");
            try{
                double d = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
                output = Double.toString(d);
                outputBaru = cutDecimal(output);
                textOutput.setText(outputBaru);
                input = d +"";
            }catch (Exception e){
                textOutput.setError(e.getMessage().toString());
            }
        }

        if (input.split("\\^").length==2){
            String numbers [] = input.split("\\^");
            try{
                double d = Math.pow(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
                output = Double.toString(d);
                outputBaru = cutDecimal(output);
                textOutput.setText(outputBaru);
                input = d +"";
            }catch (Exception e){
                textOutput.setError(e.getMessage().toString());
            }
        }
        if (input.split("\\-").length==2){
            String numbers [] = input.split("\\-");
            try{
                if (Double.parseDouble(numbers[0]) < Double.parseDouble(numbers[1])){
                    double d = Double.parseDouble(numbers[1]) - Double.parseDouble(numbers[2]);
                    output = Double.toString(d);
                    outputBaru = cutDecimal(output);
                    textOutput.setText("-" + outputBaru);
                    input = d +"";
                }
                else {
                    double d = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                    output = Double.toString(d);
                    outputBaru = cutDecimal(output);
                    textOutput.setText(outputBaru);
                    input = d + "";
                }
            }catch (Exception e){
                textOutput.setError(e.getMessage().toString());
            }
        }
    }
    private String cutDecimal(String number){
        String n [] = number.split("\\.");
        if(n.length > 1){
            if(n[1].equals("0")){
                number = n[0];
            }
        }
        return number;
    }
}

