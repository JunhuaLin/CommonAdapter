package cn.junhua.android.commonadapter.binder;

import cn.junhua.android.adapter.binder.SingleTypeViewBinder;
import cn.junhua.android.adapter.binder.ViewHolder;
import cn.junhua.android.commonadapter.R;
import cn.junhua.android.commonadapter.bean.Item1;

/**
 * Created by junhua on 17-3-15.
 */
public class RecyclerViewSingleBinder extends SingleTypeViewBinder<Item1> {

    private int[] images = new int[]{
            R.mipmap.image1,
            R.mipmap.image2,
            R.mipmap.image3
    };

    public RecyclerViewSingleBinder() {
        super(Item1.class, R.layout.layout_item1_type1);
    }


    @Override
    public int onCountView(Item1 bean, int position) {
        return 3;
    }

    @Override
    public void onBindView(ViewHolder holder, Item1 bean, int position) {
        holder.setText(R.id.title_tv, bean.getTitle())
                .setImageResource(R.id.icon_iv, bean.getImageId())
                .setBackgroundResource(R.id.bg_ll, images[position % images.length]);
    }

}