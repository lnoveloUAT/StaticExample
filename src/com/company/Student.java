package com.company;

/**
 * Student Class to demonstrate static attributes
 */
public class Student {
    private static int _lastStudentID = 10000;
    private String _firstName;
    private String _lastName;

    /**
     * @param lastName
     * @param firstName
     */
    public Student(String lastName, String firstName)
    {
        _lastName = lastName;
        _firstName = firstName;
        _lastStudentID = get_lastStudentID() + 1;
    }

    public static int get_lastStudentID() {
        return _lastStudentID;
        // String x = this._firstName;          <<<=== Can I do this?
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }
}
