package com.project.designpatterns.sagaPattern;

public class MessageBroker {
	
	private Service1State state1 = new Service1State();
	private Service2State state2 = new Service2State();
	private Service3State state3 = new Service3State();
	
	
	
	
	static class Service1State {
		private String message;
		public void setMessage(String msg) {
			this.message = msg;
		}
		public String getMessage() {
			return this.message;
		}
	}
	
	static class Service2State {
		private String message;
		public void setMessage(String msg) {
			this.message = msg;
		}
		public String getMessage() {
			return this.message;
		}
	}
	
	static class Service3State {
		private String message;
		public void setMessage(String msg) {
			this.message = msg;
		}
		public String getMessage() {
			return this.message;
		}
	}
}
