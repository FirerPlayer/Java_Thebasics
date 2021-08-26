package com.company;

import com.sun.jdi.event.StepEvent;

public class person {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    public void setAge(int n){
        if(n < 0 || n > 100){
            this.age=0;
        }else {
            this.age = n;
        }
    }
    public boolean isTeen(){
        if(getAge() < 20 && getAge() > 12){
            return true;
        }else{
            return false;
        }
    }
    public String getFullName(){
        if(getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        }else if(getFirstName().isEmpty()){
            return getLastName();
        }else if (getLastName().isEmpty()){
            return getFirstName();
        }else{
            return getFirstName() + getLastName();
        }
    }
}
