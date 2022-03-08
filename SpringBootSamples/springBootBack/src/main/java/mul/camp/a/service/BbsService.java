package mul.camp.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import mul.camp.a.dao.BbsDao;
import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

@Service
@Transactional
public class BbsService {
	
	@Autowired
	BbsDao dao;
	
	public List<BbsDto> getBbsList() {
		return dao.getBbsList();
	}
	
	public boolean bbsWrite(BbsDto dto) {
		int n = dao.bbsWrite(dto);
		
		return n>0;
	}
	
	public BbsDto bbsdetail(int seq) {
		
		return dao.bbsdetail(seq);
	}
	
	public List<BbsDto> getBbsListSearch(BbsParam param){
		return dao.getBbsListSearch(param);
	}
	
	public List<BbsDto> getBbsListSearchPage(BbsParam param){
		return dao.getBbsListSearchPage(param);
	}
	
	public int getBbsCount(BbsParam param){
		return dao.getBbsCount(param);
	}
	
	public void readcount(int seq) {
		dao.readcount(seq);
	}
	
	public boolean bbsReply(BbsDto dto) {
		int n = dao.bbsReplyUpdate(dto);
		n = dao.bbsReply(dto);
		return n>0;
	}
	
	public boolean bbsDel(int seq) {
		int n = dao.bbsDel(seq);
		return n>0;
	}
	
	public boolean bbsUpdate(BbsDto dto) {
		int n = dao.bbsUpdate(dto);
		
		return n>0;
	}
}
