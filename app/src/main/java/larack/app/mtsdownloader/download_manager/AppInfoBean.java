package larack.app.mtsdownloader.download_manager;

import larack.widget.practicalrecyclerview.ItemType;

/**
 * Author: Larack(larack@126.com)
 * Date: 2016/11/14
 * Time: 09:43
 * FIXME
 */
public class AppInfoBean implements ItemType {
    String name;
    String img;
    String info;
    String downloadUrl;
    String saveName;

    public AppInfoBean(String name, String img, String info, String downloadUrl) {
        this.name = name;
        this.img = img;
        this.info = info;
        this.downloadUrl = downloadUrl;
        this.saveName = getSaveNameByUrl(downloadUrl);
    }

    @Override
    public int itemType() {
        return 0;
    }


    /**
     * 截取Url最后一段作为文件保存名称
     *
     * @param url url
     * @return saveName
     */
    private String getSaveNameByUrl(String url) {
        return url.substring(url.lastIndexOf('/') + 1);
    }
}
