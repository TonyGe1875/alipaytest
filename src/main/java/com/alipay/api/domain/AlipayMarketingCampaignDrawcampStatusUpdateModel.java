package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抽奖活动状态变更
 *
 * @author auto create
 * @since 1.0, 2020-08-20 14:01:10
 */
public class AlipayMarketingCampaignDrawcampStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 1286732267856975978L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 修改的活动状态，CAMP_PAUSED  暂停状态, CAMP_ENDED  结束状态, CAMP_GOING启动状态，只支持以上3种状态变更。结束状态的活动不允许在修改活动状态。
	 */
	@ApiField("camp_status")
	private String campStatus;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampStatus() {
		return this.campStatus;
	}
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

}
