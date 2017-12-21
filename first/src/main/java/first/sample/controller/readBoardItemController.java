package first.sample.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import first.sample.service.ReadBoardItemService;

@Controller
public class readBoardItemController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="readBoardItemService")
	private ReadBoardItemService readBoardItemService;

	@RequestMapping(value="/sample/readBoardItemView.do")
	public ModelAndView readBoardItem(@RequestParam(value="IDX") String IDX, Map<String,Object> commandMap){
		ModelAndView mv = new ModelAndView("/sample/readBoardItem");

		Map<String,Object> contents = readBoardItemService.selectContents(IDX, commandMap);
		mv.addObject("contents", contents);
		return mv;
	}
}