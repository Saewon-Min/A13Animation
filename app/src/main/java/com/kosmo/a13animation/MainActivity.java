package com.kosmo.a13animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯을 얻어옴
        imageView = (ImageView)findViewById(R.id.kakao_con);
        Button btnMove = (Button)findViewById(R.id.btn_move);
        Button btnScale = (Button)findViewById(R.id.btn_scale);
        Button btnAlpha = (Button)findViewById(R.id.btn_alpha);

        // xml로 생성한 애니메이션 리소스를 기반으로 객체 생성
        final Animation anim1 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.move);
        final Animation anim2 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.alpha);
        final Animation anim3 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.size);

        // 이동 애니메이션 적용
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(anim1);
            }
        });

        // 크기변환 애니메이션 적용
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(anim3);
            }
        });

        // 투명도 변환 애니메이션 적용
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.startAnimation(anim2);
            }
        });




    }
}