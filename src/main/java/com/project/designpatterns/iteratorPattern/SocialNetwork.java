package com.project.designpatterns.iteratorPattern;

public abstract class SocialNetwork {
	public abstract NetworkIterator getFriendsIterator(); // this will only iterate over your friends's profile.
	public abstract NetworkIterator getCoworkerIterator(); // this will only iterate over your co worker's profile.
}
