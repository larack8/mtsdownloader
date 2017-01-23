package larack.libs.mtsdownloader;

import org.junit.Test;

import larack.libs.mtsdownloader.function.Utils;

/**
 * Author: Larack(larack@126.com)
 * Date: 2016/11/1
 * Time: 17:05
 * FIXME
 */
public class GMTTest {
    @Test
    public void GMTToLong() throws Exception {
        long l = Utils.GMTToLong("Fri, 04 Oct 2016 00:35:29 GMT");
        System.out.println(l);
        long a = Utils.GMTToLong(null);
        System.out.println(a);
    }

    @Test
    public void longToGMT() throws Exception {
        String str = Utils.longToGMT(1475541329000L);
        System.out.println(str);
    }

    @Test
    public void substringTest() throws Exception {
        String str = "http://dldir1.qq.com/weixin/android/weixin6330android920.apk";
        System.out.println(str.substring(str.lastIndexOf('/') + 1));
    }

}