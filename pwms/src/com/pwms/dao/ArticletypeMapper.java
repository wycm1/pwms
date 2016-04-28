package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.Articletype;
import com.pwms.pojo.NoticeTheroyContruction;

public interface ArticletypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Articletype record);

    int insertSelective(Articletype record);
    /**
     * ͨ��id��ѯ�����������ع�������
     * @param id 
     * @return
     */
    Articletype selectByPrimaryKey(Integer id);

    Articletype selectByPrimaryKey1(Integer id);
    
    Articletype selectByPrimaryKey2(Integer id);

    int updateByPrimaryKeySelective(Articletype record);

    int updateByPrimaryKey(Articletype record);
    /**
     * ͨ��pid����Articletype
     * @param pid
     * @return Articletype�б�
     */
    List<Articletype> selectByPid(Integer pid);
    /**
     * ��ȡ���� chlidrenarticletype
     * @return chlidrenarticletype�б�
     */
    List<Articletype> selectAllChildrenType();
    /**
     * ͨ��linkname����articletype�����һ�ȡ����
     * @param linkname ������
     * @return
     */
    Articletype selectByLinkname(String linkname);
    
//    Articletype selectByLinkname1(String linkname);
    
}