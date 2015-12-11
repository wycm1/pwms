package com.pwms.service;

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

}
