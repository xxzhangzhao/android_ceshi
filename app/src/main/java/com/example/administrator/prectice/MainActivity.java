package com.example.administrator.prectice;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

import com.andview.refreshview.XRefreshView;
import com.andview.refreshview.XRefreshViewFooter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
//    RecyclerView recyclerView;
//    List<Person> personList = new ArrayList<Person>();
//    XRefreshView xRefreshView;
//    int lastVisibleItem = 0;
//    //    GridLayoutManager layoutManager;
//    LinearLayoutManager layoutManager;
//    private boolean isBottom = false;
//    private int mLoadCount = 0;
//
//     private MyRecyclerAdapter myRecyclerAdapter;
//    private boolean isList = true;//false 为grid布局

    private int maxValue = 250;
    private int minValue = 80;

    private RulerView rulerHeight;
    private TextView tvHeightValue;

    private TextView spannedTv;

    private void showNumInt() {
        Random rand = new Random();
        int value = rand.nextInt(maxValue - minValue + 1) + minValue;
        rulerHeight.setValue(value, minValue, maxValue, 1);
        tvHeightValue.setText(String.valueOf(Integer.valueOf(value)));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ruler_view);

        rulerHeight = (RulerView) findViewById(R.id.ruler_height);
        tvHeightValue = (TextView) findViewById(R.id.tv_info_height_value);
        spannedTv=findViewById(R.id.spannedTv);

        spannedTv.setText(getTvString("张三"));
        showNumInt();
        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNumInt();
            }
        });
        rulerHeight.setOnValueChangeListener(new RulerView.OnValueChangeListener() {
            @Override
            public void onValueChange(float value) {
                tvHeightValue.setText(String.valueOf(value));
            }
        });

//        xRefreshView = (XRefreshView) findViewById(R.id.xrefresh);
//        recyclerView = (RecyclerView) findViewById(R.id.recycler);
////        recyclerView.setHasFixedSize(true);
//        layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//
//
//        for (int i = 0; i < 15; i++) {
//            Person person = new Person("name" + i, "" + i);
//            personList.add(person);
//        }
//
//        myRecyclerAdapter=new MyRecyclerAdapter(this,personList);
//        recyclerView.setAdapter(myRecyclerAdapter);
//
//        //设置刷新完成以后，headerview固定的时间
//        xRefreshView.setPinnedTime(1000);
//        xRefreshView.setMoveForHorizontal(true);
//        xRefreshView.setPullLoadEnable(true);
//        xRefreshView.setAutoLoadMore(false);
//        xRefreshView.setAutoRefresh(true);
//
////        myRecyclerAdapter.setCustomLoadMoreView(new XRefreshViewFooter(this));
//        xRefreshView.enableReleaseToLoadMore(true);
//        xRefreshView.enableRecyclerViewPullUp(true);
//        xRefreshView.enablePullUpWhenLoadCompleted(true);
//        //设置静默加载时提前加载的item个数
////        xefreshView1.setPreLoadCount(4);
//        //设置Recyclerview的滑动监听
//        xRefreshView.setOnRecyclerViewScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                super.onScrollStateChanged(recyclerView, newState);
//            }
//
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//            }
//        });
//        xRefreshView.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener() {
//
//            @Override
//            public void onRefresh(boolean isPullDown) {
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        xRefreshView.stopRefresh();
//                    }
//                }, 500);
//            }
//
//            @Override
//            public void onLoadMore(boolean isSilence) {
//                new Handler().postDelayed(new Runnable() {
//                    public void run() {
//                        for (int i = 0; i < 3; i++) {
//                            personList.add(new Person("张三","19"));
//                        }
//                        myRecyclerAdapter.addData(personList);
//                        mLoadCount++;
//                        if (mLoadCount <= 2) {//模拟没有更多数据的情况
////                            xRefreshView.setLoadComplete(true);
//                            xRefreshView.stopLoadMore(true);
//                        } else {
//                            // 刷新完成必须调用此方法停止加载
////                            xRefreshView.stopLoadMore(false);
//                            xRefreshView.setLoadComplete(true);
//                            //当数据加载失败 不需要隐藏footerview时，可以调用以下方法，传入false，不传默认为true
//                            // 同时在Footerview的onStateFinish(boolean hideFooter)，可以在hideFooter为false时，显示数据加载失败的ui
////                            xRefreshView1.stopLoadMore(false);
//                        }
//                    }
//                }, 1000);
//            }
//        });



//		// 实现Recyclerview的滚动监听，在这里可以自己处理到达底部加载更多的操作，可以不实现onLoadMore方法，更加自由
//		xRefreshView1.setOnRecyclerViewScrollListener(new OnScrollListener() {
//			@Override
//			public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//				super.onScrolled(recyclerView, dx, dy);
//				lastVisibleItem = layoutManager.findLastVisibleItemPosition();
//			}
//
//			public void onScrollStateChanged(RecyclerView recyclerView,
//											 int newState) {
//				if (newState == RecyclerView.SCROLL_STATE_IDLE) {
//					isBottom = recyclerviewAdapter.getItemCount() - 1 == lastVisibleItem;
//				}
//			}
//		});



    }

    public Spanned getTvString(String name){

        return Html.fromHtml(String.format("您好,<u><big><font color='#ffff00'>%s</font><big/></u>",name));
    }
}
