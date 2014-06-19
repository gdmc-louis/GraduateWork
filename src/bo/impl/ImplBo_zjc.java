package bo.impl;

import dao.IDao_zjc;
import model.lhb.PatMasterIndex;
import bo.IBo_zjc;

public class ImplBo_zjc implements IBo_zjc{

	private IDao_zjc dao ;
	
	public IDao_zjc getDao() {
		return dao;
	}

	public void setDao(IDao_zjc dao) {
		this.dao = dao;
	}


	@Override
	public String verify(String userName, String passWord) {
		String patName = dao.verify(userName, passWord);
		return patName;
	}

	@Override
	public String addRegister(PatMasterIndex patMasterIndex) {
		System.out.println("maxPatientId : "+dao.getMaxPatientId());
		patMasterIndex.setPatientId(dao.getMaxPatientId());
		if(dao.savePatientInfo(patMasterIndex)){
			return "注册成功！";
		}else{
			return "注册失败！";
		}
	}
}