package in.easypaper.easypaperwork;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by gunis on 08-02-2018.
 */

public class OCR  extends AppCompatActivity {
    private WebView mwebviewOcr;
    @Override
    public void setContentView(View view) {
        super.setContentView(R.layout.activity_ocr);
        mwebviewOcr =  findViewById(R.id.webview);

        WebSettings webSettings = mwebviewOcr.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebviewOcr.loadUrl("http://www.newocr.com/");

    }


}