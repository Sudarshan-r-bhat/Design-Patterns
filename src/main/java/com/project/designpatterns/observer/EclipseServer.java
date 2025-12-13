package com.project.designpatterns.observer;

/**
 * Publisher/Subject that generates events and notifies subscribers.
 * This represents the Eclipse IDE server that pushes updates to subscribed users.
 */
public class EclipseServer implements Subject {
    
    private final EventManager eventManager;
    
    public EclipseServer() {
        this.eventManager = new EventManager();
    }
    
    @Override
    public void subscribe(Observer observer, String eventType) {
        eventManager.subscribe(observer, eventType);
    }
    
    @Override
    public void unsubscribe(Observer observer, String eventType) {
        eventManager.unsubscribe(observer, eventType);
    }
    
    @Override
    public void notifyObservers(String eventType, String data) {
        eventManager.notify(eventType, data);
    }
    
    // Business logic methods that trigger events
    public void publishUIUpdate(String theme) {
        String updateData = "{type: 'theme', color: '" + theme + "'}";
        notifyObservers("ui-update", updateData);
    }
    
    public void publishSecurityUpdate(String xmlContent) {
        notifyObservers("security", xmlContent);
    }
    
    public void publishPluginUpdate(String pluginName, String version) {
        String updateData = "{plugin: '" + pluginName + "', version: '" + version + "'}";
        notifyObservers("plugin-update", updateData);
    }
}
