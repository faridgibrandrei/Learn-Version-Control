package com.drop.learnversioncontrol;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String OPERATION_PLUS = "operation_plus";
    public static final String OPERATION_MINUS = "operation_minus";
    public static final String OPERATION_MULTIPLE = "operation_multiple";
    public static final String OPERATION_DIVIDE = "operation_divide";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String messageFromUser1 = "third message by user1";
        String messageFromUser2 = "This is the First message from user2";
    }

    private int operate(int a, int b, String operation) {
        int result = 0;

        switch (operation) {
            case OPERATION_PLUS:
                result = a + b;
                break;
            case OPERATION_MINUS:
                result = a - b;
                break;
            case OPERATION_MULTIPLE:
                result = a * b;
                break;
            case OPERATION_DIVIDE:
                result = a / b;
                break;
            default:
                break;
        }

        return result;
    }
}