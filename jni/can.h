typedef struct controller_send1{
	unsigned char high_press_wane_close:1;
	unsigned char key_st:1;
	unsigned char key_on:1;
	unsigned char key_acc:1;
	unsigned char revolution_status:2;
	unsigned char revolution_mode:1;
	unsigned char contactor_status:1;


	unsigned char battery_temperatue_over_low:1;
	unsigned char battery_temperatue_over_high:1;
	unsigned char battery_charge_current_over:1;
	unsigned char battery_discharge_current_over:1;
	unsigned char single_battery_vlotage_over_low:1;
	unsigned char single_battery_vlotage_over_high:1;
	unsigned char battery_vlotage_over_low:1;
	unsigned char battery_vlotage_over_high:1;

	unsigned char bus_air_press_low;
	unsigned char bus_air_press_high;

	unsigned char dynamo_torque_low;
	unsigned char dynamo_torque_high;

	unsigned char dynano_break_priority:1;
	unsigned char :1;
	unsigned char idling:1;
	unsigned char break_singal:1;
	unsigned char n:1;
	unsigned char d:1;
	unsigned char r:1;
	unsigned char p:1;

	unsigned char :2;
	unsigned char air_press_sensor_alarm:1;
	unsigned char standard_parameter_check_issue:1;
	unsigned char water_low:1;
	unsigned char water_pump:1;
	unsigned char ac:1;
	unsigned char break_availid:1;
}controller_send_data1;


typedef struct controller_send2{
	unsigned char :8;
	unsigned char :8;

	unsigned char alarm_light_signal:1;
	unsigned char issue_light_signal:1;
	unsigned char ready_light_signal:1;
	unsigned char :0;

	unsigned char :8;

	unsigned char break_signal_low;
	unsigned char break_signal_high;


	unsigned char accelerator_signal_low;
	unsigned char accelerator_signal_high;

}controller_send_date2;

typedef struct controller_send3{
	unsigned char consume_since_last_charge_low;
	unsigned char consume_since_last_charge_high;

	unsigned char bus_air_press_low;
	unsigned char bus_air_press_high;

	unsigned char present_power_low;
	unsigned char present_power_high;


	unsigned char realtime_speed_low;
	unsigned char realtime_speed_high;

}controller_send_date3;

typedef struct controller_send5{
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
    unsigned char wind_speed_position;
	unsigned char temperature;

	unsigned char ac_wind_mode:4;
	unsigned char ac_mode:4;

    unsigned char ac_power;
	unsigned char ac_on;


}controller_send_date5;


typedef struct controller_send7{
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;


	unsigned char :1;
	unsigned char charge_contactor_close_apply_signal:1;
	unsigned char defrost_relay_close_apply_signal:1;
	unsigned char ac_relay_close_apply_signal:1;
	unsigned char main_contactor_close_apply_signal:1;
	unsigned char precharge_contactor_close_apply_signal:1;
	unsigned char power_contactor_close_apply_signal:1;
	unsigned char power_precharge_contactor_close_apply_signal:1;


}controller_send_date7;


typedef struct controller_send8{
	unsigned char cur_mile_low;
	unsigned char cur_mile_high;

	unsigned char total_mile[4];

	unsigned char availid_mile_low;
	unsigned char availid_mile_high;

}controller_send_date8;

typedef struct controller_send9 {
	unsigned char charge_relay:1;
	unsigned char air_pump:1;
	unsigned char water_pump:1;
	unsigned char fan2:1;
	unsigned char fan1:1;
	unsigned char ac:1;
	unsigned char :0;

	unsigned char :1;
	unsigned char high_pressure_already_closed:1;
	unsigned char high_pressure_close_command:1;
	unsigned char precharge_already_closed:1;
	unsigned char precharge_close_command:1;
	unsigned char key_start:1;
	unsigned char receive_wane_close_signal:1;
	unsigned char key_on_signal:1;

	unsigned char :8;

	unsigned char charge_left_time_low;
	unsigned char charge_left_time_high;

	unsigned char :8 ;
	unsigned char :8 ;
	unsigned char :8 ;
}controller_send_date9;

typedef struct battery_send1{

	unsigned char battery_realtime_voltage_low;
	unsigned char battery_realtime_voltage_high;
	unsigned char battery_realtime_current_low;
	unsigned char battery_realtime_current_high;
	unsigned char battery_soc;

	unsigned char module_voltage_high:1;
	unsigned char module_voltage_low:1;
	unsigned char soc_high:1;
	unsigned char soc_low:1;
	unsigned char overload:1;
	unsigned char temeperature_high_stop:1;
	unsigned char soc_high_stop:1;
	unsigned char mismatch:1;

	unsigned char :3;
	unsigned char charge_stake_connect_flag:1;
	unsigned char charge_forbbiden_flag:1;
	unsigned char :0;

	unsigned char :8;

}battery_send_data1;


