package com.profesorpt.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.profesorpt.springbatch.model.User;
import com.profesorpt.springbatch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User>{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> items) throws Exception {
		System.out.println("Datos guardados para usuario: "+items);
		userRepository.saveAll(items);
	}

}
