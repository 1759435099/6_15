package com.example.a6_4;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by Administrator on 2016/10/25 0025.
 */

public class OrderFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //加载系统里面的布局文件
        TextView view = (TextView) View.inflate(getActivity(), android.R.layout.simple_list_item_1, null);
        view.setText("这是订单页面的碎片布局");
        return view;
    }

}
