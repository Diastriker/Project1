package com.board.empreq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpReqController {
	// 
	@RequestMapping("VacationReq")
	public String vacation() {

		return "employee/reqvacation";
	}
}




