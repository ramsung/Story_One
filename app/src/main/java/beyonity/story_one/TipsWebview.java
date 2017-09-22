package beyonity.story_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TipsWebview extends AppCompatActivity {
	WebView wv;
	int fontsize = 10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tips_webview);

		WebChromeClient chromeClient = new WebChromeClient();
		wv = (WebView) findViewById(R.id.web_crime);
		wv.setWebChromeClient(new WebChromeClient());
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setSupportZoom(true);
		wv.getSettings().setBuiltInZoomControls(true);
		wv.getSettings().setDisplayZoomControls(false);

		wv.getSettings().setUseWideViewPort(false);
		wv.getSettings().setLoadWithOverviewMode(true);

		wv.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
		wv.loadUrl("file:///android_asset/crime.html");
		//wv.loadUrl("http://www.vol1brooklyn.com/2017/09/20/do-you-hear-the-train/");


	}

	public void increase(View view){
		fontsize = wv.getSettings().getTextZoom();
		wv.getSettings().setTextZoom((int) (wv.getSettings().getTextZoom() * 1.3));

	}

	public void decrease(View view){
		fontsize = wv.getSettings().getTextZoom();
		wv.getSettings().setTextZoom((int) (wv.getSettings().getTextZoom() / 1.3));
	}
}
