// Copyright 2017 www.chinaleaf.net All rights reserved.
package org.spring.springboot.dangdang.ddframe.job.example.job.dataflow;

public class ServerInfo {

	private String ip;
	private String hostName;

	public ServerInfo() {
		super();
	}

	public ServerInfo(String ip, String hostName) {
		super();
		this.ip = ip;
		this.hostName = hostName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

}
