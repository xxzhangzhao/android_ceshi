package com.example.administrator.prectice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2018/10/18 0018.
 */

public class DrawPeople extends View {
    Paint  mPaint; //画边框


    public DrawPeople(Context context) {
        super(context);
        initView();
    }

    public DrawPeople(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public DrawPeople(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
//        ANTI_ALIAS_FLAG,DEV_KERN_TEXT_FLAG,DITHER_FLAG
        mPaint=new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(2);
//        mPaint.setTextSize(30);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Path mPath = new Path();
        mPath.moveTo(0, 100);

        mPath.quadTo(60, -100, 120, 100);
        canvas.drawPath(mPath,mPaint);

//        Path mPath1 = new Path();
//        mPath1.moveTo(0, 160);
//
//        mPath1.quadTo(60, 260, 120, 160);
//        canvas.drawPath(mPath1,mPaint);

    }
}
