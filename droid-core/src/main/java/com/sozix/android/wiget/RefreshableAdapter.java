package com.sozix.android.wiget;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * @author Lukasz Strzelecki
 * @since 0.0.1
 */
public abstract class RefreshableAdapter<T> extends BaseAdapter {

	protected LayoutInflater inflater;

	protected Context context;

	protected List<T> items;


	public RefreshableAdapter(Context context, List<T> items) {
		this.context = context;
		this.items = items;
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public T getItem(int position) {
		return items.get(position);
	}

	public void refreshItems(List<T> newItems) {
		setItems(newItems);
		notifyDataSetChanged();
	}

	private void setItems(List<T> items) {
		this.items = items;
	}
}
