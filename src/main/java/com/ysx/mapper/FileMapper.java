package com.ysx.mapper;

import java.util.List;
import java.util.Map;

import com.ysx.pojo.File;

public interface FileMapper {

	List<File> query(Map<String, Object> map);
	
}