typedef struct battery_send2{

	unsigned char battery_min_press_low;
	unsigned char battery_min_press_high;
	unsigned char battery_max_press_low;
	unsigned char battery_max_press_high;
	unsigned char battery_max_temperature;
	unsigned char battery_temperatue_range;

	unsigned char bms_issue:2;
	unsigned char over_heat_issue:2;
	unsigned char temperature_balance_issue:2;
	unsigned char voltage_balance_issue:2;

	unsigned char battery_count;

}battery_send_data2;


typedef struct battery_send4{

	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char recharge_low;
	unsigned char recharge_high;
	unsigned char discharge_low;
	unsigned char discharge_high;
}battery_send_data4;

typedef struct battery_send3{

	unsigned char low_press_battery_count;

	unsigned char high_press_battery_count;

	unsigned char battery_position_by_press_low:4;
	unsigned char battery_position_by_press_high:4;

	unsigned char battery_position_by_temperature_low:4;
	unsigned char battery_position_by_temperature_high:4;

	unsigned char :8;
	unsigned char :8;

	unsigned char power_left_low;
	unsigned char power_left_high;
}battery_send_data3;

typedef struct insulation_detect_send{
	unsigned char status :4;
	unsigned char alarm  :2;
	unsigned char:0;

	unsigned char insulation_resistance_low;
	unsigned char insulation_resistance_high;

	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;

	unsigned char life_signal;
}insulation_detect_send_data;
typedef struct  instrument_send1{
	unsigned char :8;

	unsigned char back_door:2;
	unsigned char front_door:2;
	unsigned char mid_door:2;
	unsigned char rear_door:2;

	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
}instrument_send_data1;

typedef struct  instrument_send2{
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char :8;
	unsigned char trip_milestone_zero_flag;
	unsigned char :8;
	unsigned char :8;
}instrument_send_data2;

typedef struct dynamo_send1{
	unsigned char main_contactor:1;
	unsigned char dynamo:1;
	unsigned char power:1;
	unsigned char mode:1;
	unsigned char nr:1;
	unsigned char :2;
	unsigned char state:1;

	unsigned char :8;

	unsigned char dynamo_current_low;
	unsigned char dynamo_current_high;

	unsigned char dynamo_controller_voltage_low;
	unsigned char dynamo_controller_voltage_high;

	unsigned char dynamo_cur_torque_low;
	unsigned char dynamo_cur_torque_high;

} dynamo_send_data1;

typedef struct dynamo_send2{
    unsigned char controller_temperature;
	unsigned char dynamo_temperature;

	unsigned char dynamo_rpm_low;
	unsigned char dynamo_rpm_high;



	unsigned char :8;
	unsigned char :8;

	unsigned char dynamo_controller_over_heat:1;
	unsigned char dynamo_controller_less_pressure:1;
	unsigned char dynamo_controller_over_speed:1;
	unsigned char dynamo_controller_over_load:1;
	unsigned char switch_logic_check:1;
	unsigned char foot_break_alarm:1;
	unsigned char contactor_point_issue:1;
	unsigned char power_on_neutral_position_check_issue:1;

	unsigned char direct_current_over_press:1;
	unsigned char igbt_issue:1;
	unsigned char dynamo_controller_over:1;
	unsigned char controller_electirc_less_press:1;
	unsigned char dynamo_controller_over_press:1;
	unsigned char high_footboard_issue:1;
	unsigned char hand_break_alarm:1;
	unsigned char ready_signal:1;


} dynamo_send_data2;


typedef struct dynamo_send3{
    unsigned char dynamo_max_drive_low;
	unsigned char dynamo_max_drive_high;

	unsigned char dynamo_max_break_low;
	unsigned char dynamo_max_break_high;

	unsigned char dynamo_max_drive_torque_low;
	unsigned char dynamo_max_drive_torque_high;

	unsigned char dynamo_max_break_torque_low;
	unsigned char dynamo_max_break_torque_high;
} dynamo_send_data3;

