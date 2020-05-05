package com.mindtree.candyshop.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//conflict
//rise
@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
