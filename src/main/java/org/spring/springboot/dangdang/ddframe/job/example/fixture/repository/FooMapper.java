package org.spring.springboot.dangdang.ddframe.job.example.fixture.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.spring.springboot.dangdang.ddframe.job.example.fixture.entity.Foo;


@Mapper
public interface FooMapper {

    @Select("SELECT * FROM foo where status = 10 and mod(id, #{shardcount}) = #{item} limit 0, 1")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "location", column = "location"),
            @Result(property = "status", column = "status"),
            @Result(property = "hostname", column = "hostname")
    })
    List<Foo> queryList(@Param("shardcount") int shardcount, @Param("item") int item);

    
    @Update("update foo set status = 20, hostname = #{hostname} where id = #{id}")
	void updateStatus(@Param("id") long id, @Param("hostname") String hostname);
}
