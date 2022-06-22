package com.allied.spring.web.paging;

import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.IdGenerator;

public class IDGenerator {

	private static final Logger LOGGER = LoggerFactory.getLogger(IdGenerator.class);

	public static long generateRandom() 
	{
		LOGGER.info("com.grc.utilities.IdGenerator-generateRandom --> Start");
		SecureRandom sr = new SecureRandom();
		String result = (sr.nextInt(9)+1) +"";
		for(int i=0; i<10; i++)
		{ 
			result += sr.nextInt(9);
		}
		result += (sr.nextInt(9)+1);
		long num=Long.parseLong(result);
		LOGGER.info("com.grc.utilities.IdGenerator-generateRandom --> num  -->" + num);
		LOGGER.info("com.grc.utilities.IdGenerator-generateRandom --> End");
		return num;
	}
}

