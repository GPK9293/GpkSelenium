Feature: OrangeHRM Application Testing
Scenario: OrangeHRM Application LogIn Page Testing
Given User Should Open a Browser on the System
When User Enters OrangeHRM Application URL Address
Then User Should be Able to Navigate to OrangeHRM Application Login Page
Then User Should Close the OrangeHRM Application

Scenario Outline:
: OrangeHRM Application LogIn Functionality Testing
Given User Should Open a Browser on the System
When User Enters OrangeHRM Application URL Address
Then User Should be Able to Navigate to OrangeHRM Application Login Page
Then User Should enter "<UserName>" and "<Password>" and click on LogInButton
Then User Should be able to Navigate HomePage
Then User Should Close the OrangeHRM Application
Examples:
|UserName|Password|
|GPK9293|Gpk@9293| 
|GPK9293|Gpk@9293|
|GPK@9293|Gpk9293|
