package com.example.huang.myviewgroup;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.app.Activity;
import android.content.Context;

public class MyViewGroup extends Activity {
    private Context mContext;
    private int [] imagesArray;
    private ScrollViewGroup mScrollLauncherViewGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init(){
        mContext=this;
        imagesArray=new int []{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
        mScrollLauncherViewGroup=new ScrollViewGroup(mContext);
        ImageView imageView=null;
        RelativeLayout.LayoutParams layoutParams=null;
        for (int i = 0; i < imagesArray.length; i++) {
            imageView=new ImageView(mContext);
            imageView.setScaleType(ScaleType.FIT_XY);
            imageView.setImageResource(imagesArray[i]);
            layoutParams=new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
            imageView.setLayoutParams(layoutParams);
            mScrollLauncherViewGroup.addView(imageView);
        }
        setContentView(mScrollLauncherViewGroup);
    }



}
