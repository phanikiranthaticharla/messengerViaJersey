package org.phani.learning.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.phani.learning.messenger.model.Message;
import org.phani.learning.messenger.model.Profile;

/**
 * 
 * The class is not thread safe. This is just an in memory dummy database  
 * @author Phani Kiran Thaticharla
 * 
 */

public class Database {
	private static Map<Long, Message> messages = new HashMap<>(); 
	private static Map<Long, Profile> profiles = new HashMap<>(); 
	
	public static Map<Long, Message> getMessages() {
		return messages; 
	}
	
	public static Map<Long, Profile> getProfiles() {
		return profiles; 
	}
}
