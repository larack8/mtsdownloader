package larack.widget.practicalrecyclerview;

import android.view.View;
import android.view.ViewGroup;

/**
 * Author: Larack(larack@126.com)
 * Date: 2016/9/22
 * Time: 15:33
 * FIXME
 */
public interface SectionItem {

    View createView(ViewGroup parent);

    void onBind();
}
