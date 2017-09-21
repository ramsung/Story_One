package beyonity.story_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TipsWebview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_webview);
        WebView wv;
        wv = (WebView) findViewById(R.id.web_crime);
        wv.loadUrl("https://www.google.co.in/");
    }
}
