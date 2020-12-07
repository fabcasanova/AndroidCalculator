package com.phatsmalone.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private Object object;
    private static final String ITEM_POSITION = "Position";
    private int position;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button percent;
    Button clearEntry;
    Button clearAll;
    Button multiply;
    ImageButton divide;
    Button subtract;
    Button add;
    Button decimal;
    Button result;
    ImageButton plusMinus;
    ImageButton squareRoot;
    ImageButton square;
    ImageButton delete;
    ImageButton oneOverX;
    TextView saltySpitoon, topView;
    double output, val1, val2, newVal;
    String[] mathExpression = new String[20];
    String arVal;
    int counter = 0;
    boolean div, mult, plus, minus;

    @Override
    protected void onSaveInstanceState(final Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(ITEM_POSITION, position);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
        position = savedInstanceState.getInt(ITEM_POSITION);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        percent = findViewById(R.id.percent);
        clearEntry = findViewById(R.id.clearentry);
        clearAll = findViewById(R.id.clearall);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        subtract = findViewById(R.id.subtract);
        add = findViewById(R.id.add);
        decimal = findViewById(R.id.decimal);
        result = findViewById(R.id.result);
        plusMinus = findViewById(R.id.plusminus);
        squareRoot = findViewById(R.id.squareroot);
        square = findViewById(R.id.square);
        delete = findViewById(R.id.delete);
        oneOverX = findViewById(R.id.oneoverx);
        saltySpitoon = findViewById(R.id.expression);
        topView = findViewById(R.id.Output);

    }

    public void onClickButton(View view){

        try{
            switch(view.getId()) {

                case R.id.zero:
                    counter++;
                    mathExpression[counter] = zero.getText().toString();
                    String zeroString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(zeroString);
                    break;

                case R.id.one:
                    counter++;
                    mathExpression[counter] = one.getText().toString();
                    String oneString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(oneString);
                    break;

                case R.id.two:
                    counter++;
                    mathExpression[counter] = two.getText().toString();
                    String twoString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(twoString);
                    break;

                case R.id.three:
                    counter++;
                    mathExpression[counter] = three.getText().toString();
                    String threeString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(threeString);
                    break;

                case R.id.four:
                    counter++;
                    mathExpression[counter] = four.getText().toString();
                    String fourString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(fourString);
                    break;

                case R.id.five:
                    counter++;
                    mathExpression[counter] = five.getText().toString();
                    String fiveString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(fiveString);
                    break;

                case R.id.six:
                    counter++;
                    mathExpression[counter] = six.getText().toString();
                    String sixString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(sixString);
                    break;

                case R.id.seven:
                    counter++;
                    mathExpression[counter] = seven.getText().toString();
                    String sevenString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(sevenString);
                    break;

                case R.id.eight:
                    counter++;
                    mathExpression[counter] = eight.getText().toString();
                    String eightString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(eightString);
                    break;

                case R.id.nine:
                    counter++;
                    mathExpression[counter] = nine.getText().toString();
                    String nineString = saltySpitoon.getText() + mathExpression[counter];

                    saltySpitoon.setText(nineString);
                    break;

                case R.id.decimal:

                    if (mathExpression != null || output != 0) {
                        counter++;
                        mathExpression[counter] = decimal.getText().toString();
                        String decimalString = saltySpitoon.getText() + mathExpression[counter];
                        saltySpitoon.setText(decimalString);
                        break;
                    }

                case R.id.percent:

                    arVal= "/100";
                    //put into top view to see the expression
                    String express = (saltySpitoon.getText().toString());
                    topView.setText(express + arVal);
                    val1 = Double.parseDouble(express);
                    output =  val1 / 100;
                    saltySpitoon.setText(String.format("%.2f", output));
                    break;

                case R.id.squareroot:
                    String sExpress = (saltySpitoon.getText().toString());
                    String sRoot = "v--(" + sExpress + ")";
                    topView.setText(sRoot);
                    output = Math.sqrt(Double.parseDouble(sExpress));
                    saltySpitoon.setText(String.format("%.2f", output));
                    break;

                case R.id.square:
                    arVal= "^2";
                    String squareExpress = (saltySpitoon.getText().toString());
                    String squareExpression = squareExpress + arVal;
                    topView.setText(squareExpression);
                    output = Math.pow(Double.parseDouble(squareExpress), 2);
                    saltySpitoon.setText(String.format("%.2f", output));
                    break;

                case R.id.oneoverx:
                    String overXExpress = (saltySpitoon.getText().toString());
                    String overXExpression = "1/(" + overXExpress + ")";
                    topView.setText(overXExpression);
                    output = 1 / (Double.parseDouble(overXExpress));
                    saltySpitoon.setText(String.format("%.4f", output));
                    break;

                case R.id.clearentry:

                    Arrays.fill(mathExpression, null);
                    counter = 0;
                    saltySpitoon.setText(zero.getHint());
                    break;

                case R.id.clearall:
                    topView.setText("");
                    Arrays.fill(mathExpression, null);
                    counter = 0;
                    saltySpitoon.setText(zero.getHint());
                    break;

                case R.id.delete:
                    mathExpression[counter] = null;
                    counter--;

                    String expression = saltySpitoon.getText().toString();

                    if (expression.length() >= 1) {

                        expression = expression.substring(0, expression.length() - 1);
                        saltySpitoon.setText(expression);
                    } else if (expression.length() == 0) {

                        saltySpitoon.setText(zero.getText().toString());
                    }
                    break;

                case R.id.divide:
                    arVal = "/";
                    val1 = Double.parseDouble(saltySpitoon.getText().toString());
                    String divideExpress = saltySpitoon.getText().toString() + arVal;
                    topView.setText(divideExpress);
                    saltySpitoon.setText(zero.getHint());
                    div = true;
                    mult = false;
                    plus = false;
                    minus = false;
                    break;

                case R.id.multiply:
                    arVal= "*";
                    val1 = Double.parseDouble(saltySpitoon.getText().toString());
                    String multiplyExpress = saltySpitoon.getText().toString() + arVal;
                    topView.setText(multiplyExpress);
                    saltySpitoon.setText(zero.getHint());
                    div = false;
                    mult = true;
                    plus = false;
                    minus = false;
                    break;

                case R.id.add:
                    arVal = "+";
                    val1 = Double.parseDouble(saltySpitoon.getText().toString());
                    String addExpress = saltySpitoon.getText().toString() + arVal;
                    topView.setText(addExpress);
                    saltySpitoon.setText(zero.getHint());
                    div = false;
                    mult = false;
                    plus = true;
                    minus = false;
                    break;

                case R.id.subtract:
                    arVal = "-";
                    val1 = Double.parseDouble(saltySpitoon.getText().toString());
                    String minusExpress = saltySpitoon.getText().toString() + arVal;
                    topView.setText(minusExpress);
                    saltySpitoon.setText(zero.getHint());
                    div = false;
                    mult = false;
                    plus = false;
                    minus = true;
                    break;

                case R.id.plusminus:
                    newVal = Double.parseDouble(saltySpitoon.getText().toString());
                    val1 = -newVal;
                    newVal = 0;
                    saltySpitoon.setText(String.format("%.2f", val1));
                    break;

                case R.id.result:
                    val2 = Double.parseDouble(saltySpitoon.getText().toString());
                    String value = saltySpitoon.getText().toString();
                    Calculations calc = new Calculations(val1, val2);
                    if (div) {

                        calc.divide();
                        topView.append(value);
                        saltySpitoon.setText(String.format("%.2f", calc.getResult()));
                    } else if (mult) {

                        calc.multiply();
                        topView.append(value);
                        saltySpitoon.setText(String.format("%.2f", calc.getResult()));
                    } else if (plus) {

                        calc.add();
                        topView.append(value);
                        saltySpitoon.setText(String.format("%.2f", calc.getResult()));
                    } else if (minus) {

                        calc.subtract();
                        topView.append(value);
                        saltySpitoon.setText(String.format("%.2f", calc.getResult()));
                    }
                    break;
            }
        }
        catch(Exception e){

            Arrays.fill(mathExpression, null);
            counter = 0;
            saltySpitoon.setText(zero.getHint());
        }
    }
}

