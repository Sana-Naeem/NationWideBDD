
Feature: Business Quote Validation

Background: Initiate Driver
Given user is in the Libery Mutual Page

Scenario: Quote is for starting a new business. 
Given the title of the page is 'Insurance and Financial Services Company – Nationwide'
When user clicks on the drop down menu bar they can select Business 'Business'
Then user will click on start your quote button
