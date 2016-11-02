package com.example.herve.Study.wediget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

public class UpRoundImageView extends ImageView {

    private float mRadus = 0;


    public UpRoundImageView(Context context) {
        this(context, null);
    }

    public UpRoundImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public UpRoundImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mRadus = 4 * context.getResources().getDisplayMetrics().density;


    }


    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        int version = Build.VERSION.SDK_INT;
        drawRadio(canvas);

    }

    private void drawRadio(Canvas canvas) {
        Path path = new Path();
        int w = this.getWidth();
        int h = this.getHeight();
        /*向路径中添加圆角矩形。radii数组定义圆角矩形的四个圆角的x,y半径。radii长度必须为8*/

        /*圆角的半径，依次为左上角xy半径，右上角，右下角，左下角*/

        path.addRoundRect(new RectF(0, 0, w, h), new float[]{mRadus, mRadus, mRadus, mRadus, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.clipPath(path);
    }
}