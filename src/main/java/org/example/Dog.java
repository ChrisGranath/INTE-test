package org.example;

public class Dog {

    int status;

    public Dog(int status){
        this.status = status;
    }
    public String getStatus(Dog dog){
        if(dog.status < 10){
            return "badDog";
        }else{
            return "goodDog";
        }
    }

}
