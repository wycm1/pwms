package com.pwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.pwms.pojo.NoticeTheroyContruction;
import com.pwms.service.INoticeService;

public class NoticeServiceImpl implements INoticeService {
	@Resource
	//private NoticeTheroyContructionMapper noticeTheroyDao;
	@Override
	public void save(NoticeTheroyContruction notice) {
		// TODO Auto-generated method stub

	}

	@Override
	public NoticeTheroyContruction getNoticeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NoticeTheroyContruction> getNoticeByType(Integer type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyNotice(NoticeTheroyContruction notice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteNotice(NoticeTheroyContruction notice) {
		// TODO Auto-generated method stub

	}

}
