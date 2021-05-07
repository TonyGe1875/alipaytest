package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.ereceipt.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-06 14:11:28
 */
public class AlipayDataBillEreceiptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2696354762232659712L;

	/** 
	 * 下载链接。status 为 SUCCESS时返回。用户可以使用此http链接下载文件内容。有效时间为 20s。 
生成的文件是zip格式。需要解压后获取电子回单pdf内容。
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 如果生成失败，则会返回失败原因
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 处理状态。枚举值如下：
INIT：初始化。
PROCESS：处理中。
SUCCESS：成功。
FAIL：失败。
	 */
	@ApiField("status")
	private String status;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
