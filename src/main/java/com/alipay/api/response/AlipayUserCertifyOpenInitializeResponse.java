package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.open.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-21 10:47:32
 */
public class AlipayUserCertifyOpenInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5483177373684479754L;

	/** 
	 * 本次申请操作的唯一标识，商户需要记录，后续的操作都需要用到
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
