package com.mark.bus.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnScrollListener;
import android.widget.Spinner;
import android.widget.Toast;

import com.mark.bus.R;

/**
 * An activity representing a list of Items. This activity has different
 * presentations for handset and tablet-size devices. On handsets, the activity
 * presents a list of items, which when touched, lead to a
 * {@link ItemDetailActivity} representing item details. On tablets, the
 * activity presents the list of items and item details side-by-side using two
 * vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link ItemListFragment} and the item details (if present) is a
 * {@link ItemDetailFragment}.
 * <p>
 * This activity also implements the required {@link ItemListFragment.Callbacks}
 * interface to listen for item selections.
 */
public class ItemListActivity extends FragmentActivity implements ItemListFragment.Callbacks {
	/**
	 * Whether or not the activity is in two-pane mode, i.e. running on a tablet
	 * device.
	 */
	// private boolean mTwoPane;

	private ImageButton shutdownButton;
	private NumberPicker temperature;

	private Spinner modeSpinner;
	private ArrayAdapter<String> modeSpinnerAdapter;

	private NumberPicker powerPicker;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item_list);

		bindAllViews();

		// if (findViewById(R.id.item_detail_container) != null) {
		// // The detail container view will be present only in the
		// // large-screen layouts (res/values-large and
		// // res/values-sw600dp). If this view is present, then the
		// // activity should be in two-pane mode.
		// mTwoPane = true;
		//
		// // In two-pane mode, list items should be given the
		// // 'activated' state when touched.
		// ((ItemListFragment)
		// getSupportFragmentManager().findFragmentById(R.id.item_list))
		// .setActivateOnItemClick(true);
		// }

		// TODO: If exposing deep links into your app, handle intents here.
	}

	/**
	 * 初始化视图对象
	 */
	private void bindAllViews() {
		shutdownButton = (ImageButton) findViewById(R.id.item_list_shutdown);
		shutdownButton.setOnClickListener(new ShutdownListener());

		temperature = (NumberPicker) findViewById(R.id.item_list_temprature_picker);
		temperature.setMaxValue(35);
		temperature.setMinValue(16);
		temperature.setWrapSelectorWheel(false);
		temperature.setOnScrollListener(new TemperatureChangeListener());
		temperature.setFocusable(false);

		modeSpinner = (Spinner) findViewById(R.id.item_list_temprature_mode_spinner);
		modeSpinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, new String[] {
		        "模式1", "模式2", "模式3" });
		modeSpinner.setAdapter(modeSpinnerAdapter);
		modeSpinner.setOnItemSelectedListener(new ModeSpinnerSelectedListener());

		powerPicker = (NumberPicker) findViewById(R.id.item_list_power_picker);
		int minValue = 500;
		int maxValue = 3000;
		// String[] valueSet = genPowerDisplays(minValue, maxValue);
		powerPicker.setMinValue(minValue);
		powerPicker.setMaxValue(maxValue);
		powerPicker.setFocusable(false);
		powerPicker.setOnScrollListener(new PowerChangeListener());
	}

	/**
	 * 计算 功率选择器 区间
	 * 
	 * @param minValue
	 * @param maxValue
	 * @return
	 */
	private String[] genPowerDisplays(int minValue, int maxValue) {
		int step = 100;
		String[] valueSet = new String[(maxValue - minValue) / step + 1];
		for (int i = 0; i < valueSet.length; i++) {
			valueSet[i] = String.valueOf(minValue + step * i);
		}
		return valueSet;
	}

	/**
	 * Callback method from {@link ItemListFragment.Callbacks} indicating that
	 * the item with the given ID was selected.
	 */
	@Override
	public void onItemSelected(String id) {
		// if (mTwoPane) {
		// In two-pane mode, show the detail view in this activity by
		// adding or replacing the detail fragment using a
		// fragment transaction.
		Bundle arguments = new Bundle();

		arguments.putString(ItemDetailFragment.ARG_ITEM_ID, id);
		
		Fragment target = null;
		if (id.equals("1")) {
			target = statusDetailFragment(arguments);
		} else {
			target = itemDetailFragment(arguments);
		}
		getSupportFragmentManager().beginTransaction().replace(R.id.item_detail_container, target).commit();

		// } else {
		// // In single-pane mode, simply start the detail activity
		// // for the selected item ID.
		// Intent detailIntent = new Intent(this, ItemDetailActivity.class);
		// detailIntent.putExtra(ItemDetailFragment.ARG_ITEM_ID, id);
		// startActivity(detailIntent);
		// }
	}

	private Fragment statusDetailFragment(Bundle arguments) {
		return new StatusDetailFragment();
	}

	private Fragment itemDetailFragment(Bundle arguments) {
		ItemDetailFragment itemDetailFragment = new ItemDetailFragment();
		itemDetailFragment.setArguments(arguments);
		return itemDetailFragment;
	}

	/**
	 * 关闭系统
	 * 
	 * @author emerson
	 * 
	 */
	private class ShutdownListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			Toast.makeText(ItemListActivity.this, "您点击了关闭系统按钮", Toast.LENGTH_LONG).show();
		}
	}

	/**
	 * 温度调节
	 * 
	 * @author emerson
	 * 
	 */
	private class TemperatureChangeListener implements OnScrollListener {
		@Override
		public void onScrollStateChange(NumberPicker view, int scrollState) {
			if (scrollState == OnScrollListener.SCROLL_STATE_IDLE) {
				Toast.makeText(ItemListActivity.this, "温度调整到 " + view.getValue(), Toast.LENGTH_SHORT).show();
			}
		}
	}

	/**
	 * 模式选择
	 * 
	 * @author emerson
	 * 
	 */
	private class ModeSpinnerSelectedListener implements OnItemSelectedListener {
		@Override
		public void onItemSelected(AdapterView<?> adapterView, View view, int position, long arg3) {
			Toast.makeText(ItemListActivity.this, "选择了 " + modeSpinnerAdapter.getItem(position), Toast.LENGTH_SHORT)
			        .show();
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
		}
	}

	/**
	 * 功率调节
	 * 
	 * @author emerson
	 * 
	 */
	private class PowerChangeListener implements OnScrollListener {
		@Override
		public void onScrollStateChange(NumberPicker view, int scrollState) {
			if (scrollState == OnScrollListener.SCROLL_STATE_IDLE) {
				Toast.makeText(ItemListActivity.this, "功率调整到 " + view.getValue(), Toast.LENGTH_SHORT).show();
			}
		}
	}

}
