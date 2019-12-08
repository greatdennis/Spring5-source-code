package zcf.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zcf13543354971@163.com
 * @version 1.0
 * @date 2019/9/24
 */
@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/run")
	public void run(){
		System.out.println("run....");
	}

}
