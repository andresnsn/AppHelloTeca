package com.example.helloteca;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SquareButton extends LinearLayout {

    public SquareButton(Context context){
        super(context);
    }

    public SquareButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
