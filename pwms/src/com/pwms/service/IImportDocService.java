package com.pwms.service;

import java.util.List;

import com.pwms.pojo.ImportDoc;

public interface IImportDocService {
	//保存对象
	public void save(ImportDoc doc);
	//更新对象
	public void updateById(ImportDoc doc);
	//删除对象 
	public void deleteById(ImportDoc doc);
	//获取对象
	public ImportDoc getImportDocById(Integer id);
	/**
	 * 获取列表 按时间排序
	 * @param id
	 * @return
	 */
	public List<ImportDoc> getImportDocList();

}
