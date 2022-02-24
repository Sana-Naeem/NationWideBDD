
Feature: Business Quote Validation

Background: Initiate Driver
Given user is in the Libery Mutual Page

Scenario: Quote is for starting a new business. 
Given the title of the page is 'Insurance and Financial Services Company – Nationwide'
When user clicks on the drop down menu bar they can select Business 'Business'
Then user will click on start your quote button
Then user will be navigated to another page
And user will then click on the second start your quote button
Then user will scroll down to Workers compensation and can click on the select this coverage button
Then user will go to next step by clicking save and continue button 