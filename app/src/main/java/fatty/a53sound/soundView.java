package fatty.a53sound;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Fatty on 2017-02-14.
 */

public class soundView extends View{

    private int mRectCount = 20,mWidth = 200,mRectWidth = 50,mRectHeight = 1400 , offset = 15;
    private Paint mPaint;

    public soundView(Context context, AttributeSet attrs){

        super(context, attrs);

        mPaint = new Paint();
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas){

        super.onDraw(canvas);
        for(int i=0;i < mRectCount;i++){

            double mRandom = 0;
            mRandom = Math.random();
            float currentHeight = (float)(mRectHeight * mRandom);

            canvas.drawRect(
                    (float)(mWidth*0.4/2 + mRectWidth*i + offset),
                    currentHeight,
                    (float)(mWidth*0.4/2 + mRectWidth*(i+1)),
                    mRectHeight,
                    mPaint);
        }
        postInvalidateDelayed(300);
    }

    //下方可增加漸層效果
/*    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh){

        super.onSizeChanged(w,h,oldw,oldh);
        LinearGradient mLinearGradient = new LinearGradient(
                0,
                0,
                mRectWidth,
                mRectHeight,
                Color.rgb(94,36,48),//getSolidColor(),
                Color.WHITE,
                Shader.TileMode.CLAMP);
        mPaint.setShader(mLinearGradient);

    }*/
}
