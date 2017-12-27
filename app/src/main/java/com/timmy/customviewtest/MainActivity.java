package com.timmy.customviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.timmy.customviewtest.adapter.MainItemAdapter;
import com.timmy.customviewtest.model.MainModel;
import com.timmy.customviewtest.ui.activity.Test1Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Timmy
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MainItemAdapter mMainRecycleViewAdapter;

    @Override
    @NonNull
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }


    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mMainRecycleViewAdapter = new MainItemAdapter();
        mMainRecycleViewAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        mMainRecycleViewAdapter.isFirstOnly(false);
        mRecyclerView.setAdapter(mMainRecycleViewAdapter);

        mMainRecycleViewAdapter.setOnItemClickListener(mOnItemClickListener);
    }

    private void initData() {
        List<MainModel> mainModels = new ArrayList<>();

        // 添加页面在这里
        mainModels.add(new MainModel("Hencoder 第一章测试", Test1Activity.class));

        mMainRecycleViewAdapter.setNewData(mainModels);
    }

    private BaseQuickAdapter.OnItemClickListener mOnItemClickListener = new BaseQuickAdapter.OnItemClickListener() {
        @Override
        public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
            MainModel item = (MainModel) adapter.getItem(position);

            Class activity = item.getActivity();
            if (null != activity) {
                Intent intent = new Intent(MainActivity.this, activity);
                startActivity(intent);
            }
        }
    };
}
