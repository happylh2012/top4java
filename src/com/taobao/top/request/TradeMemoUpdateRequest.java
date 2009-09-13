package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trade.memo.update
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class TradeMemoUpdateRequest implements TopRequest {

	/** 交易编号 */
	private String tid;

	/** 交易备注 */
	private String memo;

	public void setTid(String tid) {
		this.tid = tid;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getApiName() {
		return "taobao.trade.memo.update";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("memo", this.memo);
		params.put("tid", this.tid);

		return params;
	}

}
