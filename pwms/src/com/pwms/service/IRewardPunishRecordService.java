package com.pwms.service;
//奖惩登记
import java.io.File;

import com.pwms.pojo.RewardPunishRecord;

public interface IRewardPunishRecordService {
	//得到奖惩对象
	public RewardPunishRecord getRewardPunishRecord(int id);
	//修改奖惩对象
	public void update(RewardPunishRecord rewardPunish);
	//保存对象
	public void save(RewardPunishRecord rewardPunish);
	//excel文档导出
	public File exportXls(RewardPunishRecord rewardPunish);
}
