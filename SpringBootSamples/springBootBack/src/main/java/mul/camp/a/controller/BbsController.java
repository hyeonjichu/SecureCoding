package mul.camp.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;
import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.BbsService;

@RestController
public class BbsController {

	@Autowired
	BbsService service;
	
	@RequestMapping(value="/getBbsList", method = { RequestMethod.GET, RequestMethod.POST })
	public List<BbsDto> getBbsList(){
		System.out.println("BbsController getBbsList" + new Date());
		
		List<BbsDto> list = service.getBbsList();
		return list;
	}
	
	@RequestMapping(value = "/bbsWrite", method = {RequestMethod.GET, RequestMethod.POST} )
	public String bbsWrite(@RequestBody BbsDto dto) {
		System.out.println("MemberController bbsWrite");
		System.out.println(dto.toString());
		
		boolean b = service.bbsWrite(dto);
		if(b) {
			return "YES";
		}
		return "NO";
	}
	
	@RequestMapping(value = "/bbsdetail", method = {RequestMethod.GET, RequestMethod.POST} )
	public BbsDto bbsdetail(int seq) {
		System.out.println("MemberController bbsdetail");
		service.readcount(seq);
		return service.bbsdetail(seq);
	}
	
	@RequestMapping(value = "/getBbsListSearch", method = {RequestMethod.GET, RequestMethod.POST} )
	public List<BbsDto> getBbsListSearch(BbsParam param) {
		System.out.println("MemberController getBbsListSearch");
		
		return service.getBbsListSearch(param);
	}
	
	@RequestMapping(value = "/getBbsListSearchPage", method = {RequestMethod.GET, RequestMethod.POST} )
	public List<BbsDto> getBbsListSearchPage(BbsParam param) {
		System.out.println("MemberController getBbsListSearchPage" + new Date());
		
		//페이지  설정
		int sn = param.getPage();	// 0 1 2 3 ~
		int start = sn * 10 + 1;	// 1	11
		int end = (sn + 1) * 10;	// 10	20
		
		param.setStart(start);
		param.setEnd(end);
		
		return service.getBbsListSearchPage(param);
	}
	
	@RequestMapping(value = "/getBbsCount", method = {RequestMethod.GET, RequestMethod.POST} )
	public int getBbsCount(BbsParam param) {
		System.out.println("MemberController getBbsCount" + new Date());
		
		return service.getBbsCount(param);
	}
	
	@RequestMapping(value = "/bbsReply", method = {RequestMethod.GET, RequestMethod.POST} )
	public String bbsReply(BbsDto dto) {
		System.out.println("MemberController bbsReply");
		System.out.println(dto.toString());
		
		boolean b = service.bbsReply(dto);
		if(b) {
			return "YES";
		}
		return "NO";
	}
	
	@RequestMapping(value = "/bbsDel", method = {RequestMethod.GET, RequestMethod.POST} )
	public String bbsDel(int seq) {
		System.out.println("MemberController bbsDel "+new Date());
		
		boolean b = service.bbsDel(seq);
		if(b) {
			return "YES";
		}
		return "NO";
	}
	
	@RequestMapping(value = "/bbsUpdate", method = {RequestMethod.GET, RequestMethod.POST} )
	public String bbsUpdate(@RequestBody BbsDto dto) {
		System.out.println("MemberController bbsUpdate "+new Date());
		System.out.println(dto.toString());
		
		boolean b = service.bbsUpdate(dto);
		System.out.println(b);
		if(b) {
			return "YES";
		}
		return "NO";
	}
}
