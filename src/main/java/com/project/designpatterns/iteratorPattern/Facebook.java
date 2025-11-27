package com.project.designpatterns.iteratorPattern;

import java.util.List;

public class Facebook extends SocialNetwork {
	private final Long myId;
	
	public Facebook (Long myId) {
		this.myId = myId;
	}
	@Override
	public NetworkIterator getFriendsIterator() {
		
		return new FriendlyNetworkIterator(myId);
	}

	@Override
	public NetworkIterator getCoworkerIterator() {
		return new CoworkerNetworkIterator(myId);
	}
	
	public static List<Profile> getAllProfiles() {
		return List.of(
				new Profile(10000L, "Sudarshan", List.of(10002L, 10003L, 10001L)), 
				new Profile(10001L, "Zebei", List.of(10000L)),
				new Profile(10002L, "Jack", List.of(10000L, 10006L, 10003L)),
				new Profile(10003L, "Nikki", List.of(10000L, 10002L, 10005L)),
				new Profile(10004L, "John", List.of()),
				new Profile(10005L, "Clinton", List.of(10006L, 10003L)),
				new Profile(10006L, "Nikole", List.of(10002L, 10005L)));
	}
	
}
