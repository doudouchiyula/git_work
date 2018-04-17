package com.example.keyboardwithemoji;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/**
 * Created by huimin on 2018/4/2.
 */

public class CustomKeyboardUtil {
    private Context mContext;
    private final Keyboard mNumKeyboard;
    private final KeyboardView mKeyboardView;
    private ViewGroup mKeyboardparent;

    private static final int key_board_close = -20;
    private static final int key_board_delete = -21;
    private static final int key_board_complete = -22;
    private static final int key_board_letter = -23;

    public CustomKeyboardUtil(Context context, ViewGroup keyboard_parent) {
        this.mContext = context;
        this.mKeyboardparent = keyboard_parent;
        mNumKeyboard = new Keyboard(mContext, R.xml.keyboard_number);
        mKeyboardView = new KeyboardView(context, null);
        mKeyboardView.setOnKeyboardActionListener(mKeyboardListner);
    }

    public void showNumKeyboard() {
        mKeyboardView.setKeyboard(mNumKeyboard);
        ViewParent parent = mKeyboardView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(mKeyboardView);
        }
        mKeyboardparent.addView(mKeyboardView);

    }

    private KeyboardView.OnKeyboardActionListener mKeyboardListner = new KeyboardView.OnKeyboardActionListener() {
        @Override
        public void onPress(int primaryCode) {

        }

        @Override
        public void onRelease(int primaryCode) {

        }

        @Override
        public void onText(CharSequence text) {

        }

        @Override
        public void swipeLeft() {

        }

        @Override
        public void swipeRight() {

        }

        @Override
        public void swipeDown() {

        }

        @Override
        public void swipeUp() {

        }

        @Override
        public void onKey(int primaryCode, int[] keyCodes) {
            switch (primaryCode) {
                case key_board_close://关闭键盘
                    break;
                case key_board_delete://删除字符
                    break;
                case key_board_complete://输入完成
                    break;
                case key_board_letter://切换字母键盘
                    break;
                case 49://0
                    break;
                case 50://1
                    break;
                case 51://2
                    break;
                case 52://3
                    break;
                case 53://4
                    break;
                case 54://5
                    break;
                case 55://6
                    break;
                case 56://7
                    break;
                case 57://8
                    break;
                case 58://9
                    break;

            }
        }
    };
}
