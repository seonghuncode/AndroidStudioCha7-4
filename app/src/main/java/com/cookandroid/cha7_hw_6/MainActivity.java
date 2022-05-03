package com.cookandroid.cha7_hw_6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup Group1;
    RadioButton dog, cat, rabbit, horse;
    Button button1;
    ImageView image1;
    View dialogView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Cha7-6");
        Group1 = (RadioGroup) findViewById(R.id.Group1);
        dog = (RadioButton) findViewById(R.id.dog);
        cat = (RadioButton) findViewById(R.id.cat);
        rabbit = (RadioButton) findViewById(R.id.rabbit);
        horse = (RadioButton) findViewById(R.id.horse);
        button1 = (Button) findViewById(R.id.button1);
        image1 = (ImageView) findViewById(R.id.image1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = (View) View.inflate(MainActivity.this,R.layout.dialog1, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                image1 = dialogView.findViewById(R.id.image1); //핵심 내용

                if(dog.isChecked()){
                    image1.setImageResource(R.drawable.dog);
                    dlg.setTitle("강아지");
                }
                if(cat.isChecked()){
                    image1.setImageResource(R.drawable.cat);
                    dlg.setTitle("고양이");
                }
                if(rabbit.isChecked()){
                    image1.setImageResource(R.drawable.rabbit);
                    dlg.setTitle("토끼");
                }
                if(horse.isChecked()){
                    image1.setImageResource(R.drawable.horse);
                    dlg.setTitle("말");
                }


                dlg.setView(dialogView);
                dlg.setPositiveButton("닫기", null);
                dlg.show();

            }
        });



    }



}
