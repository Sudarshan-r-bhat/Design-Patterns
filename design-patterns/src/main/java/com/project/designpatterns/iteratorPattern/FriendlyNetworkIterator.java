package com.project.designpatterns.iteratorPattern;

import java.util.List;
import java.util.stream.Collectors;

public class FriendlyNetworkIterator implements NetworkIterator {
	private final List<Profile> profiles;
	private Long myId;
	private int current = 0;
	
	public FriendlyNetworkIterator(Long myId) {
		this.myId = myId;
		profiles = Facebook.getAllProfiles().stream()
				.filter(p -> p.getFriendsProfileIds().contains(myId)).collect(Collectors.toList());
	}
	
	@Override
	public boolean hasNext() {
		return current < profiles.size();
	}

	@Override
	public Profile next() {
		return hasNext() ? profiles.get(current++): null;
	}

}
