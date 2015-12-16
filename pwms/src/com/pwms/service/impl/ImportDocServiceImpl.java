package com.pwms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pwms.dao.ImportDocMapper;
import com.pwms.pojo.ImportDoc;
import com.pwms.service.IImportDocService;

@Service("importDocService")
public class ImportDocServiceImpl implements IImportDocService {

	@Resource
	private ImportDocMapper importDocDao;
	public ImportDocMapper getImportDocDao() {
		return importDocDao;
	}

	public void setImportDocDao(ImportDocMapper importDocDao) {
		this.importDocDao = importDocDao;
	}

	@Override
	public void save(ImportDoc doc) {
		// TODO Auto-generated method stub
		this.importDocDao.insertSelective(doc);
	}

	@Override
	public void updateById(ImportDoc doc) {
		// TODO Auto-generated method stub
		this.importDocDao.updateByPrimaryKeySelective(doc);
	}

	@Override
	public void deleteById(ImportDoc doc) {
		// TODO Auto-generated method stub
		this.importDocDao.deleteByPrimaryKey(doc.getId());
	}

	@Override
	public ImportDoc getImportDocById(Integer id) {
		// TODO Auto-generated method stub
		return this.importDocDao.selectByPrimaryKey(id);
	}

	@Override
	public List<ImportDoc> getImportDocList() {
		// TODO Auto-generated method stub
		return this.importDocDao.selectAll();
	}

}
