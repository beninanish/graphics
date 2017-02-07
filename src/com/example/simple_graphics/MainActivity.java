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
  
    