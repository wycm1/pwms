package com.pwms.service;

import java.util.List;

import com.pwms.pojo.NoticeTheroyContruction;

public interface INoticeService {
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
	 * @param type
	 * @return
	 */
	public List<NoticeTheroyContruction> getNoticeByType(Integer type);
	
	public boolean modifyNotice(NoticeTheroyContruction notice);
	
	public boolean deleteNotice(NoticeTheroyContruction notice);
	
}
