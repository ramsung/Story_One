package beyonity.story_one;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
    }

    public void crime(View view){
        Intent cr = new Intent(Tips.this, TipsWebview.class);
        startActivity(cr);
    }
}