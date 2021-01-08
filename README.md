[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3824669&assignment_repo_type=AssignmentRepo)
# ICS4U OOP Assignment

[*see instructions for details*](Instructions.md)

*Insert Class Diagram here*
[![Class diagram] (https://drive.google.com/file/d/1t1EU1_kJ0oJNX8pNPfpV0TVFiiolfjI8/view?usp=sharing)]

(It's not a png file so I'll leave the link here.)


## Summary
A shopping cart list with the ability to edit and read the Product.txt and the ShoppingCart.txt, to calculate the cost of all the items in the shopping cart.

### Item.java
It sort up all the required information for each

### ShoppingCart.java - deleted this one because... I already spend too much time on main and Items, its going to be a lot more clearer if I did this one.
It has the ability to read the ShoppingCart.txt to see any Items that are selected to be in the ShoppingCart. It contains the methods that can be used by items, such as: buyNow, isInCart and intCost.

It is use to calculate the totalCost of all the items in the shopping cart and taxation, to print them out in the main.java.

### Products.java
It has the ability to add new Items into Product.txt - discarded idea (Can not do fileWrite on a non-main file which isn't declared to be thrown)

It is used to seperate cart items and available items.

### main.java
It is use to test and run all the commands that are made in the objects. Contain arrays of objects that includes both Products and Items.