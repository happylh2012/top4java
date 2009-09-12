package com.taobao.top.request;

import java.util.Map;

/**
 * TOP上传请求接口，支持同时上传多个文件。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface TopUploadRequest extends TopRequest {

	/**
	 * 获取所有的Key-Value形式的文件字节数组请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数字节数组</li>
	 * </ul>
	 * 
	 * @return 文件请求参数集合
	 */
	public Map<String, byte[]> getByteParams();

}