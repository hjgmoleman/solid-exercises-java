# Intoduction
This exercise will be focussed on the Open Closed Principle:
- Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

# Requirements
- Make sure the source code it's up to date with the answer to exercise 1

# Exercise 2
Another problem is that Package is a concept belonging to University. The Student should only care about the monthly allowance. Lets look at another method called AddBonusAllowance (in Student.cs) that increases the allowance based on the Package purchased by the university. Just like the constructor, this method would also have to check the current Package in order to increase the allowance accordingly:

- Examine Student and try to identify reasons this code might need (a lot of) modification due to external changes.
- Find a way to fix this.