
package com.demo.xiaozhu.architecturecomponent.ui.base;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description:月视图列表适配器
 * @Author: fengzeyuan
 * @Date: 17/8/30 下午7:36
 * @Version: 1.0
 */
public abstract class XZBaseRecycleViewAdapter<T> extends
        RecyclerView.Adapter<XZBaseRecycleViewAdapter.BaseViewHolder> {

    protected List<T> mList = new ArrayList<>();

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindDate(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public T getItem(int pos) {
        if (pos > 0 && pos < mList.size()) {
            return mList.get(pos);
        }
        return null;
    }
    
    public void refreshList(Collection<T> orderInvoice, boolean isAppend){
        if (!isAppend) {
            mList.clear();
        }
        mList.addAll(orderInvoice);
        notifyDataSetChanged();
    }


    @Override
    abstract public BaseViewHolder<T> onCreateViewHolder(ViewGroup parent, int viewType);

    public abstract class BaseViewHolder<T> extends ViewHolder {

        public BaseViewHolder(View view) {
            super(view);
            initView(view);
        }

        public void initView(View view) {

        }

        public abstract void bindDate(int position);
    }
}
