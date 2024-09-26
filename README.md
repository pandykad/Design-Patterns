# Design Patterns in Java

This repository contains Java implementations of various design patterns, which are essential tools in software development for creating flexible, reusable, and maintainable code. The patterns covered in this repository include the Strategy, Observer, Decorator, and Factory patterns. Each pattern is accompanied by a real-life example to help you understand its practical application.

## Design Patterns

### 1. Strategy Pattern

**Description**:  
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern allows the algorithm to vary independently from clients that use it.

**Real-Life Example**:  
Think of a navigation app that offers multiple routes (e.g., shortest distance, fastest route, avoid tolls) to reach a destination. Each route calculation is a different strategy. The user can choose which strategy to use based on their preference.

**Implementation**:  
In this repository, you will find a `StrategyPattern` implementation where different strategies for executing algorithms are encapsulated and interchangeable.

### 2. Observer Pattern

**Description**:  
The Observer pattern is used when there is a one-to-many relationship between objects. One object (the subject) notifies a group of dependent objects (observers) of any state changes.

**Real-Life Example**:  
A classic example is a news feed or blog subscription. When a new article is published, all subscribers (observers) are notified and can read the latest content.

**Implementation**:  
The `ObserverPattern` implementation in this repository demonstrates how to create a subject that can notify multiple observers of state changes.

### 3. Decorator Pattern

**Description**:  
The Decorator pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

**Real-Life Example**:  
Consider a coffee shop where you can order a base coffee and then add various toppings like milk, sugar, whipped cream, etc. Each topping is a decorator that enhances the base coffee.

**Implementation**:  
In this repository, the `DecoratorPattern` implementation shows how to add functionalities to objects dynamically, without modifying their structure.

### 4. Factory Pattern

**Description**:  
The Factory pattern provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

**Real-Life Example**:  
Imagine a vehicle manufacturing company that produces different types of vehicles (cars, trucks, motorcycles). The factory method in this context determines which type of vehicle to manufacture based on the input provided.

**Implementation**:  
The `FactoryPattern` implementation in this repository demonstrates how to use the factory method to create different types of objects based on specific conditions.

## Getting Started

To explore the patterns, clone this repository and run the Java files. Each pattern's implementation is self-contained within its respective folder.

```bash
git clone https://github.com/yourusername/design-patterns-java.git
cd design-patterns-java
