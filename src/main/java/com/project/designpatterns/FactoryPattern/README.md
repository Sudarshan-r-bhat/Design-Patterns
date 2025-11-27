# FACTORY DESIGN PATTERN
Its used to create different variations of particular type of object through its assiciated factory classes.

## EXAMPLE 
Let's say you want to compose 2 variations of email, SimpleEmail, AttachmentEmail and send it to specific e-mail address.
The design would be , 2 Factory classes to generate each variation of the email, a) SimpleEmailFactory b) AttachmentEmailFactory .

This design pattern is used to create object of only 1 type of class with multiple variations. For multiple types with multiple variations refer Abstract Factory design pattern.

## UML DIAGRAM

![factory-design-pattern-uml-diagram](../../../../../../../assets/factory.png)
