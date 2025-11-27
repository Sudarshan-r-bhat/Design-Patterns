## DECORATOR DESIGN PATTERN
It is a Structural design pattern used to provision multiple operations apart from the basic operation on a
raw object.

### EXAMPLE
Let's say you have a datasource, that can read a file and write text to a file. Now you need to add features
that compresses the text and also encodes it in base64 before storing in file. And also be able to reverse the
process to enable reading.

### UML DIAGRAM

![decorator-design-pattern-uml-diagram](../../../../../../../assets/decorator.png)