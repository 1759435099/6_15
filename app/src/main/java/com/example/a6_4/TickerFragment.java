package com.example.a6_4;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amap.api.maps.MapView;
import com.amap.api.maps.model.LatLng;
import com.baidu.mapapi.SDKInitializer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.amap.api.mapcore.util.hl.e;
import static com.loc.dy.s;

public class TickerFragment extends Fragment {
    private View view;
    Button quche;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //加载系统里面的布局文件
        view = inflater.inflate(R.layout.activity_frag_quche, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        quche = getActivity().findViewById(R.id.quche);
        quche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(),ditu.class);
                startActivity(intent);
            }
        });
    }
}


