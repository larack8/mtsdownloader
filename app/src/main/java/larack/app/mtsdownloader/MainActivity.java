package larack.app.mtsdownloader;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import larack.app.mtsdownloader.basic_download.BasicDownloadActivity;
import larack.app.mtsdownloader.download_manager.AppMarketActivity;
import larack.app.mtsdownloader.service_download.ServiceDownloadActivity;
import larack.app.mtsdownloader.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.service_download)
    Button mServiceDownload;
    @BindView(R.id.content_menu)
    LinearLayout mContentMenu;
    @BindView(R.id.fab)
    FloatingActionButton mFab;
    @BindView(R.id.basic_download)
    Button mBasicDownload;

    @OnClick({R.id.basic_download, R.id.service_download, R.id.app_market})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.basic_download:
                startActivity(new Intent(this, BasicDownloadActivity.class));
                break;
            case R.id.service_download:
                startActivity(new Intent(this, ServiceDownloadActivity.class));
                break;
            case R.id.app_market:
                startActivity(new Intent(this, AppMarketActivity.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

    }

}
