package mul.camp.a.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;

@RestController	// @Controller + @ResponsBody -> Restful
public class HelloController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/base", method = RequestMethod.GET)
	public String base() {
		System.out.println("HelloController base()");
		return "base";
	}
	
	@RequestMapping(value = "/connParamGet")
	public String connParamGet(String title) {
		System.out.println("HelloController connParamGet()");
		System.out.println("title:" + title);
		
		return "통신성공: "+title;
	}
	
	@RequestMapping(value = "/getMember", method = RequestMethod.POST)
	public MemberDto getMember(@RequestBody MemberDto mem) {	//@RequestBody추가해야 함, restful 할때
		System.out.println("HelloController getMember()" + new Date());
		System.out.println(mem.toString());
		
		MemberDto dto = new MemberDto("abc", "123", "AAA", "aa@naver.com", 1);
		return dto;
	}
	
	@RequestMapping(value = "/getMemberList")
	public List<MemberDto> getMemberList(MemberDto dto){
		System.out.println("HelloController getMemberList()");
		System.out.println(dto.toString());
		
		List<MemberDto> list = new ArrayList<MemberDto>();
		list.add(dto);
		list.add(new MemberDto("abc", "123", "AAA", "aa@naver.com", 1));
		list.add(new MemberDto("ddd", "456", "BBB", "bb@naver.com", 2));
		list.add(new MemberDto("ggg", "678", "CCC", "cc@naver.com", 3));
		
		return list;
	}
	
	@RequestMapping(value = "/allMember")
	public List<MemberDto> allMember(){
		System.out.println("HelloController allMember()");
		
		List<MemberDto> list = service.allMember();
		
		return list;
	}
}
