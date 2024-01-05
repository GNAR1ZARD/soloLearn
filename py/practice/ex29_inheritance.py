# Inheritance
# Inheritance provides a way to share functionality between classes.
# Imagine several classes, Cat, Dog, Rabbit and so on. Although they may differ in some ways (only Dog might have the method bark), they are likely to be similar in others (all having the attributes color and name).
# This similarity can be expressed by making them all inherit from a superclass Animal, which contains the shared functionality.
# To inherit a class from another class, put the superclass name in parentheses after the class name.

# Complete the provided code to inherit the Car class from the Vehicle class, create a Car object and call its horn() method, which is inherited from the Vehicle superclass.

class Vehicle: 
    def horn(self):
        print("Beep!")

class Car(Vehicle):
    def __init__(self, name, color):
        self.name = name
        self.color = color

obj = Car("BMW", "red")
obj.horn()