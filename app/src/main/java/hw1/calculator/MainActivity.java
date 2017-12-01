package hw1.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTextView, tvResultTextView;
    Button btnClear, btnBackSpace, btnEquals;
    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    Button btnDivide, btnMultiply, btnSubstract, btnAdd, btnModulo;

    int num1 = 0;
    int num2 = 0;
    String operator = "";
    String textArea = "";
    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find elements
        tvTextView = findViewById(R.id.inputTextView);
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
        btnModulo = findViewById(R.id.btnModulo);

        //Set listeners
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.setText("");
                tvResultTextView.setText("");
            }
        });
        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textArea = tvTextView.getText().toString();
                int textSize = textArea.length();
                if(textSize == 0) return;
                textArea = textArea.substring(0, textSize - 1);
                tvTextView.setText(textArea);
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
                tvTextView.append("1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
        btnModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.append("%");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textArea = tvTextView.getText().toString();
                String arrayString[] = textArea.split("[-%+*/]");

                int operandOne = Integer.parseInt(arrayString[0]);
                Log.d("operandOne: " , arrayString[0]);
                int operandTwo = Integer.parseInt(arrayString[1]);
                Log.d("Operator: ", operator);
                Log.d("OperandTwo: ", arrayString[1]);

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
                    case "%":
                        result = operandOne % operandTwo;
                        break;
                    default:
                        break;
                }
                Log.d("result: ", "" + result);
                tvResultTextView.setText("= " + result);
            }
        });
    }
}
