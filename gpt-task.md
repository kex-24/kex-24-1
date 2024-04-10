# DinoPark Java Programming Task

## Deadline
Submit this task before the next exercise session.

## Instructions
Follow the course instructions for submitting assignments, which can be found in the assignments section of the course instructions.

## Preparation
- Complete readings in Module 2: Looking Inside Classes accessible through the course portal or directly on the web.
- Review the OLI material and tasks up to this module.

## Learning Goals
This week, you'll learn how to:
* Design Java classes with proper attributes and methods
* Implement constructors, getters, and setters in Java
* Manipulate objects using the dot operator
* Understand and utilize the main method and printing in Java
* Grasp the concept of scope and variable shadowing in Java

## Assignment Overview

In the lush forests of the DinoPark, several species of dinosaurs roam freely. Your task is to model these dinosaurs in Java, creating a digital representation of these ancient creatures.

### Task 1: Creating Your Dinosaur Class

Start by creating a new Java file called `Dinosaur.java` in your project's `src` folder. This file will contain the `Dinosaur` class, which will serve as the blueprint for creating dinosaur objects.

Your dinosaurs should have the following characteristics, which will be represented as fields in the class:
- `String` speciesName
- `int` age
- `int` health
- `int` strength
- `boolean` isHungry

Add these fields to your class. Do not assign any values to them yet as their values will be specific to each dinosaur object you create.

### Task 2: Constructing a Dinosaur

Next, you'll create a constructor for the `Dinosaur` class. This constructor should take parameters for each of the fields you've defined and assign them to the corresponding fields of the class.

Once you've written your constructor, create a dinosaur object in your class's main method. For example, you could create a Tyrannosaurus Rex named "Rex" who is 15 years old, has a health of 100, a strength of 80, and is currently hungry.

### Task 3: Using Getters and Setters

To promote good encapsulation practices, modify your dinosaur class by setting the access modifier of all fields to `private`. Then, create getter and setter methods for each field. These methods will control access to the fields, allowing you to read and modify their values safely from outside the class.

### Task 4: Creating More Dinosaurs

With your class structure in place, create two more dinosaur objects of different species in the main method. Use the constructor to set their initial properties.

### Task 5: Implement a Feed Method

Dinosaurs need to eat! Write a method named `feedDinosaur` that accepts a `Dinosaur` object as its parameter. This method should simulate feeding the dinosaur, thus setting its `isHungry` field to `false`. It should also print a message indicating that the dinosaur has been fed.

### Task 6: Dinosaurs Roaring

Add a method to the `Dinosaur` class that simulates the dinosaur making a roaring sound. The method, named `roar`, doesn't need to return anything but should print a message to the console that includes the species name of the dinosaur and a roaring sound.

### Task 7: Understand Scope and Shadowing

Review examples of variable shadowing provided in the course material, and be prepared to discuss these concepts as they relate to your `Dinosaur` class. Pay special attention to the use of the `this` keyword to distinguish between class fields and method parameters with the same name.

## Submission Checklist
- Create the `Dinosaur` class with the specified fields.
- Implement a constructor that initializes all fields of the class.
- Add getter and setter methods for each field.
- Create two additional dinosaur objects using your class.
- Implement and test the `feedDinosaur` method.
- Implement and test the `roar` method.
- Review and understand the examples of scope and variable shadowing.

## Troubleshooting
If you encounter issues, first review the posted questions. If your question hasn't been addressed, create a new issue with a descriptive title based on the problem you're experiencing.

## Bugs and Feedback
If you discover any bugs in this exercise or have feedback, please open a new issue with a descriptive title reflecting the problem or feedback.
