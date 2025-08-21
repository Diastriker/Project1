package com.board.paging.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardPagingController {
	// 
	@RequestMapping("VacationReq")
	public String vacation() {

		return "reqvacation";
	}
}




