package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list=List.of(
			new Contact(1L,"ashish@gmail.com","Ashish",131L),
			new Contact(1L,"bw@gmail.com","Bruce",121L),
			new Contact(1L,"kim@gmail.com","Kimiko",141L),
			new Contact(1L,"hl20@gmail.com","Homelander",151L),
			new Contact(1L,"ashley@gmail.com","Ashley",121L)
			);

	@Override
	public List<Contact> getContactsofUser(long userId) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(contact->contact.getUserId()==userId).collect(Collectors.toList());
	}
	
	
}
