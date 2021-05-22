package com.project.designpatterns.iteratorPattern;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Profile {
	private String name;
	private Long profileId;
	private Set<Long> friendsProfileIds;
	
	public Profile(Long pid, String name, List<Long> ids) {
		this.profileId = pid;
		this.name = name;
		this.friendsProfileIds = new HashSet<Long>(ids);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	public Set<Long> getFriendsProfileIds() {
		return friendsProfileIds;
	}
	public void setFriendsProfileIds(Set<Long> friendsProfileIds) {
		this.friendsProfileIds = friendsProfileIds;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", profileId=" + profileId + ", friendsProfileIds=" + friendsProfileIds + "]";
	}
	
	
}
