package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 准入任务检测结果查询
 *
 * @author auto create
 * @since 1.0, 2020-07-30 15:08:57
 */
public class AlipayEbppDetectReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2837211712467671142L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务唯一id. 如迭代id
	 */
	@ApiField("biz_unique_id")
	private String bizUniqueId;

	/**
	 * 外部业务标识.如pipeline id、蚂蚁流id等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizUniqueId() {
		return this.bizUniqueId;
	}
	public void setBizUniqueId(String bizUniqueId) {
		this.bizUniqueId = bizUniqueId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
