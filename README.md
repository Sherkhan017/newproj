Assignment 3 
All SQL queries are saved in the query folder.
Each file contains separate SQL scripts for:
- creating tables
- inserting data
- selecting data
- updating data
- deleting data















Overview

This project represents a Social Media platform implemented in Java.

Project contains:

data abstraction

encapsulation

inheritance

polymorphism

data pool organization

overridden toString(), equals(), and hashCode() methods

The project includes the following classes:

Post

Profile

ImagePost

Data Abstraction

I implemented data abstraction using an abstract class Post.

The Post class contains common fields such as:

likes count

author

content

Other post types extend this class and reuse its structure.

abstract class Post

Encapsulation

Encapsulation is used in all classes.

All fields are declared as private

Access to data is provided through getters and setters

Example from Profile class:

private int Age;
private String UserName;
private String ProfileINfo;


This protects the data and allows controlled access.

Inheritance

Inheritance is implemented using the extends keyword.

Example:

class ImagePost extends Post


The ImagePost class inherits fields and methods from Post and adds a new field called imageUrl.

Polymorphism

Polymorphism is shown by using a parent class reference for child objects.

Post p1 = new ImagePost(...);


Java calls the correct method based on the real object type at runtime.

Data Pool Organization

Data is stored using Java collections.

List<Post> posts = new ArrayList<>();
List<Profile> profiles = new ArrayList<>();


These lists are used to store and manage multiple objects.

Searching is done using the equals() method.

Overridden Methods
toString()

This method is overridden to print readable information about a post.

@Override
public String toString() {
    return "Post{" +
            "likes=" + LikesCount +
            ", author='" + postAuthor + '\'' +
            ", content='" + postContent + '\'' +
            '}';
}

hashCode()

This method is overridden to work correctly with equals().

@Override
public int hashCode() {
    return Objects.hash(postAuthor, postContent);
}

equals(Object o)

This method compares two posts by author and content.

@Override
public boolean equals(Object o) {
    if (o == null) return false;
    Post post = (Post) o;
    return postAuthor.equals(post.postAuthor)
            && postContent.equals(post.postContent);
}

Main Class

The Main class creates objects and adds them to collections.

Profile n1 = new Profile(17, "@sherkhan", "student");
Post p1 = new ImagePost(10, "Ali", "Nice photo!", "photo.jpg");


The program prints information about profiles and posts.

