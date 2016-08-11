package ru.yandex.yamblz.ui.views;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Extension of Fresco ImageView specifies square shape of an image.
 */
public class SquareDraweeView extends SimpleDraweeView {
    public SquareDraweeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Finds the shortest side of an image and specifies it both as width and as height.
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int shortSideMeasureSpec = (width < height) ? widthMeasureSpec : heightMeasureSpec;
        super.onMeasure(shortSideMeasureSpec, shortSideMeasureSpec);
    }
}
