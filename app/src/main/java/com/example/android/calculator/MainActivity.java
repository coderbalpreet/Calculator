package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonClear,buttonBackspace,buttonPercentage,buttonDivide,buttonNine,buttonEight,buttonSeven,buttonMultipy
            ,buttonSix,buttonFive,buttonFour,buttonMinus,buttonThree,buttonTwo,buttonOne,buttonPlus,buttonZero,buttonDot,buttonEquals;
    TextView textView1,textView2;
    private double first,second,result;
    private String operation,ans;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBackspace=findViewById(R.id.buttonBackspace);
        buttonOne=findViewById(R.id.buttonOne);
        buttonTwo=findViewById(R.id.buttonTwo);
        buttonThree=findViewById(R.id.buttonThree);
        buttonFour=findViewById(R.id.buttonFour);
        buttonFive=findViewById(R.id.buttonFive);
        buttonSix=findViewById(R.id.buttonSix);
        buttonSeven=findViewById(R.id.buttonSeven);
        buttonEight=findViewById(R.id.buttonEight);
        buttonNine=findViewById(R.id.buttonNine);
        buttonZero=findViewById(R.id.buttonZero);
        buttonClear =findViewById(R.id.buttonClear);
        buttonMultipy=findViewById(R.id.buttonMultiply);
        buttonMinus=findViewById(R.id.buttonMinus);
        buttonPercentage=findViewById(R.id.buttonPercentage);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonEquals=findViewById(R.id.buttonEquals);
        buttonDot=findViewById(R.id.buttonDot);
        buttonDivide=findViewById(R.id.buttonDivide);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);



        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(null);
                textView2.setText(null);
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonZero.getText().toString();
                textView2.setText(text);

            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonOne.getText().toString();
                textView2.setText(text);

            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonTwo.getText().toString();
                textView2.setText(text);

            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonThree.getText().toString();
                textView2.setText(text);

            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonFour.getText().toString();
                textView2.setText(text);

            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonFive.getText().toString();
                textView2.setText(text);

            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonSix.getText().toString();
                textView2.setText(text);

            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonSeven.getText().toString();
                textView2.setText(text);

            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonEight.getText().toString();
                textView2.setText(text);

            }
        });


        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonNine.getText().toString();
                textView2.setText(text);

            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text= textView2.getText().toString()+buttonDot.getText().toString();
                textView2.setText(text);

            }
        });



        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String backSpace = null;
                if (textView2.getText().length()>0){


                    StringBuilder stringBuilder= new StringBuilder(textView2.getText());
                    stringBuilder.deleteCharAt(textView2.getText().length()-1);
                    backSpace=stringBuilder.toString();
                    textView2.setText(backSpace);



                }


            }
        });

//code for Operators
        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary ;
                first =Double.parseDouble((String) textView2.getText());
                primary =String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation= "%";

            }
        });


        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary ;
                first =Double.parseDouble((String) textView2.getText());
                primary =String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation= "-";

            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary ;
                first =Double.parseDouble((String) textView2.getText());
                primary =String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation= "+";

            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary ;
                first =Double.parseDouble((String) textView2.getText());
                primary =String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation= "/";

            }
        });

        buttonMultipy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primary ;
                first =Double.parseDouble((String) textView2.getText());
                primary =String.format("%.2f",first);
                textView1.setText(primary);
                textView2.setText("");
                operation= "*";

            }
        });

        //equals start from here
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second=Double.parseDouble((String) textView2.getText());
                if (operation=="+"){
                    result=first+second;
                    ans=String.format("%2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }

                if (operation=="/"){
                    result=first/second;
                    ans=String.format("%2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }

                if (operation=="-"){
                    result=first-second;
                    ans=String.format("%2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }

                if (operation=="*"){
                    result=first*second;
                    ans=String.format("%2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }

                if (operation=="%"){
                    result=first%second;
                    ans=String.format("%2f",result);
                    textView2.setText(ans);
                    textView1.setText(null);
                }

            }
        });











    }
}