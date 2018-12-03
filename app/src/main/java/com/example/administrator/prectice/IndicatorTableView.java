package com.example.administrator.prectice;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2018/10/16 0016.
 * 带指示器的table
 */

public class IndicatorTableView extends View {

    //是否自适应全屏  //适用于少item
    private boolean isSelfAdaption=true;

    //指示器颜色
    private int mIndicatorCorlor= Color.BLUE;


    //指示器的个数
    private int mIndicatorNum=4;

    //isSelfAdaption=false 时该属性有效，itemtable指示器的宽
    private int mIndicatorWidth;

    //isSelfAdaption=false 时该属性有效，itemtable指示器的高
    private int mIndicatorHeigh;

    private Context mContext;

    //可以控制指示器的背景色
    private RelativeLayout indicBg;

    //添加指示器Text 的Ll
    private RecyclerView indicContent;

    //指示器
    private View indicView;

    //item 选中的textview textcorlor
    private int textCorlor;



    public void setmIndicatorCorlor(int mIndicatorCorlor) {
        this.mIndicatorCorlor = mIndicatorCorlor;
        //设置颜色
        indicView.setBackgroundColor(mIndicatorCorlor);
    }

    //设置item table选中的textview textcorlor
    public void setTextCorlor(int textCorlor) {
        this.textCorlor = textCorlor;
        //刷新adpter
    }

    public IndicatorTableView(Context context) {
        super(context);
        this.mContext=context;
        initIndicator();
    }

    //初始化指示器的view
    private void initIndicator() {

        View mView = LayoutInflater.from(mContext).inflate(R.layout.indicator_tableview, null);

        indicBg=mView.findViewById(R.id.indicBg);
        indicContent=mView.findViewById(R.id.indicContent);
        indicView=mView.findViewById(R.id.indicView);

    }


    /**
     * 得到屏幕宽度
     *
     * @return
     */
    private int getScreenWidth() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    //计算text文本的宽度
//    extPaint paint = mTvProgramName.getPaint();
//    paint.setTextSize(mTvProgramName.getTextSize());
//    paint.measureText(mTvProgramName.getText().toString()); //这个方法能把文本所占宽度衡量出来.


}
