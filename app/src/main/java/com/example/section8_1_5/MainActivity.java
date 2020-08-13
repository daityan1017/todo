package com.example.section8_1_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox varCheckBox1, varCheckBox2, varCheckBox3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varCheckBox1 = findViewById(R.id.checkBox1);
        varCheckBox2 = findViewById(R.id.checkBox2);
        varCheckBox3 = findViewById(R.id.checkBox3);
        //イベントリスナーを登録
        varCheckBox1.setOnCheckedChangeListener(this);
        varCheckBox2.setOnCheckedChangeListener(this);
        varCheckBox3.setOnCheckedChangeListener(this);

        this.onCheckedChanged(this.varCheckBox1,true);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        String string1 = "しない", string2 = "しない", string3 = "しない";

        if(isChecked){
            Toast.makeText(this,"ほんとにやれよ？",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"DO IT!!!!",Toast.LENGTH_LONG).show();
        }


        if(varCheckBox1.isChecked()){
            string1 = "する";
        }
        if(varCheckBox2.isChecked()){
            string2 = "する";
        }
        if(varCheckBox3.isChecked()){
            string3 = "する";
        }

        ((TextView) findViewById(R.id.textView2)).setText(
                String.format("庭の掃除は%s" + "\n" +
                                "窓拭きは%s" + "\n" +
                                "買い出しは%s" + "\n",
                        string1,string2,string3)
        );

    }
}
