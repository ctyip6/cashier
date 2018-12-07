# Cashier

## Background
A tiny toy product for calculating the total price of a basket of products

## Changes

### Moving global mapping to cashier member variable
The global map __ProductDiscountStrategyMapping__ is removed as I would treat it as part of the input to cashier. 
And the role of class Cashier would be "the machine to calculate the total price based on the input rules (the strategy map)".
Putting the strategy map to global hides an input to the cashier and tightly couple the Cashier class with the data. 
It breaks all the test cases when the mapping changes. In my opinion, the changes in mapping should not affect the functionality of the cashier.

### Changes in TwoForOneDiscountStrategy
Minor changes to make it cleaner.

## Discussion
1. You may argue that it is "over-engineered" as the changes in product-strategy mapping is an imaginary requirement I come up with myself. 
But it may be worth to consider as the coding effort is limited but it provides a better extensibility in the future.

## Assumptions
1. The discount strategy is only bound to the type of product. There is no cross product promotion.