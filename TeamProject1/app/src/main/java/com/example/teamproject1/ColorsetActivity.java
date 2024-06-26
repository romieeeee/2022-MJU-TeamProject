package com.example.teamproject1;

import static com.example.teamproject1.MainActivity.userSid;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ColorsetActivity extends AppCompatActivity {

    private ImageButton back;
    private Button blue;
    private Button pink;
    private Button green;
    private UserDBHelper db;

    private GradientDrawable drawableButOval;
    private GradientDrawable drawableElipseWhiteblue;
    private GradientDrawable drawableRadiusLayout;
    private GradientDrawable drawableRadiusMainblue;
    private GradientDrawable drawableRadiusSearchLayout;
    private GradientDrawable drawableRadiusWhiteblue;
    private GradientDrawable drawableFavItem;

    private View mainNav;

    private String type = "blue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_page);

        db = new UserDBHelper(ColorsetActivity.this);
        User user = db.getUserDatabySId(userSid);

        type = user.getColor();

        back = findViewById(R.id.backBtn_col);
        blue = findViewById(R.id.blue_btn);
        pink = findViewById(R.id.pink_btn);
        green = findViewById(R.id.green_btn);

        drawableButOval = (GradientDrawable) getResources().getDrawable(R.drawable.but_oval);
        drawableElipseWhiteblue = (GradientDrawable) getResources().getDrawable(R.drawable.elipse_whiteblue);
        drawableRadiusLayout = (GradientDrawable) getResources().getDrawable(R.drawable.radius_layout);
        drawableRadiusMainblue = (GradientDrawable) getResources().getDrawable(R.drawable.radius_mainblue);
        drawableRadiusSearchLayout = (GradientDrawable) getResources().getDrawable(R.drawable.radius_search_layout);
        drawableRadiusWhiteblue = (GradientDrawable) getResources().getDrawable(R.drawable.radius_whiteblue);
        drawableFavItem = (GradientDrawable) getResources().getDrawable(R.drawable.fav_item);

        if(type.equals("blue")){
            setBlue();
        } else if(type.equals("pink")){
            setPink();
        } else if(type.equals("green")){
            setGreen();
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //파란테마 변경
                type = "blue";
                setBlue();
                if(!user.getColor().equals(type)){
                    db.updateUserColorData(userSid, type);
                }
            }
        });

        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pink
                type = "pink";
                setPink();
                if(!user.getColor().equals(type)){
                    db.updateUserColorData(userSid, type);
                }
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //green
                type = "green";
                setGreen();
                if(!user.getColor().equals(type)){
                    db.updateUserColorData(userSid, type);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void setBlue() {
        Toolbar tb = (Toolbar)findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            tb.setBackgroundColor(getColor(R.color.blue_3F9CF1));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableButOval.setColor(getColor(R.color.blue_B3D5F2));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableElipseWhiteblue.setColor(getColor(R.color.blue_E1E9F6));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusLayout.setColor(getColor(R.color.blue_B3D5F2));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusMainblue.setColor(getColor(R.color.blue_3F9CF1));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusSearchLayout.setColor(getColor(R.color.blue_E1E9F6));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusWhiteblue.setColor(getColor(R.color.blue_E1E9F6));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableFavItem.setColor(getColor(R.color.blue_E1E9F6));
        }
    }

    public void setPink() {
        Toolbar tb = (Toolbar)findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            tb.setBackgroundColor(getColor(R.color.pink_F13FCA));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableButOval.setColor(getColor(R.color.pink_F2B3DD));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableElipseWhiteblue.setColor(getColor(R.color.pink_F6E1F1));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusLayout.setColor(getColor(R.color.pink_F2B3DD));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusMainblue.setColor(getColor(R.color.pink_F13FCA));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusSearchLayout.setColor(getColor(R.color.pink_F6E1F1));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusWhiteblue.setColor(getColor(R.color.pink_F6E1F1));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableFavItem.setColor(getColor(R.color.pink_F6E1F1));
        }
    }

    public void setGreen() {
        Toolbar tb = (Toolbar)findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            tb.setBackgroundColor(getColor(R.color.green_64AE70));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableButOval.setColor(getColor(R.color.green_B3F2B9));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableElipseWhiteblue.setColor(getColor(R.color.green_E1F6E2));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusLayout.setColor(getColor(R.color.green_B3F2B9));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusMainblue.setColor(getColor(R.color.green_64AE70));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusSearchLayout.setColor(getColor(R.color.green_E1F6E2));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableRadiusWhiteblue.setColor(getColor(R.color.green_E1F6E2));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            drawableFavItem.setColor(getColor(R.color.green_E1F6E2));
        }
    }
}