typedef struct pdc_brocast_send{
	unsigned char main_power_output_status:1;
	unsigned char :1;
	unsigned char ac_relay_output_status:1;
	unsigned char defrost_relay_output_status:1;
	unsigned char high_pressure_light_status:1;
	unsigned char :1;
	unsigned char main_contactor_output_status:1;
	unsigned char precharge_contactor_output_status:1;

	unsigned char main_power_precharge_contacor_output_status:1;
	unsigned char recharge_relay_output_status:1;
	unsigned char : 0;

	unsigned char main_power_contactor_feedback_status:1;
	unsigned char:1;
	unsigned char ac_relay_feedback_status:1;
	unsigned char defrost_relay_feedback_status:1;
	unsigned char high_pressure_light_feedback_status:1;
	unsigned char :1;
	unsigned char main_contactor_feedback_status:1;
	unsigned char precharge_contactor_feedback_status:1;

	unsigned char main_power_precharge_contacor_feedback_status:1;
	unsigned char recharge_relay_feedback_status:1;
	unsigned char : 0;

	unsigned char total_electric_current_low_byte;

    unsigned char total_electric_current_high_byte;

	unsigned char :8;

	unsigned char can_life_signal;

}pdc_brocast_send_data;


typedef struct ac_can_send{
	unsigned char issue_code;

	unsigned char : 8;

	unsigned char : 8;

	unsigned char cur_wind_speed;

	unsigned char cur_inner_temperature;

	unsigned char ac_wind_mode :4;

	unsigned char ac_mode :4;

	unsigned char ac_power ;

	unsigned char ac_switch;

}ac_can_send_data;


typedef struct fire_alam_send{
    unsigned char device_status :4;
	unsigned char :0;

	unsigned char sensor_communication;

	unsigned char sensor_block;

	unsigned char sensor_issue;

	unsigned char :8;
	unsigned char :8;
	unsigned char :8;

	unsigned char life_signal;

} fire_alarm_send_data;



typedef struct  main_can_module_send{
	    unsigned char :8;

		unsigned char :8;

		unsigned char :1;
		unsigned char warter_electric_mechine:1;
        unsigned char front_door_off:1;
		unsigned char front_door_on:1;
		unsigned char near_light:1;
		unsigned char front_fog:1;
		unsigned char far_light:1;
		unsigned char front_step_light:1;

		unsigned char :1;
		unsigned char wiper_slow:1;
		unsigned char height_show:1;
		unsigned char trumpet_switch:1;
		unsigned char ac_switch:1;
		unsigned char wiper_quick:1;
		unsigned char front_trun_right_light:1;
		unsigned char front_trun_left_light:1;

		unsigned char :1;
		unsigned char mid_door_on:1;
		unsigned char mid_door_off:1;
		unsigned char tv_power:1;
		unsigned char wc_occupied:1;
		unsigned char mid_step:1;
		unsigned char right_luggage_compartment_light:1;
		unsigned char left_luggage_compartment_light:1;

		unsigned char luggage_shelf_light:1;
		unsigned char top_blue_light:1;
		unsigned char turn_right_light:1;
		unsigned char turn_left_light:1;
		unsigned char drive_top_light:1;
	    unsigned char top_double_light:1;
    	unsigned char top_single_light:1;
		unsigned char read_light :1;

		unsigned char :2;
		unsigned char wc_force_pollution_discharge:1;
		unsigned char relay:1;
		unsigned char :1;
	    unsigned char back_light:1;
    	unsigned char break_light:1;
		unsigned char rear_fog_light :1;


		unsigned char :2;
		unsigned char relay_power:1;
	    unsigned char wc_light:1;
    	unsigned char :3;
		unsigned char rear_compartment_door_inductive_switch :1;
	}main_can_module_send_data;


typedef struct srceen_send2_can{
    unsigned char :8;

	unsigned char :8;

	unsigned char :2 ;
	unsigned char front_door_off :1;
	unsigned char front_door_on :1;
	unsigned char:1 ;
	unsigned char front_fog_light :1;
    unsigned char:0 ;

	unsigned char:3;
	unsigned char  trumpet_switch :1;
	unsigned char  ac_switch :1;
	unsigned char :0 ;

	unsigned char :1 ;
    unsigned char mid_door_on:1;
    unsigned char mid_door_off:1;
    unsigned char tv_power:1;
    unsigned char :3;
    unsigned char luggage_compartment_light:1;

    unsigned char luggage_shelf_light:1;
    unsigned char top_blue_light:1;
    unsigned char :3;
	unsigned char top_double_light:1;
	unsigned char top_single_light:1;
    unsigned char read_light :1;

    unsigned char  rear_fog_light:1;
	unsigned char : 0;

    unsigned char :8 ;


}srceen_send2_can_data;


typedef struct screen_send2ac{
   unsigned char :8;
   unsigned char :8;
   unsigned char :8;
   unsigned char wind_speed_position;
   unsigned char temperature;
   unsigned char ac_wind_mode:4;
   unsigned char ac__mode:4;
   unsigned char ac_power ;
   unsigned char ac_switch ;

}screen_send2ac_data;




