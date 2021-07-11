<h1 align="center"> Spring Framework </h1> <br>

## Table of Contents

- [Introduction](#introduction)
- [This&nbsp;respository](#thisrepository)
- [Dependencies](#dependencies)
- [Run&nbsp;Code](#runcode)
- [Platzi&nbsp;Course](#platzicourse)
- [Notes](#notes)

## Introduction
A framework is a structure that provides tools to develop advanced tasks, using less code and performing better practices in less time.
Spring is the most popular Java framework, which performs repetitive tasks so that developer can focus on developing advanced solutions. Being the most popular framework, it is easy to find documentation, and there is also a huge community that contributes to this project.
Spring contains more than 30 internal projects. Some of them are:
- Spring Framework. For transversal development, the rest of the projects are based on this one.
- Spring Boot. To develop server-based applications Tomcat, Jetty or Undertow applications.
- Spring Data JPA. Manage and query database.
- Spring Security. Manages authentication and authorization security.

#### JPA
Its function is to interact with the tables of a database in the form of Java objects.
Some of its implementations are:
- Hibernate
- TopLink
- EclipseLink
- ObjectDB

Some of his most relevant annotations are:
- @Entity -> Tells Java that a class is representing a table.
- @Table -> Receives the name of the table that the class is mapping (it is only used when the name of the entity does not match the name of the table).
- @Colum -> Receives the name of a column that is mapping the properties of a class (only used when the property name does not match the column name).
- @Id & EmbeddedId -> Indicates that an attribute is a primary key or a composite key.
- @GeneratedValue -> Automatically generate values for primary keys.
- @OneToMany & @ManyToOne -> Represents relationships between tables.



#### Spring Security
Its function is to provide authentication and authorization to a Spring application. It is an easy-to-adjust tool that protects against attacks such as: Session Fixation, clickjacking, cross site request forgery, among others.

## This&nbsp;repository
This repository contains the project that was developed throughout the Spring Java course. The project is an API that controls the operations of a supermarket. This API gets information from a PostgreSQL database.
What this API does is:
- Gets the products
- Gets the products by ID
- Gets the products by category
- Gets the products by category ID
- Deletes a product by ID
- Updates a prodcut by ID
- Gets a token
- Gets the purchases
- Gets the purchases by client
- Save a new purchase


## Dependencies
- Install OpenJDK 11
- Install Intellj or another IDE thats supports OpenJDK 11 and contains gandler
- Install PostgreSQL
- Add springfox-swagger2 2.9.2 or later
- Add springfox-swagger-ui 2.9.2 or later
- Add spring-boot-starter-security or later
- Add jjwt 0.9.1 or later
- Install Postman in order to make requests to the API

## Run&nbsp;Code
You can only run these projects using Intelli or another IDE what support gradle.


## Platzi&nbsp;Course

Check out [Platzi's Spring Java course](https://platzi.com/clases/java-spring/).


## Notes

Most commits correspond to sections of the course in which the project code was changed.
