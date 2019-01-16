package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView student = this.findViewById(R.id.student);
        TextView seller = this.findViewById(R.id.seller);
        int a = 56;
        int b = 31;
        int c = 26549;
        int d = 16487;
        Student s = new Student("小明");
        Student s1 = new Student("老太太");
        int result = s.callHelp(a, b);
        int result1 = s1.callHelp(c, d);
        student.setText(String.valueOf(result));
        seller.setText(String.valueOf(result1));
    }
}
