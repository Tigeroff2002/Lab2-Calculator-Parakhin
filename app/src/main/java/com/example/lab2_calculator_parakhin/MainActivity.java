package com.example.lab2_calculator_parakhin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button mButton0, mButton1, mButton2, mButton3, mButton4;
    Button mButton5, mButton6, mButton7, mButton8, mButton9;
    Button mButtonComma, mButtonPlus, mButtonMinus, mButtonDivide, mButtonMultiply;
    Button mButtonEquals, mButtonSqr, mButtonSqrt, mButtonMS, mButtonM;
    EditText mEditText;
    String [] Mvalues = new String[15];
    int currentIndex;
    String wholeText;
    String currentText;
    boolean mAddition, mSubtract, mMultiplication, mDivision, mSqr, mSqrt;

    private String provideOperations(){
        float commonResult = 0;
        String[] newValues = new String[15];
        for(int i = 0; i < newValues.length; i++){
            newValues[i] = "";
        }

        for(int j = 0; j < Mvalues.length - 1; j = j + 1){
            if (Mvalues[j].equals("*")){
                float curResult = Float.parseFloat(Mvalues[j - 1]) * Float.parseFloat(Mvalues[j + 1]);
                newValues[j - 1] = Float.toString(curResult);
                newValues[j] = Mvalues[j];
            }
            else if (Mvalues[j].equals("/")){
                float curResult = Float.parseFloat(Mvalues[j - 1]) / Float.parseFloat(Mvalues[j + 1]);
                newValues[j - 1] = Float.toString(curResult);
                newValues[j] = Mvalues[j];
            }
            else if (Mvalues[j].equals("sqr")){
                float curResult = Float.parseFloat(Mvalues[j + 1]) * Float.parseFloat(Mvalues[j + 1]);
                newValues[j] = Float.toString(curResult);
                newValues[j + 1] = Mvalues[j + 1];
            }
            else if (Mvalues[j].equals("sqrt")){
                double curResult = Math.sqrt(Float.parseFloat(Mvalues[j + 1]));
                newValues[j] = Double.toString(curResult);
                newValues[j + 1] = Mvalues[j + 1];
            }
        }

        commonResult = provideBaseOperations(newValues);

        return Float.toString(commonResult);
    }

    private float provideBaseOperations(String[] newValues){
        float result = 0;
        int i = 0;
        result = Float.parseFloat(newValues[i]);
        while (!newValues[i + 1].equals("")){
            if (newValues[i + 1].equals("+")){
                result += Float.parseFloat(newValues[i + 2]);
            }
            if (newValues[i + 1].equals("-")){
                result -= Float.parseFloat(newValues[i + 2]);
            }
            i += 2;
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton0 = (Button) findViewById(R.id.button0);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);
        mButton7 = (Button) findViewById(R.id.button7);
        mButton8 = (Button) findViewById(R.id.button8);
        mButton9 = (Button) findViewById(R.id.button9);
        mButtonComma = (Button) findViewById(R.id.buttonComma);
        mButtonPlus = (Button) findViewById(R.id.buttonPlus);
        mButtonMinus = (Button) findViewById(R.id.buttonMinus);
        mButtonMultiply = (Button) findViewById(R.id.buttonMultiply);
        mButtonDivide = (Button) findViewById(R.id.buttonDivide);
        mButtonEquals = (Button) findViewById(R.id.buttonEquals);
        mButtonSqr = (Button) findViewById(R.id.buttonSqr);
        mButtonSqrt = (Button) findViewById(R.id.buttonSqrt);
        mButtonMS = (Button) findViewById(R.id.buttonMS);
        mButtonM = (Button) findViewById(R.id.buttonM);

        mEditText = (EditText) findViewById(R.id.editText1);

        for(int i = 0; i < Mvalues.length; i++){
            Mvalues[i] = "";
        }

        currentText = "";
        wholeText = "";

        currentIndex = 0;

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "1";
                wholeText += "1";
                mEditText.setText(wholeText);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "2";
                wholeText += "2";
                mEditText.setText(wholeText);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "3";
                wholeText += "3";
                mEditText.setText(wholeText);
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "4";
                wholeText += "4";
                mEditText.setText(wholeText);
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "5";
                wholeText += "5";
                mEditText.setText(wholeText);
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "6";
                wholeText += "6";
                mEditText.setText(wholeText);
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "7";
                wholeText += "7";
                mEditText.setText(wholeText);
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "8";
                wholeText += "8";
                mEditText.setText(wholeText);
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "9";
                wholeText += "9";
                mEditText.setText(wholeText);
            }
        });

        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("0")){
                    return;
                }
                currentText += "0";
                wholeText += "0";
                mEditText.setText(wholeText);
            }
        });

        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    int index = currentIndex;
                    if (index >= Mvalues.length - 1){
                        return;
                    }
                    if (currentText.equals("")){
                        return;
                    }
                    if (currentText.endsWith(".")){
                        return;
                    }
                    Mvalues[index] = currentText;
                    currentText = "";
                    wholeText += "+";
                    mEditText.setText(wholeText);
                    Mvalues[index + 1] = "+";
                    currentIndex += 2;
                    mAddition = true;
                }
            }
        });

        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    int index = currentIndex;
                    if (index >= Mvalues.length - 1){
                        return;
                    }
                    if (currentText.equals("")){
                        return;
                    }
                    if (currentText.endsWith(".")){
                        return;
                    }
                    Mvalues[index] = currentText;
                    currentText = "";
                    wholeText += "-";
                    mEditText.setText(wholeText);
                    Mvalues[index + 1] = "-";
                    currentIndex += 2;
                    mSubtract = true;
                }
            }
        });

        mButtonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    int index = currentIndex;
                    if (index >= Mvalues.length - 1){
                        return;
                    }
                    if (currentText.equals("")){
                        return;
                    }
                    if (currentText.endsWith(".")){
                        return;
                    }
                    Mvalues[index] = currentText;
                    currentText = "";
                    wholeText += "*";
                    mEditText.setText(wholeText);
                    Mvalues[index + 1] = "*";
                    currentIndex += 2;
                    mMultiplication = true;
                }
            }
        });

        mButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    int index = currentIndex;
                    if (index >= Mvalues.length - 1){
                        return;
                    }
                    if (currentText.equals("")){
                        return;
                    }
                    if (currentText.endsWith(".")){
                        return;
                    }
                    Mvalues[index] = currentText;
                    currentText = "";
                    wholeText += "/";
                    mEditText.setText(wholeText);
                    Mvalues[index + 1] = "/";
                    currentIndex += 2;
                    mDivision = true;
                }
            }
        });

        mButtonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals("")){
                    return;
                }
                if (wholeText.equals("")){
                    return;
                }
                Mvalues[currentIndex] = currentText;
                currentText = "";
                wholeText = "";
                String result = provideOperations();
                currentText = result;
                wholeText = result;
                mEditText.setText(wholeText);
            }
        });

        mButtonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentText.equals(".") || currentText.equals("")){
                    return;
                }
                currentText += ".";
                wholeText += ".";
                mEditText.setText(wholeText);
            }
        });

        mButtonSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    int index = currentIndex;
                    if (index >= Mvalues.length - 1){
                        return;
                    }
                    if (!currentText.equals("")){
                        return;
                    }
                    wholeText += "sqr";
                    mEditText.setText(wholeText);
                    mSqr = true;
                }
            }
        });

        mButtonSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    int index = currentIndex;
                    if (index >= Mvalues.length - 1){
                        return;
                    }
                    if (!currentText.equals("")){
                        return;
                    }
                    wholeText += "sqrt";
                    mEditText.setText(wholeText);
                    mSqrt = true;
                }
            }
        });

        mButtonMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    currentText = "";
                    currentIndex = 0;
                    mEditText.setText(currentText);
                }
            }
        });

        mButtonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText == null) {
                    mEditText.setText("");
                } else {
                    currentText = "";
                    wholeText = "";
                    currentIndex = 0;
                    mEditText.setText(wholeText);
                }
            }
        });
    }
}