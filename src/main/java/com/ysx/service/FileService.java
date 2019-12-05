package com.ysx.service;

import java.util.List;
import java.util.Map;

import com.ysx.pojo.File;

public interface FileService {

	List<File> query(Map<String, Object> map);
	
}
