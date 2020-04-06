package org.phani.learning.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.phani.learning.messenger.model.Message;
import org.phani.learning.messenger.database.Database;

public class MessageService {

	private Map<Long, Message> messages = Database.getMessages(); 
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hey there, this is the first message", "Phani"));
		messages.put(2L, new Message(2, "Hey there, this is the second message", "Phani"));
		
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	/* public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hey there, this is the first message", "Phani"); 
		Message m2 = new Message(1L, "Hey there, this is the second message", "Phani"); 
		List<Message> list = new ArrayList<>(); 
		list.add(m1);
		list.add(m2); 
		return list; 
	} */
	
	public Message getMessage(long id) {
		return messages.get(id); 
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		message.setCreated(new Date());
		messages.put(message.getId(), message); 
		return message; 
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null; 
		}
		messages.put(message.getId(), message);
		return message; 
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
