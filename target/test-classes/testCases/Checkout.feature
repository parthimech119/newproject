
@book
Feature: new implementation of booking feature 
@productVerify
Scenario: verify the product name and price 
Given open  browser as firefox
When enter url as https://www.flipkart.com/
When search product as samsung
And click the first link
When switch to child window
And verify the product name and price 

@adtocart

Scenario: add tp cart and place order 
Given open  browser as firefox
When enter url as https://www.flipkart.com/
When search product as samsung
And click the first link
When enter the pincode as 639002
And click add to cart
Then   verify the product name and price

