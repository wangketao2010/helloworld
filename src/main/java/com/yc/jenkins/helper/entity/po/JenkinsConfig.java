package com.yc.jenkins.helper.entity.po;

public class JenkinsConfig {
    private Integer id;

    private String jarName;

    private String env;

    private String eecuteCmd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJarName() {
        return jarName;
    }

    public void setJarName(String jarName) {
        this.jarName = jarName == null ? null : jarName.trim();
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    public String getEecuteCmd() {
        return eecuteCmd;
    }

    public void setEecuteCmd(String eecuteCmd) {
        this.eecuteCmd = eecuteCmd == null ? null : eecuteCmd.trim();
    }
}