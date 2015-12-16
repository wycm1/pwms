package com.pwms.service;

import java.util.List;

import com.pwms.pojo.NoticeTheroyContruction;

public interface INoticeService {
	/**
	 * �������
	 * @param notice
	 */
	public void save(NoticeTheroyContruction notice);
	/**
	 * ͨ��id����ȡ����
	 * @param id
	 * @return
	 */
	public NoticeTheroyContruction getNoticeById(Integer id);
	/**
	 * ͨ�����������Ҷ���
	 * @param type
	 * @return
	 */
	public List<NoticeTheroyContruction> getNoticeByType(Integer type);
	
	public boolean modifyNotice(NoticeTheroyContruction notice);
	
	public boolean deleteNotice(NoticeTheroyContruction notice);
	
}
