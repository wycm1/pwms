package com.pwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.pwms.dao.NoticeTheroyContructionMapper;
import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

public class NoticeServiceImpl implements INoticeService {
	@Resource
	private NoticeTheroyContructionMapper noticeTheroyDao;
	public NoticeTheroyContructionMapper getNoticeTheroyDao() {
		return noticeTheroyDao;
	}

	public void setNoticeTheroyDao(NoticeTheroyContructionMapper noticeTheroyDao) {
		this.noticeTheroyDao = noticeTheroyDao;
	}

	@Override
	public void save(NoticeTheroyContruction notice) {
		// TODO Auto-generated method stub
		this.noticeTheroyDao.insertSelective(notice);
	}

	@Override
	public NoticeTheroyContruction getNoticeById(Integer id) {
		// TODO Auto-generated method stub
		return this.noticeTheroyDao.selectByPrimaryKey(id);
	}

	@Override
	public List<NoticeTheroyContruction> getNoticeByType(Integer type) {
		// TODO Auto-generated method stub
		return this.noticeTheroyDao.selectByType(type);
	}

	@Override
	public boolean modifyNotice(NoticeTheroyContruction notice) {
		// TODO Auto-generated method stub
		if(notice.getId() != null){
		    this.noticeTheroyDao.updateByPrimaryKeySelective(notice);
		    return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean deleteNotice(NoticeTheroyContruction notice) {
		// TODO Auto-generated method stub
		if(notice.getId()!=null){
		    this.noticeTheroyDao.deleteByPrimaryKey(notice.getId());
		    return true;
		}
		else{
			return false;
		}
	}

}
