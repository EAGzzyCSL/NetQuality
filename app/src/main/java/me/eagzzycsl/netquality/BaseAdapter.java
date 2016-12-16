package me.eagzzycsl.netquality;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

abstract class BaseAdapter<D extends BaseDatum> extends RecyclerView.Adapter<BaseAdapter<D>.RecViewHolder<D>> {
    protected Context context;
    private ArrayList<D> dataArray;

    BaseAdapter(Context context) {
        this.context = context;
    }

    @Override
    public void onBindViewHolder(RecViewHolder<D> holder, int position) {
        holder.setContent(dataArray.get(position));
    }

    @Override
    public int getItemCount() {
        return dataArray == null ? 0 : dataArray.size();
    }

    public abstract int getLayoutId();

    void setDataArray(ArrayList<D> dataArray) {
        this.dataArray = dataArray;
    }

    abstract class RecViewHolder<E extends BaseDatum> extends RecyclerView.ViewHolder {
        RecViewHolder(View itemView) {
            super(itemView);
        }

        public abstract void setContent(E data);
    }

}