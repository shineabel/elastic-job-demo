
package org.spring.springboot.dangdang.ddframe.job.example.fixture.entity;

import java.io.Serializable;

public  class Foo implements Serializable {

	private static final long serialVersionUID = 2706842871078949451L;

	private  int id;

	private  String location;

	private int status;
	private int flShard;
	private String hostname;

	public Foo() {
	}

	public Foo(int id, String location, int status, String hostname, int flShard) {
		super();
		this.id = id;
		this.location = location;
		this.status = status;
		this.flShard = flShard;
		this.hostname = hostname;
	}

	public long getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(final int status) {
		this.status = status;
	}

	public int getFlShard() {
		return flShard;
	}

	public void setFlShard(int flShard) {
		this.flShard = flShard;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Override
	public String toString() {
		return "Foo [id=" + id + ", location=" + location + ", status=" + status + ", flShard=" + flShard
				+ ", hostname=" + hostname + "]";
	}

}
