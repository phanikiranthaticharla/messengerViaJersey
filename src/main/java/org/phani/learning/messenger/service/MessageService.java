package org.phani.learning.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.phani.learning.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hey there, this is the first message", "Phani"); 
		Message m2 = new Message(1L, "Hey there, this is the second message", "Phani"); 
		List<Message> list = new ArrayList<>(); 
		list.add(m1);
		list.add(m2); 
		return list; 
	}
}
