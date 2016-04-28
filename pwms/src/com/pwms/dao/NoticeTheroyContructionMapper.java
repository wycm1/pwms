package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.NoticeTheroyContruction;

public interface NoticeTheroyContructionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoticeTheroyContruction record);

    int insertSelective(NoticeTheroyContruction record);

    NoticeTheroyContruction selectByPrimaryKey(Integer id);
    /**
     * �������Ͳ������£�����ʱ�併������
     * @param type
     * @return
     */
    List<NoticeTheroyContruction> selectByType(Integer type);
    
    /**
     * ������������id
     * ��ȡ�����������µ�5ƪ����
     * @param value
     * @return
     */
    List<NoticeTheroyContruction> selectTopArticleByAtid(Integer [] atId);
    /**
     * ��ȡ���µĵ�У��������Ÿ�10ƪ
     * @return
     */
    List<NoticeTheroyContruction> selectTopXWAndDXGG();
    
    
    List<NoticeTheroyContruction> selectAll();

    int updateByPrimaryKeySelective(NoticeTheroyContruction record);

    int updateByPrimaryKeyWithBLOBs(NoticeTheroyContruction record);

    int updateByPrimaryKey(NoticeTheroyContruction record);
    
}