
package org.spring.springboot.dangdang.ddframe.job.example.job.dataflow;

import java.util.List;

import org.spring.springboot.dangdang.ddframe.job.example.fixture.entity.Foo;
import org.spring.springboot.dangdang.ddframe.job.example.fixture.repository.FooMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

public class SpringDataflowJob implements DataflowJob<Foo> {

	@Autowired
	private FooMapper mapper;

	@Override
	public List<Foo> fetchData(final ShardingContext shardingContext) {
		System.out.println(String.format("count %s, index %s ", shardingContext.getShardingTotalCount(), shardingContext.getShardingItem()));
		List<Foo> list =  mapper.queryList(shardingContext.getShardingTotalCount(), shardingContext.getShardingItem());
		
		for (Foo foo : list) {
			System.out.println("*****" + foo.toString());
		}
		return list;
	}

	@Override
	public void processData(final ShardingContext shardingContext, final List<Foo> data) {
		for (Foo foo : data) {
			
			this.mapper.updateStatus(foo.getId(), MixUtils.getServerInfo().getHostName());
		}
	}
}
