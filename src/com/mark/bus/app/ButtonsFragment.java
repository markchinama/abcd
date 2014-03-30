package com.mark.bus.app;

import com.mark.bus.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class ButtonsFragment extends Fragment {
	int[] lightsOffResource = { R.drawable.front_fog, R.drawable.rear_fog,
			R.drawable.hyperbaric_cabin, R.drawable.roof_light,
			R.drawable.d_roof_light, R.drawable.tv_power,
			R.drawable.guide_board, R.drawable.left_turning,
			R.drawable.right_turning, R.drawable.none,

	};
	int[] lightsOnResource = { R.drawable.front_fog_on, R.drawable.rear_fog_on,
			R.drawable.hyperbaric_cabin_on, R.drawable.roof_light_on,
			R.drawable.d_roof_light_on, R.drawable.tv_power_on,
			R.drawable.guide_board_on, R.drawable.left_turning_on,
			R.drawable.right_turning_on, R.drawable.none_on,

	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// return super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.buttons_fragment, container,
				false);

		ImageButton frontFogButton = (ImageButton) view
				.findViewById(R.id.button_front_fog);
		ImageButton rearFogButton = (ImageButton) view
				.findViewById(R.id.button_rear_fog);
		ImageButton hyperbaricCabinButton = (ImageButton) view
				.findViewById(R.id.button_hyperbaric_cabin);
		ImageButton rootLightsButton = (ImageButton) view
				.findViewById(R.id.button_root_light);
		ImageButton dRootLightsButton = (ImageButton) view
				.findViewById(R.id.button_d_roof_light);
		ImageButton tvPowerButton = (ImageButton) view
				.findViewById(R.id.button_tv_power);
		ImageButton guideBoardButton = (ImageButton) view
				.findViewById(R.id.button_guide_board);
		ImageButton leftTurnningButton = (ImageButton) view
				.findViewById(R.id.button_left_turning);
		ImageButton rightTurnningButton = (ImageButton) view
				.findViewById(R.id.button_right_turning);
		ImageButton noneButton = (ImageButton) view.findViewById(R.id.none);
	

		frontFogButton.setOnClickListener(new lightListener(0));
		rearFogButton.setOnClickListener(new lightListener(1));
		hyperbaricCabinButton.setOnClickListener(new lightListener(2));
		rootLightsButton.setOnClickListener(new lightListener(3));
		dRootLightsButton.setOnClickListener(new lightListener(4));
		tvPowerButton.setOnClickListener(new lightListener(5));
		guideBoardButton.setOnClickListener(new lightListener(6));
		leftTurnningButton.setOnClickListener(new lightListener(7));
		rightTurnningButton.setOnClickListener(new lightListener(8));
		noneButton.setOnClickListener(new lightListener(9));
		return view;
	}

	class lightListener implements OnClickListener {
		public int id;

		public int getId() {
			return id;
		}

		lightListener(int bid) {
			id = bid;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void onClick(View v) {

			BusApplication ba = (BusApplication) ButtonsFragment.this
					.getActivity().getApplication();
			int[] buttonStatus = ba.getButtonStatus();
			if (buttonStatus[id] == 0){
				buttonStatus[id] =1;
				ba.setButtonStatus(buttonStatus);
				v.setBackgroundResource(lightsOnResource[id]);
			}else{
				buttonStatus[id] =0;
				ba.setButtonStatus(buttonStatus);
				v.setBackgroundResource(lightsOffResource[id]);
			}

		}

	}
}
