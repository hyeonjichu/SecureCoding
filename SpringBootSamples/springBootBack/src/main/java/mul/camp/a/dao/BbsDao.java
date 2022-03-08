package mul.camp.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

@Mapper
@Repository
public interface BbsDao {

	public List<BbsDto> getBbsList();
	
	public int bbsWrite(BbsDto dto);
	
	public BbsDto bbsdetail(int seq);
	
	public List<BbsDto> getBbsListSearch(BbsParam param);
	
	public List<BbsDto> getBbsListSearchPage(BbsParam param);

	public int getBbsCount(BbsParam param);
	
	public void readcount(int seq);
	
	public int bbsReply(BbsDto seq);

	public int bbsReplyUpdate(BbsDto seq);
	
	public int bbsDel(int seq);
	
	public int bbsUpdate(BbsDto dto);
}
