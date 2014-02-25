package com.mark.bus.core.network;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.HttpHeaderParser;

public class HDStringRequest extends HDRequest<JSONObject> {

	private final Listener<JSONObject> mListener;
	private final Map<String, String> params;

	public HDStringRequest(Context context, int method, String url, RequestParameterSource source,
			Listener<JSONObject> listener, ErrorListener errorListener) {
		super(context, method, url, errorListener);
		mListener = listener;
		params = new HashMap<String, String>(source.getParams());

	}

	public HDStringRequest(Context context, int method, String url, Listener<JSONObject> listener,
			ErrorListener errorListener) {
		super(context, method, url, errorListener);
		mListener = listener;
		params = new HashMap<String, String>();
	}

	@Override
	protected Response<JSONObject> parseResponse(NetworkResponse response) {
		try {
			String jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
			JSONObject responseJson = new JSONObject(jsonString);
			return Response.success(responseJson, HttpHeaderParser.parseCacheHeaders(response));
		} catch (UnsupportedEncodingException e) {
			return Response.error(new ParseError(e));
		} catch (JSONException je) {
			return Response.error(new ParseError(je));
		}
	}

	@Override
	protected Map<String, String> getParams() throws AuthFailureError {
		return params;
	}

	@Override
	protected void deliverResponse(JSONObject response) {
		mListener.onResponse(response);
	}

}
