package com.ysx.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ysx.mapper.FileMapper;
import com.ysx.pojo.File;
@Service
public class FileServiceImpl implements FileService {

	@Resource
	private FileMapper mapper;
	
	public List<File> query(Map<String,Object> map) {
		return mapper.query(map);
	}

}
