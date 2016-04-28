package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.UserinfoModify;

public interface UserinfoModifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserinfoModify record);

    int insertSelective(UserinfoModify record);

    UserinfoModify selectByPrimaryKey(Integer id);
    UserinfoModify selectByUserid(Integer id);
    /**
     * ���ݱ�־��ѯ�Լ�֧�����޸ĸ�����Ϣ�ļ�¼
     * @param auditing_flag 0:δ��� 1��ͨ����� 2�� δͨ�����
     * @param userid
     * @return
     */
    List<UserinfoModify> selectByLeaderFLag(Integer auditing_flag, Integer userid);
    /**
     * ��ȡ���е�ĳ����־���û���Ϣ�޸ļ�¼
     * @param auditing_flag
     * @return
     */
    List<UserinfoModify> selectByFlag(Integer auditing_flag);

    int updateByPrimaryKeySelective(UserinfoModify record);

    int updateByPrimaryKey(UserinfoModify record);
    
}