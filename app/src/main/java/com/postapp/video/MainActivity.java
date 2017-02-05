package com.postapp.video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shuyu.gsyvideoplayer.utils.Debuger;

public class MainActivity extends Activity {
    private Button openBtn;
    private Button openGuidePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Debuger.enable();

        openBtn = (Button) findViewById(R.id.open_btn);
        openGuidePage = (Button) findViewById(R.id.open_guide_page);
        openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JumpUtils.goToVideoPlayer(MainActivity.this, openBtn);

            }
        });

        openGuidePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JumpUtils.goToGuideVideoPlayer(MainActivity.this, openGuidePage);
            }
        });
    }
}
