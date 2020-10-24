package com.shamy1st.prototype;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}