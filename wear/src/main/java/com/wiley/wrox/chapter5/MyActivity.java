package com.wiley.wrox.chapter5;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.support.wearable.view.WearableListView;
import android.widget.TextView;

public class MyActivity extends Activity {

  private TextView mTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_my);
    final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
    stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
      @Override
      public void onLayoutInflated(WatchViewStub stub) {
        mTextView = (TextView) stub.findViewById(R.id.text);

        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        WearableListView list = (WearableListView) findViewById(R.id.listview);
        list.setAdapter(new MyAdapter(MyActivity.this, data));
      }
    });
  }
}
