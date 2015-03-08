package com.wiley.wrox.chapter5;

import android.content.Context;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ksango on 04/01/15.
 */
public class MyAdapter extends WearableListView.Adapter {
  Context mContext;
  LayoutInflater mLayoutInflater;
  String[] listData;

  public MyAdapter(Context context, String[] data) {
    mContext = context;
    mLayoutInflater = LayoutInflater.from(context);
    listData = data;
  }

  @Override
  public WearableListView.ViewHolder onCreateViewHolder(ViewGroup viewGroup,  int type) {
    return new WearableListView.ViewHolder(mLayoutInflater.inflate(R.layout.list_row, null));
  }

  @Override
  public void onBindViewHolder(WearableListView.ViewHolder viewHolder, int pos) {
    TextView text = (TextView) viewHolder.itemView.findViewById(R.id.row_text);
    text.setText(listData[pos]);
    viewHolder.itemView.setTag("item" + pos);
  }

  @Override
  public int getItemCount() {
    return listData.length;
  }
}