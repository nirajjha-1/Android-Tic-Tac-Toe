package com.example.tictac;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView result;
    LinearLayout mainl;
    int flag = 0, count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        result = findViewById(R.id.result);
        mainl = findViewById(R.id.mainl);
    }

    // Button Click
    public void Check(View view) throws InterruptedException {
        Button btnCurrent = (Button) view;
        if (btnCurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                btnCurrent.setText("O");
                flag = 1;
            } else {
                btnCurrent.setText("X");
                flag = 0;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b1);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b4);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b7);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b1);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b2);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b3);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b1);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    mainl.setBackgroundColor(getResources().getColor(R.color.green));
                    result.setText("WINNER IS : " + b3);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restartGame();
                        }
                    }, 4000);
                } else {
                    if (count == 9) {
                        mainl.setBackgroundColor(getResources().getColor(R.color.yellow));
                        result.setText("GAME DROWN");
                        result.setTextColor(getResources().getColor(R.color.black));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                restartGame();
                            }
                        }, 4000);
                    }
                }
            }
        }

    }

    public void restartGame() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
        result.setText("");
        mainl.setBackgroundColor(getResources().getColor(R.color.purple_700));
    }
}