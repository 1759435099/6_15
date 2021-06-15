package com.example.a6_4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.amap.api.maps.MapView;
import com.baidu.mapapi.SDKInitializer;

import java.util.Map;

/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class OrderFragment extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_frag_ditu, container, false);
        try {
            SDKInitializer.initialize(getActivity().getApplicationContext());
        }catch (Exception e){
            Log.d("Error",e.getMessage());
        }
        return view;
    }

}
