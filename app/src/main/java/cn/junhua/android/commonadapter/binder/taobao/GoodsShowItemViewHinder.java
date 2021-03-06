package cn.junhua.android.commonadapter.binder.taobao;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.junhua.android.adapter.SimpleItemViewBinder;
import cn.junhua.android.adapter.CommonViewHolder;
import cn.junhua.android.commonadapter.R;
import cn.junhua.android.commonadapter.bean.taobao.GoodsShowBean;

/**
 * 淘宝商品展示
 * Created by junhua.lin on 2017/12/29.
 */
public class GoodsShowItemViewHinder extends SimpleItemViewBinder<GoodsShowBean> {

    @Override
    protected int getLayoutId() {
        return R.layout.binder_goods_show;
    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, GoodsShowBean bean, int position) {
        holder.setText(R.id.tv_goods_title, bean.getTitle())
                .setText(R.id.tv_title1, bean.getTitle1())
                .setText(R.id.tv_title2, bean.getTitle2())
                .setText(R.id.tv_goods_title3, bean.getTitle3())
                .setText(R.id.tv_goods_subtitle3, bean.getSubtitle3())
                .setText(R.id.tv_goods_title4, bean.getTitle4())
                .setText(R.id.tv_goods_subtitle4, bean.getSubtitle4())
                .setText(R.id.tv_goods_title5, bean.getTitle5())
                .setText(R.id.tv_goods_subtitle5, bean.getSubtitle5())
                .setText(R.id.tv_goods_title6, bean.getTitle6())
                .setText(R.id.tv_goods_subtitle6, bean.getSubtitle6());

        setImage(holder, bean.getPhoto1(), R.id.iv_goods_photo1);
        setImage(holder, bean.getPhoto2(), R.id.iv_goods_photo2);
        setImage(holder, bean.getPhoto3_1(), R.id.iv_goods_photo3_1);
        setImage(holder, bean.getPhoto3_2(), R.id.iv_goods_photo3_2);
        setImage(holder, bean.getPhoto4_1(), R.id.iv_goods_photo4_1);
        setImage(holder, bean.getPhoto4_2(), R.id.iv_goods_photo4_2);
        setImage(holder, bean.getPhoto5_1(), R.id.iv_goods_photo5_1);
        setImage(holder, bean.getPhoto5_2(), R.id.iv_goods_photo5_2);
        setImage(holder, bean.getPhoto6_1(), R.id.iv_goods_photo6_1);
        setImage(holder, bean.getPhoto6_2(), R.id.iv_goods_photo6_2);
    }

    private void setImage(CommonViewHolder holder, String url, int id) {
        ImageView iv_goods_photo1 = holder.findView(id);
        Glide.with(iv_goods_photo1.getContext()).load(url).into(iv_goods_photo1);
    }
}
