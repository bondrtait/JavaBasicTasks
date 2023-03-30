package com.ct.vlevy.ForArrayBasic.Computer;

//Design such Java class with name Computer and such properties as:
// - Brand
// - Screen size
// - Number of cores
// -Type (laptop,desktop,etc.)
// Make `Brand` and `Screen size` properties required in order to create an object(instance).
// Create two auxiliary object of Computer class.

public class ComputerMain {
    public static void main(String[] args) {
        Computer lenovo = new Computer("Lenovo", 15.5);
        Computer dell = new Computer("Dell", 13.5);
    }
}
