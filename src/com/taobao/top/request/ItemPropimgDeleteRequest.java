package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.item.propimg.delete
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ItemPropimgDeleteRequest implements TopRequest {

	private Long id;
	private String iid;
	private Long numIid;

	public void setId(Long id) {
		this.id = id;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getApiName() {
		return "taobao.item.propimg.delete";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("id", this.id);
		params.put("iid", this.iid);
		params.put("num_iid", this.numIid);
		return params;
	}

}
