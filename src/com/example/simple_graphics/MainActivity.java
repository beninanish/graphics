package com.example.simple_graphics;  
  
import android.os.Bundle;  
import android.app.Activity;  
import android.view.Menu;  
import android.content.Context;  
import android.graphics.Canvas;  
import android.graphics.Color;  
import android.graphics.Paint;  
import android.view.View;  
  
public class MainActivity extends Activity {  
  
    DemoView demoview;  
     
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        demoview = new DemoView(this);  
        setContentView(demoview);  
    }  
  
    private class DemoView extends View{  
        public DemoView(Context context){  
            super(context);  
        }  
  
        @Override protected void onDraw(Canvas canvas) {  
            super.onDraw(canvas);  
  
           
            Paint paint = new Paint();  
            paint.setStyle(Paint.Style.FILL);  
  
           
            paint.setColor(Color.WHITE);  
            canvas.drawPaint(paint);  
              
            