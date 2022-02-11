Feature: This is to test Myntra Application Login Page
Scenario Outline: To Test Login Page 
 Given User enters the URL

 And user enters the "<Username>" Valid Username.

 And user enters the "<password>" Valid Password
 And user click on the login button 
 Then User Succesfully login to the Home page 
 Examples:
 |Username|password|
 |7729850788|@jith3171998B|
 |7729850780|@jith3171998B|
 |7729850780||
 |||
 |7729850780|@jith3171998J|
 
