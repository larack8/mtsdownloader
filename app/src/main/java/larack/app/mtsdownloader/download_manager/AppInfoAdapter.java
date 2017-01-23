package larack.app.mtsdownloader.download_manager;

import android.view.ViewGroup;

import larack.widget.practicalrecyclerview.AbstractAdapter;

/**
 * Author: Larack(larack@126.com)
 * Date: 2016/11/14
 * Time: 09:54
 * FIXME
 */
public class AppInfoAdapter extends AbstractAdapter<AppInfoBean, AppInfoViewHolder> {
    @Override
    protected AppInfoViewHolder onNewCreateViewHolder(ViewGroup parent, int viewType) {
        return new AppInfoViewHolder(parent);
    }

    @Override
    protected void onNewBindViewHolder(AppInfoViewHolder holder, int position) {
        holder.setData(get(position));
    }
}
