package com.project.designpatterns.observer;

public class DriverClass {
    public static void main(String[] args) {
        
        // Create the subject (publisher)
        EclipseServer server = new EclipseServer();
        
        // Create observers (subscribers)
        Observer springUser1 = new SpringUser("spring-user-001");
        Observer springUser2 = new SpringUser("spring-user-002");
        Observer javaUser1 = new JavaUser("java-user-001");
        
        // Subscribe to different events
        server.subscribe(springUser1, "ui-update");
        server.subscribe(springUser1, "security");
        server.subscribe(springUser2, "security");
        server.subscribe(javaUser1, "ui-update");
        server.subscribe(javaUser1, "plugin-update");
        
        // Publish events
        System.out.println("\n=== Publishing UI Update ===");
        server.publishUIUpdate("dark-theme");
        
        System.out.println("\n=== Publishing Security Update ===");
        server.publishSecurityUpdate("<security><patch>CVE-2024-001</patch></security>");
        
        System.out.println("\n=== Publishing Plugin Update ===");
        server.publishPluginUpdate("Spring Tools", "4.21.0");
        
        // Unsubscribe and publish again
        System.out.println("\n=== Unsubscribing springUser1 from ui-update ===");
        server.unsubscribe(springUser1, "ui-update");
        
        System.out.println("\n=== Publishing Another UI Update ===");
        server.publishUIUpdate("light-theme");
    }
}
