package larack.widget.practicalrecyclerview;

import android.view.View;

/**
 * Author: Larack(larack@126.com)
 * Date: 2016/9/26
 * Time: 15:05
 * FIXME
 */
public interface Configure {
    void configureEmptyView(View emptyView);

    void configureErrorView(View errorView);

    void configureLoadingView(View loadingView);

    void configureLoadMoreView(View loadMoreView);

    void configureNoMoreView(View noMoreView);

    void configureLoadMoreFailedView(View loadMoreFailedView);
}
