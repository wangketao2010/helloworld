package com.yc.jenkins.helper;

import com.yc.jenkins.helper.entity.po.BrandClueAdvertise;
import com.yc.jenkins.helper.mapper.BrandClueAdvertiseMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootApplication
@Controller
public class DemoApplication {
	@Resource
	BrandClueAdvertiseMapper brandClueAdvertiseMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("=================启动成功=====================");
	}

	@RequestMapping("/")
	@ResponseBody
	public String index(){
		BrandClueAdvertise brandClueAdvertise =brandClueAdvertiseMapper.selectByPrimaryKey(1L);
		return "hello world  " + new Date();
	}
}
