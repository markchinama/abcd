package com.mark.bus.core.network;

import java.util.Map;

public interface RequestParameterSource {

	public Map<String, String> getParams();

	public String getParamsAsString();

}
