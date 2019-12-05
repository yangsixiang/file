package com.ysx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ysx.pojo.File;
import com.ysx.pojo.QueryModel;
import com.ysx.service.FileService;

@Controller
public class FileController {

	@Resource
	private FileService service;
	
	@RequestMapping("query")
	public String query(Model model,@RequestParam(defaultValue="1")Integer pageNum){
		PageHelper.startPage(pageNum,3);
		Map<String, Object> map = new HashMap<String, Object>();
		List<File> list = service.query(map);
		PageInfo<File> page = new PageInfo<File>(list);
		model.addAttribute("page", page);
		return "query";
	}
	
}
