package larack.widget.practicalrecyclerview;

import android.view.View;
import android.view.ViewGroup;

/**
 * Author: Larack(larack@126.com)
 * Date: 2016/9/27
 * Time: 17:01
 * FIXME
 */
public class SectionItemImpl implements SectionItem {

    private View mView;

    public SectionItemImpl() {
    }

    public SectionItemImpl(View view) {
        mView = view;
    }

    @Override
    public View createView(ViewGroup parent) {
        return mView;
    }

    @Override
    public void onBind() {

    }
}
