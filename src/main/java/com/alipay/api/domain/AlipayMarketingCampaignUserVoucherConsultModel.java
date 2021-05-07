package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户券领取咨询
 *
 * @author auto create
 * @since 1.0, 2021-01-08 22:34:57
 */
public class AlipayMarketingCampaignUserVoucherConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8194358522612135477L;

	/**
	 * 活动id列表
	 */
	@ApiListField("activity_id_list")
	@ApiField("string")
	private List<String> activityIdList;

	/**
	 * 场景码：默认(DEFAULT)
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	public List<String> getActivityIdList() {
		return this.activityIdList;
	}
	public void setActivityIdList(List<String> activityIdList) {
		this.activityIdList = activityIdList;
	}

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

}
