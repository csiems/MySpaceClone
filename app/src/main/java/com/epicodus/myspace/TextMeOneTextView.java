package com.epicodus.myspace;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Guest on 3/14/16.
 */
public class TextMeOneTextView extends TextView {
    public TextMeOneTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),
                "fonts/TextMeOne-Regular.ttf"));
    }
}
