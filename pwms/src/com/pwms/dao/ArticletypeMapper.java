package com.pwms.dao;

import java.util.List;

import com.pwms.pojo.Articletype;
import com.pwms.pojo.NoticeTheroyContruction;

public interface ArticletypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Articletype record);

    int insertSelective(Articletype record);

    Articletype selectByPrimaryKey(Integer id);

//    Articletype selectByPrimaryKey1(Integer id);

    int updateByPrimaryKeySelective(Articletype record);

    int updateByPrimaryKey(Articletype record);
    
    List<Articletype> selectByPid(Integer pid);
    
    List<Articletype> selectAllChildrenType();
    
    Articletype selectByLinkname(String linkname);
    
//    Articletype selectByLinkname1(String linkname);
    
}