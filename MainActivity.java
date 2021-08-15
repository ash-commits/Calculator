package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button ac;
    private Button mod;
    private Button eq;
    private ImageButton bk;
    private Button dec;
    private TextView exp;
    private TextView res;
    private TextView txt;
    private long backPressedTime;
    private Toast backToast;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char MOD = '%';
    private final char EQU = '=';
    private double val1 = Double.NaN;
    private double val2;
    private double val3;
    private boolean symbol = false;
    private boolean status=false;
    private int index;
    private char ACTION;
    private ImageButton info;
private boolean decimal=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        txt=(TextView)findViewById(R.id.title);
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(exp.getText().toString() + "0");
                txt.setText(null);
                symbol=false;
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }


        });
        info=findViewById(R.id.btninfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (getApplicationContext(),GuideActivity.class));


            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "1");
                res.setTextSize(35);
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));

                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status) {
                    exp.setText(null);
                    res.setText(null);

                    status = false;
                }
                res.setTextSize(35);
                exp.setText(exp.getText().toString() + "2");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "3");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "4");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "5");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "6");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "7");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "8");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setTextSize(35);
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                exp.setText(exp.getText().toString() + "9");
                symbol=false;
                txt.setText(null);
                try {
                    String ab = exp.getText().toString();
                    if (ab.length() > 0) {
                        res.setText(String.valueOf(engine.eval(ab)));
                    }
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                if(!decimal || exp.getText().toString()==null){
                    exp.setText(exp.getText().toString() + ".");
                    symbol=!symbol;
                    decimal=!decimal;
                    txt.setText(null);


                }

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                if(!symbol || exp.getText().toString()==null){
                    exp.setText(exp.getText().toString() + "+");
                    symbol=!symbol;
                    decimal=false;
                    txt.setText(null);

                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                if(!symbol || exp.getText().toString()==null){
                    exp.setText(exp.getText().toString() + "-");
                    symbol=!symbol;
                    decimal=false;
                    txt.setText(null);


                }

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!symbol){
                    exp.setText(exp.getText().toString() + "*");
                    symbol=!symbol;
                    decimal=false;

                }

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!symbol){
                    exp.setText(exp.getText().toString() + "/");
                    symbol=!symbol;
                    decimal=false;

                }

            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!symbol){
                    exp.setText(exp.getText().toString() + "%");
                    symbol=!symbol;
                    decimal=false;

                }


            }
        });
        eq.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                res.setTextSize(50);
                if (exp.getText().toString().length()>0) {
                    try {
                        String ab = exp.getText().toString();
                        if (ab.length() > 0) {
                            res.setText(String.valueOf(engine.eval(ab)));
                        }
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }

                    CharSequence name = exp.getText().toString();
                    if (!(name.charAt(name.length() - 1) == '+' || name.charAt(name.length() - 1) == '-' || name.charAt(name.length() - 1) == '*' || name.charAt(name.length() - 1) == '/' || name.charAt(name.length() - 1) == '%')) {
                        symbol = false;
                    }
                    if (name.charAt(name.length() - 1) == '.')
                        decimal = false;

                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp.setText(null);
                res.setText(null);
                symbol=false;
                decimal=false;
                txt.setText("Calculator");
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status) {
                    exp.setText(null);
                    res.setText(null);
                    status = false;
                }
                if (exp.getText().length() > 0) {
                    CharSequence name = exp.getText().toString();
                    if(name.charAt(name.length()-1)=='+' || name.charAt(name.length()-1)=='-' || name.charAt(name.length()-1)=='*' || name.charAt(name.length()-1)=='/' || name.charAt(name.length()-1)=='%'){
                        symbol=false;

                    }
                    if(name.charAt(name.length()-1)=='.')
                        decimal=false;
                    exp.setText(name.subSequence(0, name.length() - 1));
                    if(exp.getText().length()==0){
                        txt.setText("Calculator");
                    }
                }
                else{

                    exp.setText(null);
                    res.setText(null);

                }


            }

        });



    }

    private void setupUIViews() {
        zero = (Button) findViewById(R.id.btn0);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        ac = (Button) findViewById(R.id.btnac);
        add = (Button) findViewById(R.id.btnadd);
        sub = (Button) findViewById(R.id.btnsub);
        mul = (Button) findViewById(R.id.btnmul);
        div = (Button) findViewById(R.id.btndiv);
        mod = (Button) findViewById(R.id.btnmod);
        bk = (ImageButton) findViewById(R.id.btnback);
        eq = (Button) findViewById(R.id.btneq);
        exp = (TextView) findViewById(R.id.exp);
        res = (TextView) findViewById(R.id.res);
        dec=(Button)findViewById(R.id.btndec);

    }

    @Override
    public void onBackPressed() {
        if(backPressedTime +2000 >System.currentTimeMillis()){
            backToast.cancel();
            finishAffinity();
            return;
        }
        else{
            backToast = Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_LONG);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}
