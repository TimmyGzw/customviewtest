package com.timmy.customviewtest.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.timmy.customviewtest.R;
import com.timmy.customviewtest.model.MainModel;

/**
 * @author: Timmy
 * @data: 2017/12/27
 * @Fuction:
 */

public class MainItemAdapter extends BaseQuickAdapter<MainModel, BaseViewHolder> {
    public MainItemAdapter() {
        super(R.layout.item_main);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, MainModel mainModel) {
        viewHolder.setText(R.id.title, mainModel.getTitle());
    }
}