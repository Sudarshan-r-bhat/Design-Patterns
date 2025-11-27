# Design Patterns
In this repository I have covered 21 design pattern of all 3 types creational, behavioural, structural
in a very unique way so you can relate to the realtime analogy of the examples used to implement each
pattern.
### status: 
    Code implementation: DONE
    README.md : Work in progress.

### Basics of structuring
Class / Abstract Class inheritance
1. When you have object is-a type of relationship and want to have shared state, shared functionality
2. have more control over the shared resource with access modifiers (protected/public)
ex:
```
Template Method design pattern, where it provides a concrete implementation of 'template method' and default helper methods , Ensuring the overall algorithm structure is fixed while allowing variation in specific steps.

```

Interface inheritance
1. When you want to layout the spec or template and a polymorphic behaviour rather than focusing on how & what state/memory is managed.
2. When you want to keep the code loosely coupled, plug and play.
3. Interfaces do not enforce shared state, so they encourage composition rather than inheritance. meaning concrete implementation classes can be initialized with required class objects.

ex: 
```
Command design pattern , where the Interface dictates execute() method
Strategy design pattern
Observer design pattern

```
Although these patterns can be implemneted with abstract classes, interfaces make more sense here.

## MEMENTO DESIGN PATTERN
It is a Behavioural design pattern . You can use this pattern when you need to store state of a
application and provide any operation on those state like undo.

### EXAMPLE
Let's say you are building a text editor app, obviously you need to provide undo operation feature,
so you can revert back N number of times and continue editing. And create new state on every text
edit.

### UML DIAGRAM

![memento-design-pattern-uml-diagram](assets/memento.png)


## ADAPTER DESIGN PATTERN
It is a Structural design pattern used to connect the client class/interface with a
compatible/incompatible interface.

### EXAMPLE
Let's say you travel abroad with your regular charger, but the countries abroad use different sockets & charger pins with different charging functionality type like fastcharging and also different voltage and current. Now to charge your device you need an adapter specific for the socket and electricity standards.

### UML DIAGRAM

![adapter-design-pattern-uml-diagram](assets/adapter.png)



## PROTOTYPE DESIGN PATTERN
It is a Creational design pattern used to create clone of the existing object. So that you are
free from the hassle of copying every class member's object values and without clone
accessing private member becomes difficult prototype solves this problem,
helps you get clones with different object configuration.

### EXAMPLE
Let's say you are making a study on living organisms on Earth, you wish get information of
those organism and modify certain information regarding that organism and submit those details
for modification to the governing body without altering the actual object.

### UML DIAGRAM

![prototype-design-pattern-uml-diagram](assets/prototype.png)

## DECORATOR DESIGN PATTERN
It is a Structural design pattern used to provision multiple operations apart from the basic operation on a
raw object.

### EXAMPLE
Let's say you have a datasource, that can read a file and write text to a file. Now you need to add features
that compresses the text and also encodes it in base64 before storing in file. And also be able to reverse the
process to enable reading.

### UML DIAGRAM

![decorator-design-pattern-uml-diagram](assets/decorator.png)

# PROXY DESIGN PATTERN
It is a structural design pattern used to provide a proxy for a service class, so that it can control the flow of information in and out of the actual service class. And aslo
to maintain a stable client functionality even when changes are made to the actual service class. 

proxy service class usecases include caching, access control

## EXAMPLE 
Let's say you have a Search tool, which searches for text from the domain you specify. But only to the known users.
to achieve this, you create a SearchProxyService, that composes firewall service, which authorizes the user access to the 
search service. The proxy service simply uses firewall to authorize the user request and responds accordingly.

## UML DIAGRAM

![proxy-design-pattern-uml-diagram](assets/proxy.png)


## FLYWEIGHT DESIGN PATTERN
It is a Structural design pattern used to minimize memory usage by sharing as much data as possible with similar objects — the "flyweight" objects hold intrinsic, shareable state while extrinsic state is supplied by the client.

### IMPLEMENTATION (this repo)
- **`BulletType`**: the flyweight object that contains intrinsic properties (name, bitmap, dimensions, particle count).
- **`BulletFactory`**: a pool (map) of `BulletType` instances — `getBullet(name, color, dimension)` returns a shared `BulletType` for the requested name, creating it only if missing.
- **`Game` / `Flyweight`**: sample client code that fires bullets; the client provides extrinsic state (start/target coordinates, speed) and reuses `BulletType` instances supplied by `BulletFactory` to reduce memory allocation.

### UML DIAGRAM

![flyweight-pattern-uml-diagram](assets/flyweight_uml.png)

### How to run
- Run the example `Flyweight` main in `com.project.designpatterns.flyweightPattern` to see the reuse of `BulletType` objects in action.

