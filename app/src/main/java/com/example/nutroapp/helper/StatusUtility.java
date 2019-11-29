/*
package com.example.nutroapp.helper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class StatusUtility extends View {

    private int mStatusBarHeight = 0;

    public StatusUtility(Context context){

        super(context, null);
    }

    public StatusUtility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }


}


*/
/**
 * Fields
 /
 private var mStatusBarHeight: Int = 0

 /**
 * Constructors
 /
 constructor(context: Context) : super(context, null)

 constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
 systemUiVisibility = SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
 }
 }

 override fun onApplyWindowInsets(insets: WindowInsets): WindowInsets {
 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
 mStatusBarHeight = ViewUtils.dpToPx(24).roundToInt()
 return insets.consumeSystemWindowInsets()
 }
 return insets
 }

 override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
 setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), mStatusBarHeight)
 }
 }
}

 }*/
