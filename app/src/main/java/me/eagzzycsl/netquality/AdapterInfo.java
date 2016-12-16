package me.eagzzycsl.netquality;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class AdapterInfo extends BaseAdapter<DatumInfo> {
    AdapterInfo(Context context) {
        super(context);

    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_item_info;
    }

    @Override
    public InfoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new InfoHolder(LayoutInflater.from(context).inflate(getLayoutId(), parent, false));
    }

    private class InfoHolder extends RecViewHolder<DatumInfo> {
        private final TextView item_name;
        private final TextView item_value;

        InfoHolder(View itemView) {
            super(itemView);
            item_name = (TextView) itemView.findViewById(R.id.item_name);
            item_value = (TextView) itemView.findViewById(R.id.item_value);
        }

        @Override
        public void setContent(DatumInfo data) {
            item_name.setText(data.getName());
            item_value.setText(data.getValue());
        }
    }
}
