package com.wiley.wrox.chapter5;

import android.os.Bundle;
import android.support.wearable.view.CardFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ksango on 04/01/15.
 */
public class MyCard extends CardFragment {
  TextView mTextView1, mTextView2, mTextView3;

  @Override
  public View onCreateContentView(LayoutInflater inflater, ViewGroup container,
                                  Bundle savedInstanceState) {
    View root = inflater.inflate(R.layout.my_card, container, false);
    mTextView1 = (TextView) root.findViewById(R.id.textView1);
    mTextView2 = (TextView) root.findViewById(R.id.textView2);
    mTextView3 = (TextView) root.findViewById(R.id.textView3);
    return root;
  }
}
