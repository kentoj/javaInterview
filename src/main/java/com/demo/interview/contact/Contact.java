package com.demo.interview.contact;

/**
 * Created by kent on 1/11/16.
 */
public class Contact {
    private String firstName, lastName, githubLink;
    public Contact(String firstName, String lastName, String githubLink) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.githubLink = githubLink;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGithubLink() {
        return githubLink;
    }
}
