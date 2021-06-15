package com.example.a6_4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.amap.api.maps.MapView;
import com.baidu.mapapi.SDKInitializer;

public class ditu extends AppCompatActivity {
    private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         try {
             SDKInitializer.initialize(getApplicationContext());
         }
            catch (Exception e){
            Log.e("Error",e.getMessage());
         }
            setContentView(R.layout.activity_ditu);
        mapView = findViewById(R.id.mapView);
    }
}