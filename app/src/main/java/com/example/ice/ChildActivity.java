package com.example.ice;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;

import com.example.ice.Views.ChildView;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        ChildView childView= new ChildView(this);

        //button
        final Boolean[] buttonFinishClicked = {false};
        final Button buttonFinish= findViewById(R.id.button_finish);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                buttonFinishClicked[0] =!buttonFinishClicked[0];
                if(buttonFinishClicked[0])
                {
                    buttonFinish.setBackgroundColor(Color.rgb(151, 68, 68));
                }
                else
                {
                    buttonFinish.setBackgroundColor(Color.rgb(181, 131, 141));
                }
            }

        });

    }


}