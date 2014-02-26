package com.mark.bus.listable;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mark.bus.R;
import com.mark.bus.listable.dto.ListItemDTO;

public class ItemListAdapter extends ArrayAdapter<ListItemDTO> {

	// 布局反射器
	private LayoutInflater mLayoutInflater;
	// 布局资源文件
	private int mLayoutResource = 0;

	public ItemListAdapter(Context context, int textViewResourceId, List<ListItemDTO> objects) {
		super(context, textViewResourceId, objects);
		mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mLayoutResource = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return createViewFromResource(position, convertView, parent);
	}
	
	private View createViewFromResource(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		ItemListViewWrapper wrapper = null;

		if (row == null) {
			row = mLayoutInflater.inflate(mLayoutResource, parent, false);
			wrapper = new ItemListViewWrapper(row);
			row.setTag(wrapper);
		} else {
			wrapper = (ItemListViewWrapper) row.getTag();
		}

		ListItemDTO item = getItem(position);
		// 设置显示值
		wrapper.setView(item, position);
		return row;
	}

}

class ItemListViewWrapper {
	private View base;
	private ImageView publisherImage;
	private TextView timeText;

	public ItemListViewWrapper(View base) {
		super();
		this.base = base;
	}

	public ImageView getPublisherImage() {
		if (publisherImage == null) {
	        publisherImage = (ImageView) base.findViewById(R.id.list_item_image);
        }
		return publisherImage;
	}

	public TextView getTimeText() {
		if (timeText == null) {
	        timeText = (TextView) base.findViewById(R.id.list_item_text);
        }
		return timeText;
	}
	
	public void setView(ListItemDTO item,int position){
		getPublisherImage().setImageResource(item.getImageId());
		getTimeText().setText(item.getText());
	}

}
