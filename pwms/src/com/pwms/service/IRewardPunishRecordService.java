package com.pwms.service;
//���͵Ǽ�
import java.io.File;
import java.util.List;

import com.pwms.pojo.RewardPunishRecord;

public interface IRewardPunishRecordService {
	//�õ����н��Ͷ���
	public List<RewardPunishRecord> findAll();
	//�õ����Ͷ���
	public RewardPunishRecord getRewardPunishRecord(int id);
	//�޸Ľ��Ͷ���
	public void update(RewardPunishRecord rewardPunish);
	//�������
	public void save(RewardPunishRecord rewardPunish);
	//excel�ĵ�����
	public File exportXls(RewardPunishRecord rewardPunish);
}
