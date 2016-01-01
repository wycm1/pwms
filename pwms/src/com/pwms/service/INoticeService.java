package com.pwms.service;

import java.util.List;

import com.pwms.pojo.NoticeTheroyContruction;

public interface INoticeService {
	final static int NOTICE_TYPE = 1;
	final static int THEORY_TYPE = 2;
	final static int PARTY_TYPE = 4;
	/**
	 * 保存对象
	 * @param notice
	 */
	public void save(NoticeTheroyContruction notice);
	/**
	 * 通过id来获取对象
	 * @param id
	 * @return
	 */
	public NoticeTheroyContruction getNoticeById(Integer id);
	/**
	 * 通过类型来查找对象
	 * @param type 1:通知公告  2：理论  4：党建专项  （1，2，4方便做位运算）
	 * @return
	 */
	public List<NoticeTheroyContruction> getNoticeByType(Integer type);
	
	public boolean modifyNotice(NoticeTheroyContruction notice);
	
	public boolean deleteNotice(NoticeTheroyContruction notice);
	
}
