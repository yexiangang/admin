package io.renren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统页面视图
 * 
 */
@Controller
public class PageController {
	
	@RequestMapping("{module}/{url}.html")
	public String page(@PathVariable("module") String module, @PathVariable("url") String url){
		return module + "/" + url + ".html";
	}

}
