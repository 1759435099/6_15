package com.example.a6_4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    //定义布局内的RadioGroup控件
    RadioGroup rg;
    //定义Fragment数组存放Fragment对象
    Fragment[] fragments = new Fragment[5];
    //之前选中的页面游标值
    int beforeIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    //初始化数据
    private void initView() {
        //实例化RadioGroup
        rg = (RadioGroup) findViewById(R.id.main_rg);
        //为控件设置监听事件
        rg.setOnCheckedChangeListener(this);
        //默认显示主页面的碎片
        rg.check(R.id.main_rb2);
        // showFragment(2);
    }

    //点击对应的按钮后触发的事件
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //checkedId是布局文件里面的ID，比如：R.id.main_rb2
        View view = rg.findViewById(checkedId);
        String tag = view.getTag().toString();//获得对应视图的Tag字符串
        //显示对应的碎片
        showFragment(Integer.parseInt(tag));
        // Toast.makeText(this, "选择：" + tag, Toast.LENGTH_SHORT).show();
    }

    //显示碎片的方法
    private void showFragment(int index) {
        Log.e("TAG", "index=" + index);
        //如果点击的是前显示的页面，直接返回去
        if (beforeIndex == index) {
            return;
        }

        //对碎片继续各种操作，这里需要用到事务来完成
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //隐藏上一次显示的碎片
        if (beforeIndex != -1) {
            ft.hide(fragments[beforeIndex]);
        }
        //如果要出现的碎片页面没有创建过，就要创建；否则显示出来就可以了
        if (fragments[index] == null) {
            //创建碎片（实例化）
            fragments[index] = FragmentUtil.CreateFragment(index);
            //把创建的布局添加到事务里面
            //第一个参数是存放碎片的位置
            //第二个参数是碎片的对象
            ft.add(R.id.main_fl, fragments[index]);
        } else {
            //如不是空的对象就直接显示出来就可以了
            ft.show(fragments[index]);
        }
        //提交事务
        ft.commit();
        //把当前的选择保存
        beforeIndex = index;


    }
}
