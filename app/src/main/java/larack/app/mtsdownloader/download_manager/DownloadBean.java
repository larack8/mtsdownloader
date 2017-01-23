package larack.app.mtsdownloader.download_manager;

import larack.libs.mtsdownloader.entity.DownloadRecord;
import larack.widget.practicalrecyclerview.ItemType;

/**
 * Author: Larack(larack@126.com)
 * Date: 2016/10/28
 * Time: 09:30
 * FIXME
 */
public class DownloadBean implements ItemType {
    DownloadRecord mRecord;

    @Override
    public int itemType() {
        return 0;
    }
}
