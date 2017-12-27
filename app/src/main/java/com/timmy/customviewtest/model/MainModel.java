package com.timmy.customviewtest.model;

/**
 * @author : Timmy
 * @Data : 2017/8/30
 * @Fuction :
 */
public class MainModel {

    String mTitle;
    Class mActivity;


    public MainModel(String title, Class activity) {
        mTitle = title;
        mActivity = activity;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Class getActivity() {
        return mActivity;
    }

    public void setActivity(Class activity) {
        mActivity = activity;
    }
}
