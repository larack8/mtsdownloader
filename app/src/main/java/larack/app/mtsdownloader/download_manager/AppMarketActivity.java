package larack.app.mtsdownloader.download_manager;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import larack.widget.practicalrecyclerview.PracticalRecyclerView;
import larack.app.mtsdownloader.R;

public class AppMarketActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.recycler)
    PracticalRecyclerView mRecycler;

    private AppInfoAdapter mAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_download_manage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_download_manage) {
            startActivity(new Intent(this, DownloadManagerActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_market);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        mAdapter = new AppInfoAdapter();
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapterWithLoading(mAdapter);
        loadData();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        loadData();
    }

    private void loadData() {
        Resources res = getResources();
        final String[] names = res.getStringArray(R.array.name);
        final String[] images = res.getStringArray(R.array.image);
        final String[] infos = res.getStringArray(R.array.info);
        final String[] urls = res.getStringArray(R.array.url);
        List<AppInfoBean> list = new ArrayList<>();
        for (int i = 0; i < images.length; i++) {
            AppInfoBean temp = new AppInfoBean(names[i], images[i], infos[i], urls[i]);
            list.add(temp);
        }
        mAdapter.clear();
        mAdapter.addAll(list);
    }
}
