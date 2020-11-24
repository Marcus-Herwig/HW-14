package com.example.cshw14;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int tempRollNum = 0;
    int tempDice = 0;
    String totMath = "";
    int total;
    String numList;
    Random rand = new Random();

    public void onPercentile(View a)
    {
        int num = rand.nextInt(100);
        if(num == 0)
        {
            num = num +1;
        }
        TextView Total = this.findViewById(R.id.total_tv);
        Total.setText("" + num);
        TextView sum = this.findViewById(R.id.outPut_tv);
        sum.setText("0");
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D0");
        TextView tempnumRolls = this.findViewById(R.id.tempRoll_tv);
        tempnumRolls.setText("0");
    }
    public void onRoll(View a)
    {

        for(int i = 1; i <= tempRollNum; i++)
        {

            int random = rand.nextInt(tempDice);
            if(random == 0)
            {
                random = random +1;
            }
            total = total + random;
            numList = numList +" " + "+" +  " " + random;
        }
        TextView Total = this.findViewById(R.id.total_tv);
        Total.setText("" + total);
        TextView sum = this.findViewById(R.id.outPut_tv);
        sum.setText("" + numList);
    }
    public void onClear(View a)
    {
        this.tempDice = 0;
        this.tempRollNum = 0;
        this.total = 0;
        numList = "";
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D0");
        TextView tempnumRolls = this.findViewById(R.id.tempRoll_tv);
        tempnumRolls.setText("0");
        TextView Total = this.findViewById(R.id.total_tv);
        Total.setText("0");
        TextView sum = this.findViewById(R.id.outPut_tv);
        sum.setText("0");

    }

    public  void onD4(View a)
    {
        tempDice = 4;
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D4");
    }
    public  void onD6(View b)
    {
        tempDice = 6;
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D6");
    }
    public  void onD8(View c)
    {
        tempDice = 8;
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D8");
    }
    public  void onD10(View a)
    {
        tempDice = 10;
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D10");
    }
    public  void onD12(View a)
    {
        tempDice = 12;
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D12");
    }
    public  void onD20(View a)
    {
        tempDice = 20;
        TextView tempDiceTv = this.findViewById(R.id.tempDice_tv);
        tempDiceTv.setText("D20");
    }

    public void onNumClick0(View a)
    {
        tempRollNum = 0;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("0");
    }
    public void onNumClick1(View a)
    {
        tempRollNum = 1;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("1");
    }
    public void onNumClick2(View a)
    {
        tempRollNum = 2;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("2");
    }
    public void onNumClick3(View a)
    {
        tempRollNum = 3;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("3");
    }
    public void onNumClick4(View a)
    {
        tempRollNum = 4;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("4");
    }
    public void onNumClick5(View a)
    {
        tempRollNum = 5;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("5");
    }
    public void onNumClick6(View a)
    {
        tempRollNum = 6;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("6");
    }
    public void onNumClick7(View a)
    {
        tempRollNum = 7;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("7");
    }
    public void onNumClick8(View a)
    {
        tempRollNum = 8;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("8");
    }
    public void onNumClick9(View a)
    {
        tempRollNum = 9;
        TextView tempNumRoll = this.findViewById(R.id.tempRoll_tv);
        tempNumRoll.setText("9");
    }

}