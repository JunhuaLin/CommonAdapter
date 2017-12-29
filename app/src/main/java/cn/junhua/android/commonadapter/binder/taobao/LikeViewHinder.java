package cn.junhua.android.commonadapter.binder.taobao;

import cn.junhua.android.adapter.binder.SingleTypeViewBinder;
import cn.junhua.android.adapter.binder.ViewHolder;
import cn.junhua.android.commonadapter.bean.taobao.LikeBean;

/**
 * 淘宝banner
 * Created by junhua.lin on 2017/12/29.
 */
public class LikeViewHinder extends SingleTypeViewBinder<LikeBean> {

    public LikeViewHinder(Class<LikeBean> beanClass, int layoutId) {
        super(beanClass, layoutId);
    }


    @Override
    public int onCountView(LikeBean bean, int position) {
        return 0;
    }

    @Override
    public void onBindView(ViewHolder holder, LikeBean bean, int position) {

    }
}
