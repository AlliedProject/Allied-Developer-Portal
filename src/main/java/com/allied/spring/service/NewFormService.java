package com.allied.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.IdGenerator;

import com.allied.spring.domain.NewFormAPIDto;
import com.allied.spring.domain.NewFormRepository;
import com.allied.spring.web.paging.IDGenerator;

@Service
public class NewFormService {

	@Autowired
	NewFormRepository newFromRepo;
	
	@Autowired
	IDGenerator idgen;

	public String insertAdminData() {
		NewFormAPIDto newFormAPIDto = new NewFormAPIDto();
		newFormAPIDto.setId(idgen);
		newFormAPIDto.setNameOfApi("Security");
		newFormAPIDto.setApiDescription("security of apis");
		newFormAPIDto.setInputParametersName("test");
		newFormAPIDto.setInputParametersType("test");
		newFormAPIDto.setInputParametersDescription("test");	
		newFormAPIDto.setInputParametersMandatory("test");
		System.out.println("checkpoint 1");
		newFormAPIDto.setOutputParametersName("test");
		newFormAPIDto.setOutputParametersType("test");
		newFormAPIDto.setOutputParametersDescription("test");
		newFormAPIDto.setPossibleErrorsErrorCode("test");
		newFormAPIDto.setPossibleErrorsErrorName("test");
		newFormAPIDto.setPossibleErrorsErrorLogs("test");
		newFormAPIDto.setSamplePacketRequest("{'test':'test'}");
		newFormAPIDto.setRequestJson("{'test':'test'}");
		newFormAPIDto.setResponseJson("{'test':'test'}");

		newFromRepo.save(newFormAPIDto);
		
		System.out.println("checkpoint 2");
		System.out.println(newFormAPIDto);
		return null;

	}
	
	
	public String fetchApiData() {
		
		
		return null;
		
	}
}
