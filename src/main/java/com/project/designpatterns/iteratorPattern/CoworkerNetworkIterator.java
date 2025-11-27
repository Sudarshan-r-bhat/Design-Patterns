package com.project.designpatterns.iteratorPattern;

import java.util.List;
import java.util.stream.Collectors;

public class CoworkerNetworkIterator implements NetworkIterator {
	private final List<Profile> profiles;
	private Long myId;
	private int current = 0;
	// Asssuming all those who are not friends are co-workers.
	public CoworkerNetworkIterator(Long myId) {
		this.myId = myId;
		profiles = Facebook.getAllProfiles().stream()
				.filter(p -> !p.getFriendsProfileIds().contains(myId)).collect(Collectors.toList());
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
