package com.yc.jenkins.helper;

import com.yc.jenkins.helper.entity.po.JenkinsConfig;
import com.yc.jenkins.helper.mapper.JenkinsConfigMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

@SpringBootApplication
@Controller
public class DemoApplication {
    @Resource
    JenkinsConfigMapper jenkinsConfigMapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("=================启动成功=====================");
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        JenkinsConfig brandClueAdvertise = jenkinsConfigMapper.selectByPrimaryKey(1);
        return "hello world  " + new Date();
    }

    //curl -F "file=@log.file"  -F "env=dev" -X POST "http://172.20.45.137:8082/upload"
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("env") String env, @RequestParam("file") MultipartFile file) {
        String jarFileName = file.getOriginalFilename();
        JenkinsConfig jenkinsConfig = jenkinsConfigMapper.selectByJarAndEnv(jarFileName,env);
        uploadFile(jenkinsConfig,file);
        executeShell(jenkinsConfig);
        return "ok";
    }

    private String uploadFile(JenkinsConfig jenkinsConfig,MultipartFile file) {
        String filePath = new File("logs_app").getAbsolutePath();
        File fileUpload = new File(filePath);
        if (!fileUpload.exists()) {
            fileUpload.mkdirs();
        }

        fileUpload = new File(filePath, file.getOriginalFilename());
        if (fileUpload.exists()) {
//			throw new GlobalException("上传的日志文件已存在");
        }

        try {
            file.transferTo(fileUpload);

            return "success";
        } catch (IOException e) {
//			throw new GlobalException("上传日志文件到服务器失败：" + e.toString());
        }
        return "hello world  " + new Date();

    }

    private void executeShell(JenkinsConfig jenkinsConfig) {
        try {
            Runtime runtime = Runtime.getRuntime();
//            runtime.exec()
            String shpath = "/home/felven/word2vec/demo-classes.sh";
            Process ps = runtime.exec(shpath);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String result = sb.toString();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
