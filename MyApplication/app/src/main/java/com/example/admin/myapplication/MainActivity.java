package com.example.admin.myapplication;

import android.app.Activity;
import android.app.RemoteAction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.admin.myapplication.R.id.text;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24;
    EditText text;
    boolean clear;
    double a =0;
    String str="",exp,s1,s2,op;
    double ss1,ss2;
    int space,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        btn18 = (Button) findViewById(R.id.btn18);
        btn19 = (Button) findViewById(R.id.btn19);
        btn20 = (Button) findViewById(R.id.btn20);
        btn21 = (Button) findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn24 = (Button) findViewById(R.id.btn24);
        text = (EditText) findViewById(R.id.text);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        str ="";
        str = text.getText().toString();
        switch (v.getId()) {
            case R.id.btn22:
            case R.id.btn17:
            case R.id.btn18:
            case R.id.btn19:
            case R.id.btn13:
            case R.id.btn14:
            case R.id.btn15:
            case R.id.btn9:
            case R.id.btn10:
            case R.id.btn11:
            case R.id.btn23:
                if (clear) {
                    str = "";
                    text.setText("");
                }
                text.setText(str + ((Button) v).getText());
                break;
            case R.id.btn20:
            case R.id.btn8:
            case R.id.btn12:
            case R.id.btn16:
                if (clear) {
                    text.setText("");
                }
                text.setText(str + "" + ((Button) v).getText() + "");
                break;
            case R.id.btn24:
                text.setText((int) a);
                break;
            case R.id.btn7:
                if (str != null && !str.equals(""))
            {
                text.setText(str.substring(0, str.length() - 1));
            }
            break;
            case R.id.btn5:
                text.setText(s1+op);
            case R.id.btn6:
                text.setText("0");
                break;
            case R.id.btn4:
                a=1/a;
                break;
            case R.id.btn3:
                a=a*a;
                break;
            case R.id.btn2:
                a=Math.sqrt(a);
                break;
            }
        }
    private void getResult(){
        clear = true;
        exp =text.getText().toString();
        space = exp.indexOf("");
        s1 =exp.substring(0,space);
        op =exp.substring(space+1,space+2);
        s2 =exp.substring(space+3);
        ss1 =Double.parseDouble(s1);
        ss2 =Double.parseDouble(s2);
        if (op.equals("+")) {
            a = ss1 + ss2;
        } else if(op.equals("-"))
        {
            a = ss1-ss2;
        }
        else if (op.equals("×"))
        {
            a = ss1*ss2;
        }
        else if (op.equals("÷"))
            if (ss2 == 0) {
                text.setText("除数不能为零");
            } else a = ss1 / ss2;
         if (!s1.contains(".")&&!s2.contains("."))
        {
            result =(int)a;
            text.setText(result+"");
        }
        else
             text.setText(a + "");
}
    }




