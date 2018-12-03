package com.example.administrator.prectice;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2018/10/18 0018.
 *
 * 自定义画板
 */

public class DrawingBoard extends View {
    Paint mPaint; //画笔
    public DrawingBoard(Context context) {
        super(context);
        initView();
    }



    public DrawingBoard(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public DrawingBoard(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {

    }


}
