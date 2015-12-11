package com.pwms.dao;

import com.pwms.pojo.RewardPunishRecord;

public interface RewardPunishRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RewardPunishRecord record);

    int insertSelective(RewardPunishRecord record);

    RewardPunishRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RewardPunishRecord record);

    int updateByPrimaryKey(RewardPunishRecord record);
}