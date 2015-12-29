package com.czm.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import com.czm.xcrecyclerview.R;
import com.czm.xcrecyclerview.XCRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MyAdapter mAdapter;
    private XCRecyclerView mRecyclerView;
    private List<String> mData;
    private View mHeaderView;
    private View mFooterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mData = new  ArrayList<String>();
        for(int i = 0; i < 10 ;i++){
            mData.add("item_" + i);
        }
        mAdapter = new MyAdapter(mData);
        mRecyclerView = (XCRecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mHeaderView = LayoutInflater.from(this).inflate(R.layout.layout_header,mRecyclerView,false);
        mFooterView = LayoutInflater.from(this).inflate(R.layout.layout_footer,mRecyclerView,false);
        mRecyclerView.addHeaderView(mHeaderView);
        mRecyclerView.addFooterView(mFooterView);
        mRecyclerView.setAdapter(mAdapter);
    }

}
