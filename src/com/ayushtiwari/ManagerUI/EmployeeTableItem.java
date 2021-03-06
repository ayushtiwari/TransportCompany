package com.ayushtiwari.ManagerUI;

import javafx.beans.property.SimpleStringProperty;

public class EmployeeTableItem {
    private SimpleStringProperty name;
    private SimpleStringProperty branch;
    private SimpleStringProperty employeeId;
    private SimpleStringProperty userName;
    private SimpleStringProperty password;

    public EmployeeTableItem(String name, String branch, String employeeId, String userName, String password) {
        this.name = new SimpleStringProperty(name);
        this.branch = new SimpleStringProperty(branch);
        this.employeeId = new SimpleStringProperty(employeeId);
        this.userName = new SimpleStringProperty(userName);
        this.password = new SimpleStringProperty(password);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public String getUserName() {
        return userName.get();
    }

    public void setUserName(String userName) {
        this.userName.set(userName);
    }

    public SimpleStringProperty userNameProperty() {
        return userName;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public String getBranch() {
        return branch.get();
    }

    public void setBranch(String branch) {
        this.branch.set(branch);
    }

    public SimpleStringProperty branchProperty() {
        return branch;
    }

    public String getEmployeeId() {
        return employeeId.get();
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId.set(employeeId);
    }

    public SimpleStringProperty employeeIdProperty() {
        return employeeId;
    }
}
