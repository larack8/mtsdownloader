package larack.app.mtsdownloader.download_manager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import larack.libs.mtsdownloader.MtsDownloader;
import larack.libs.mtsdownloader.entity.DownloadRecord;
import larack.widget.practicalrecyclerview.PracticalRecyclerView;
import larack.app.mtsdownloader.R;

public class DownloadManagerActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.recycler)
    PracticalRecyclerView mRecycler;
    @BindView(R.id.content_main)
    RelativeLayout mContentMain;

    private DownloadAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_manager);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        mAdapter = new DownloadAdapter();
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapterWithLoading(mAdapter);
        loadData();
    }

    private void loadData() {
        MtsDownloader.getInstance().context(this).getTotalDownloadRecords()
                .map(new Function<List<DownloadRecord>, List<DownloadBean>>() {
                    @Override
                    public List<DownloadBean> apply(List<DownloadRecord> downloadRecords) throws Exception {
                        List<DownloadBean> result = new ArrayList<>();
                        for (DownloadRecord each : downloadRecords) {
                            DownloadBean bean = new DownloadBean();
                            bean.mRecord = each;
                            result.add(bean);
                        }
                        return result;
                    }
                })
                .subscribe(new Consumer<List<DownloadBean>>() {
                    @Override
                    public void accept(List<DownloadBean> downloadBeen) throws Exception {
                        mAdapter.addAll(downloadBeen);
                    }
                });
    }
}
