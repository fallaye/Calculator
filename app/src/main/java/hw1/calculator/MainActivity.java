package hw1.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    TextView tvTextView, mOperandTwoTextView, mOperatorTextView, tvResultTextView;
    Button btnClear, btnBackSpace, btnEquals;
    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    Button btnDivide, btnMultiply, btnSubstract, btnAdd, btnDecimal;

    float num1 = 0;
    float num2 = 0;
    String operator = "";
    String textArea = "";
    float result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find elements
        tvTextView = findViewById(R.id.inputTextView);
        //mOperandTwoTextView = findViewById(R.id.operandTwoTextView);
        //mOperatorTextView = findViewById(R.id.operatorTextView);
        tvResultTextView = findViewById(R.id.resultTextView);
        btnClear = findViewById(R.id.btnClear);
        btnBackSpace = findViewById(R.id.btnBack);
        btnEquals = findViewById(R.id.btnEquals);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnSubstract = findViewById(R.id.btnSubtract);
        btnAdd = findViewById(R.id.btnAdd);
        btnDecimal = findViewById(R.id.btnDecimal);


        //Set listeners
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textArea += "1";
                tvTextView.append("1");

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //textArea += "2";
                tvTextView.append("2");

            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("3");

            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("4");

            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("5");

            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvTextView.append("6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("7");

            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("8");

            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("9");

            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("/");
                operator = "/";

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("*");
                operator = "*";

            }
        });
        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("-");
                operator = "-";
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("+");
                operator = "+";
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append(".");
            }
        });


        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textArea = tvTextView.getText().toString();
                String arrayString[] = textArea.split("/");

                int operandOne = Integer.parseInt(arrayString[0]);
                Log.d("operandOne: " , arrayString[0]);
                int operandTwo = Integer.parseInt(arrayString[1]);
                Log.d("Operator: ", operator);
                Log.d("OperandTwo: ", arrayString[1]);
                //operator = arrayString[1];

                switch (operator) {
                    case "/":
                        result = operandOne / operandTwo;
                        break;
                    case "*":
                        result = operandOne * operandTwo;
                        break;
                    case "-":
                        result = operandOne - operandTwo;
                        break;
                    case "+":
                        result = operandOne + operandTwo;
                        break;
                    default:
                        break;
                }

                Log.d("result: ", "" + result);


                tvResultTextView.setText("= " + result);

            }
        });


        //Set the value of textArea
        //tvTextView.setText("textArea");
    }

    //@Override
    /*public void onClick(View view) {
        float num1 = 0;
        float num2 = 0;
        String operator = "";
        String textArea = "";
        float result = 0;

        //Get user input
        switch (view.getId()){
            case R.id.btnOne:
                textArea += "1";
            case R.id.btnTwo:
                textArea += "2";
            case R.id.btnThree:
                textArea += "3";
            case R.id.btnFour:
                textArea += "4";
            case R.id.btnFive:
                textArea += "5";
            case R.id.btnSix:
                textArea += "6";
            case R.id.btnSeven:
                textArea += "7";
            case R.id.btnEight:
                textArea += "8";
            case R.id.btnNine:
                textArea += "9";
        }

        //check if the fields are empty
        *//*if (TextUtils.isEmpty(mOperandOneTextView.getText().toString()) ||
                TextUtils.isEmpty(mOperatorTextView.getText().toString()) ||
                TextUtils.isEmpty(mOperandTwoTextView.getText().toString())) {
            return;
        }*//*
        if (TextUtils.isEmpty(mOperandOneTextView.getText().toString())) {
            return;
        }





        //Read operands from TextView fields
        //and assign them to num1 and num2
        num1 = Float.parseFloat(mOperandOneTextView.getText().toString());
        num2 = Float.parseFloat(mOperandTwoTextView.getText().toString());

        //Read operator and perform the corresponding calculations
        //operator = mOperatorTextView.getText().toString();
        switch (view.getId()) {
            case R.id.btnDivide:
                operator = "/";
                result = num1 / num2;
                break;
            case R.id.btnMultiply:
                operator = "*";
                result = num1 * num2;
                break;
            case R.id.btnSubtract:
                operator = "-";
                result = num1 - num2;
                break;
            case R.id.btnAdd:
                operator = "+";
                result = num1 + num2;
                break;



            default:
                break;
        }
        //Set the result on the resultTextView field
        mResultTextView.setText(num1 + " " + operator + " " + num2 + " = " + result);

    }*/


}
