# Define a class called 'Person'
class Person:
    # Constructor to initialize a person's name and age
    def __init__(self, name, age):
        self.name = name
        self.age = age

    # Method to greet the person
    def greet(self):
        print(f"Hello, my name is {self.name} and I am {self.age} years old.")

    # Method to check if the person is an adult
    def is_adult(self):
        if self.age >= 18:
            return True
        else:
            return False

# Function to display whether a person is an adult or not
def check_adult(person):
    if person.is_adult():
        print(f"{person.name} is an adult.")
    else:
        print(f"{person.name} is not an adult.")

# Create objects of the Person class
person1 = Person("Alice", 25)
person2 = Person("Bob", 16)

# Call the greet method for each person
person1.greet()
person2.greet()

# Check if the persons are adults
check_adult(person1)
check_adult(person2)
