/**
 * this is package .
 * this is package .
 * this is package .
 * package name .
 */
package com.example.competition;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;




public class Main2Activity extends AppCompatActivity {
    /**
     * botton confirm .
     */
    private Button confirm;
    /**
     * the first choies .
     */
    private RadioButton rb1;
    /**
     * the second choies .
     */
    private RadioButton rb2;
    /**
     * the thired choies .
     */
    private RadioButton rb3;
    /**
     * to dispaly a questions.
     */
    private TextView quastion;
    /**
     * to change a result.
     */
    private TextView changeResult;
    /**
     * comments
     */
    private RadioButton radioButton;
    /**
     * comments
     */
    private RadioGroup radioGroup;
    /**
     * comments
     */
    private int result = 0;
    /**
     * comments
     */
    private int r = 0;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        confirm = findViewById(R.id.button_confirm);
        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
        rb3 = findViewById(R.id.radioButton3);
        quastion = findViewById(R.id.textView_question);
        changeResult = findViewById(R.id.textView_change_result);
        radioGroup = findViewById(R.id.radioGroup);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(final View v) {


                r++;
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void run() {
                        if (r == 1) {
                            String f;
                            f = getResources().getString(R.string.next_btn);
                            confirm.setText(f + "");
                            int selectedId;
                            selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = findViewById(selectedId);
                            if (radioButton == null) {
                            } else if (radioButton.getText() != null && radioButton.getText().equals("اندرويد") || radioButton.getText().equals("Android")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);

                            } else if (radioButton != null && !radioButton.getText().equals("اندرويد") || !radioButton.getText().equals("Android")) {
                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);

                            }

                        } else if (r == 2) {
                            radioGroup.clearCheck();
                            rb1.setEnabled(true);
                            rb2.setEnabled(true);
                            rb3.setEnabled(true);
                            if (radioButton != null) {
                                radioButton.setBackground(null);
                            }
                            String number2 = getResources().getString(R.string.number_Quastion2);
                            changeResult.setText(number2 + "");
                            String quastion2;
                            quastion2 = getResources().getString(R.string.name_qustion2);
                            quastion.setText(quastion2 + "");
                            String answer21;
                            answer21 = getResources().getString(R.string.app_answer21);
                            rb1.setText(answer21 + "");
                            String answer22;
                            answer22 = getResources().getString(R.string.app_answer22);
                            rb2.setText(answer22 + "");
                            String answer23;
                            answer23 = getResources().getString(R.string.app_answer23);
                            rb3.setText(answer23 + "");
                            String f;
                            f = getResources().getString(R.string.app_cheak);
                            confirm.setText(f + "");

                        } else if (r == 3) {
                            String f = getResources().getString(R.string.next_btn);
                            confirm.setText(f + "");
                            int selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = findViewById(selectedId);
                            if (radioButton == null) {
                                // do nothing
                            } else if (radioButton.getText() != null && radioButton.getText().equals("جافا") || radioButton.getText().equals("Java")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);

                            } else if (radioButton != null
                                    && !radioButton.getText().equals("جافا")
                                    || !radioButton.getText().equals("Java")) {

                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);

                            }

                        } else if (r == 4) {
                            radioGroup.clearCheck();
                            rb1.setEnabled(true);
                            rb2.setEnabled(true);
                            rb3.setEnabled(true);
                            if (radioButton != null) {
                                radioButton.setBackground(null);
                            }
                            String number3 = getResources().getString(R.string.number_Quastion3);
                            changeResult
                                    .setText(number3 + "");
                            String quastion3 = getResources().getString(R.string.name_qustion3);
                            quastion.setText(quastion3 + "");
                            String answer31 = getResources().getString(R.string.app_answer31);
                            rb1.setText(answer31 + "");
                            String answer32;
                            answer32 = getResources().getString(R.string.app_answer32);
                            rb2.setText(answer32 + "");
                            String answer33;
                            answer33 = getResources().getString(R.string.app_answer33);
                            rb3.setText(answer33 + "");
                            String f = getResources().getString(R.string.app_cheak);
                            confirm.setText(f + "");
                        } else if (r == 5) {
                            String f = getResources().getString(R.string.next_btn);
                            confirm.setText(f + "");
                            int selectedId;
                            selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = findViewById(selectedId);
                            if (radioButton == null) {
                                // do nothing
                                // do nothing
                            } else if (radioButton.getText() != null && radioButton.getText().equals("جوجل") || radioButton.getText().equals("Google")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);
                            } else if (radioButton != null && !radioButton.getText().equals("جوجل") || !radioButton.getText().equals("Google")) {
                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);
                            }
                        } else if (r == 6) {
                            radioGroup.clearCheck();
                            rb1.setEnabled(true);
                            rb2.setEnabled(true);
                            rb3.setEnabled(true);
                            if (radioButton != null) {
                                radioButton.setBackground(null);
                            }
                            String number4;
                            number4 = getResources().getString(R.string.number_Quastion4);
                            changeResult.setText(number4 + "");
                            String quastion4 = getResources().getString(R.string.name_qustion4);
                            quastion.setText(quastion4 + "");
                            String answer41 = getResources().getString(R.string.app_answer41);
                            rb1.setText(answer41 + "");
                            String answer42 = getResources().getString(R.string.app_answer42);
                            rb2.setText(answer42 + "");
                            String answer43 = getResources().getString(R.string.app_answer43);
                            rb3.setText(answer43 + "");
                            String f = getResources().getString(R.string.app_cheak);
                            confirm.setText(f + "");
                        } else if (r == 7) {
                            String f = getResources().getString(R.string.next_btn);
                            confirm.setText(f + "");
                            int selectedId;
                            selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = findViewById(selectedId);
                            if (radioButton == null) {
                            } else if (radioButton.getText() != null && radioButton.getText().equals("أندرويد ستوديو") || radioButton.getText().equals("Android Studio")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);

                            } else if (radioButton != null && !radioButton.getText().equals("أندرويد ستوديو") || !radioButton.getText().equals("Android Studio")) {

                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);


                            }


                        } else if (r == 8) {
                            radioGroup.clearCheck();
                            rb1.setEnabled(true);
                            rb2.setEnabled(true);
                            rb3.setEnabled(true);
                            if (radioButton != null) {
                                radioButton.setBackground(null);
                            }
                            String number5 = getResources().getString(R.string.number_Quastion5);
                            changeResult.setText(number5 + "");
                            String quastion5 = getResources().getString(R.string.name_qustion5);
                            quastion.setText(quastion5 + "");
                            String answer51 = getResources().getString(R.string.app_answer51);
                            rb1.setText(answer51 + "");
                            String answer52 = getResources().getString(R.string.app_answer52);
                            rb2.setText(answer52 + "");
                            String answer53 = getResources().getString(R.string.app_answer53);
                            rb3.setText(answer53 + "");
                            String f = getResources().getString(R.string.app_cheak);
                            confirm.setText(f + "");


                        } else if (r == 9) {
                            String f = getResources().getString(R.string.quastion_finally);
                            confirm.setText(f + "");
                            int selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = findViewById(selectedId);
                            if (radioButton == null) {
                            } else if (radioButton.getText() != null && radioButton.getText().equals("10") || radioButton.getText().equals("10")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);

                            } else if (radioButton != null && !radioButton.getText().equals("10")
                                    || !radioButton.getText().equals("10")) {

                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                rb1.setEnabled(false);
                                rb2.setEnabled(false);
                                rb3.setEnabled(false);

                            }


                        } else if (r == 10) {

                            Intent intent;
                            intent = new Intent(Main2Activity.this, ResultActivity.class);
                            intent.putExtra("result", result);
                            startActivity(intent);

                        }


                    }
                }, 500);


            }

        });



























        /*RadioButton[] radioButtons = {rb1 , rb2 , rb3};

        questionReader qr = new questionReader(this);
        try {
            List<question> questions= qr.getQuestion("questions_en");
            Collections.shuffle(questions);
            question q= questions.remove(0);
            question.setText(q.getQuestion_text());
            for (int i=0; i<radioButtons.length;i++){
                radioButtons[i].setText(q.getChoices().get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        */


    }
}
