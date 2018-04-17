package com.example.keyboardwithemoji;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by huimin on 2018/4/2.
 */

public class CustomKeyboardView extends LinearLayout {
    private Context mContext;

    public CustomKeyboardView(Context context) {
        super(context);
        this.mContext = context;
        initConfig();
    }

    public CustomKeyboardView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initConfig();
    }

    public CustomKeyboardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initConfig();
    }


    private void initConfig() {

    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }
}
