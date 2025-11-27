package com.project.designpatterns.iteratorPattern;
// problemStatement : send spam mssg to friends and co-workers in you're oraganization's Facebook network.
// This will be my driver class
public class FacebookSpamSender {
	
	public static void main(String[] args) {
		
		final String MESSAGE = "This is a spam";
		final Long myId = 10002L;
		
		Facebook fb = new Facebook(myId);
		
		SpamSender spammer = new SpamSender();
		// spammer.send(fb.getFriendsIterator(), MESSAGE);
		spammer.send(fb.getCoworkerIterator(), MESSAGE);
	}
}

class SpamSender {
	public void send(NetworkIterator itr, String mssg) {
		while(itr.hasNext()) {
			System.out.println("selected profile: " + itr.next());
			System.out.println("Now sending SPAM ! `^_^` " + mssg);
		}
	}
}
