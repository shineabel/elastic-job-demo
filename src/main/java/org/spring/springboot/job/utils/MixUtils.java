package org.spring.springboot.job.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MixUtils {

	public static ServerInfo getServerInfo() {
		InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		String ip = addr.getHostAddress().toString();
		String hostName = addr.getHostName().toString();
		
		return new ServerInfo(ip, hostName);
	}
}
