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
    public void onCreate(Bundle savedInstanceState) 
    {  
        super.onCreate(savedInstanceState);  
        demoview = new DemoView(this);  
        setContentView(demoview);  
    }  
  
    private class DemoView extends View
    {  
        public DemoView(Context context)
        {  
            super(context);  
        }  
  
        @Override protected void onDraw(Canvas canvas) 
        {  
            super.onDraw(canvas);  
  
           
            Paint paint = new Paint();  
            paint.setStyle(Paint.Style.FILL);  
  
           
            paint.setColor(Color.WHITE);  
            canvas.drawPaint(paint);  

            
            paint.setAntiAlias(false);  
            paint.setColor(Color.BLUE);  
            canvas.drawCircle(20, 20, 15, paint);  
  
            
            paint.setAntiAlias(true);  
            paint.setColor(Color.GREEN);  
            canvas.drawCircle(60, 20, 15, paint);  
  
            
            paint.setAntiAlias(false);  
            paint.setColor(Color.RED);  
            canvas.drawRect(100, 5, 200, 30, paint);  
                           
            
            canvas.rotate(-45);  
                      
            paint.setStyle(Paint.Style.FILL);  
            canvas.drawText("Graphics Rotation", 40, 180, paint);  
              
             
            canvas.restore();  
        }  
    }  
   
              
            