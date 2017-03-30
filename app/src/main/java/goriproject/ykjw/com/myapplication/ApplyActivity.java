package goriproject.ykjw.com.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ApplyActivity extends AppCompatActivity {

    Apply_1Fragment ap1;
    FragmentManager manager;

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);

        ap1 = new Apply_1Fragment();

        // 프래그먼트 매니저 가져오기
        manager = getSupportFragmentManager();

        img = (ImageView)findViewById(R.id.apply_profile1);


        Glide.with(this).load(R.drawable.profile_dummy2).into(img);

    }

    public void click_next(View view) {
// 1. 프래그먼트를 실행하기위한 트랜잭션 시작
        FragmentTransaction transaction = manager.beginTransaction();
        // 2. 프래그먼트를 레이아웃에 add 한다
        transaction.add(R.id.fragmentbatang, ap1);
        // 최초 호출되는 프래그먼트는 addToBackStack 을 사용하지 않는다
        //transaction.addToBackStack(null);
        // 3. git 의 commit 과 같은 기능
        transaction.commit();
    }

}
