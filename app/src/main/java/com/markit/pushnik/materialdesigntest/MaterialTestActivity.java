package com.markit.pushnik.materialdesigntest;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MaterialTestActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton mCheckButton;
    private ImageButton mArrowUpButton;
    private ImageButton mArrowDownButton;
    private ImageButton mArrowLeftButton;
    private ImageButton mArrowRightButton;
    private boolean isCheckVisible;
    private boolean isArrowUpVisible, isArrowDownVisible, isArrowLeftVisible, isArrowRightVisible;

    private Animatable mAnimatable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCheckButton = (ImageButton) findViewById(R.id.btn_check);
        mArrowUpButton = (ImageButton) findViewById(R.id.btn_arrow_up);
        mArrowDownButton = (ImageButton) findViewById(R.id.btn_arrow_down);
        mArrowLeftButton = (ImageButton) findViewById(R.id.btn_arrow_left);
        mArrowRightButton = (ImageButton) findViewById(R.id.btn_arrow_right);

        mCheckButton.setOnClickListener(this);
        mArrowUpButton.setOnClickListener(this);
        mArrowDownButton.setOnClickListener(this);
        mArrowLeftButton.setOnClickListener(this);
        mArrowRightButton.setOnClickListener(this);

        isCheckVisible = false;
        isArrowUpVisible = false;
        isArrowDownVisible = false;
        isArrowLeftVisible = false;
        isArrowRightVisible = false;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_check:
                if (!isCheckVisible) {
                    mCheckButton.setImageResource(R.drawable.icn_morph_check);
                } else {
                    mCheckButton.setImageResource(R.drawable.icn_morph_check_reverse);
                }
                isCheckVisible = !isCheckVisible;
                mAnimatable = (Animatable) (mCheckButton).getDrawable();
                break;
            case R.id.btn_arrow_up:
                if (!isArrowUpVisible) {
                    mArrowUpButton.setImageResource(R.drawable.icn_morph_arrow_up);
                } else {
                    mArrowUpButton.setImageResource(R.drawable.icn_morph_arrow_up_reverse);
                }
                isArrowUpVisible = !isArrowUpVisible;
                mAnimatable = (Animatable) (mArrowUpButton).getDrawable();
                break;
            case R.id.btn_arrow_down:
                if (!isArrowDownVisible) {
                    mArrowDownButton.setImageResource(R.drawable.icn_morph_arrow_down);
                } else {
                    mArrowDownButton.setImageResource(R.drawable.icn_morph_arrow_down_reverse);
                }
                isArrowDownVisible = !isArrowDownVisible;
                mAnimatable = (Animatable) (mArrowDownButton).getDrawable();
                break;
            case R.id.btn_arrow_left:
                if (!isArrowLeftVisible) {
                    mArrowLeftButton.setImageResource(R.drawable.icn_morph_arrow_left);
                } else {
                    mArrowLeftButton.setImageResource(R.drawable.icn_morph_arrow_left_reverse);
                }
                isArrowLeftVisible = !isArrowLeftVisible;
                mAnimatable = (Animatable) (mArrowLeftButton).getDrawable();
                break;
            case R.id.btn_arrow_right:
                if (!isArrowRightVisible) {
                    mArrowRightButton.setImageResource(R.drawable.icn_morph_arrow_right);
                } else {
                    mArrowRightButton.setImageResource(R.drawable.icn_morph_arrow_right_reverse);
                }
                isArrowRightVisible = !isArrowRightVisible;
                mAnimatable = (Animatable) (mArrowRightButton).getDrawable();
                break;
        }
        mAnimatable.start();
    }

}
