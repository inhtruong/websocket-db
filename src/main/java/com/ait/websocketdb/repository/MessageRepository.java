package com.ait.websocketdb.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ait.websocketdb.entity.Message;

@Repository
public interface MessageRepository extends  JpaRepository<Message, Long>{

	@Query (nativeQuery = true, value = "SELECT \r\n"
			+ "FROM LOGS \r\n"
			+ "WHERE CHECK_IN BETWEEN \r\n"
			+ "    CONVERT(datetime,'2013-10-17') \r\n"
			+ "    AND CONVERT(datetime,'2013-10-18 23:59:59:998')")
	Iterable<Message> findMessageInTime(Date offTime, Date onTime);
	
}
