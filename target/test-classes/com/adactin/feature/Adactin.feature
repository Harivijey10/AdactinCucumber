Feature: Hotel Booking In Adactin Application

Scenario: User Able To Login The Web Application
Given user Launch The Adactin Application
When user Enter The User Name In The Username Field
And user Enter The Password In The Password Field
Then user Should Click The Login Button And User Should Navigate To Search Hotel Page

Scenario: User Should Be Able to Search Hotel
When  user Able To Select Location In The Loation Field
And user Able To Select Hotel In The Hotels Field
And user Able To Select Room Type In The Room Type Field
And user Able To Select Number Of Rooms In The Number Of Rooms Field
And user Able To Select Number Of Adults In Adults Per Room Field
And user Able To Select Number Of Children In Children Per Room Field
Then user Should Click Search Button And User Should Navigate To Select Hotel Page

Scenario: User Should Be Able To Select Hotel
When user Able To Click The Radio Button In The Select Hotel Page
Then user Should Click Continue Button And User Should Navigate To Book A Hotel Page

Scenario: User Should Be Able To Book A Hotel
When user Able To Enter Name In The First Name Field
And user Able To Enter Name In The Last Name Field
And user Able To Enter Address In The Billing Address Field
And user Able To Enter card Number In Credit Card Number Field
And user Able To Select Card Type In Credit Card Type Field
And user Able To Select Month And Year In The Expiry Date Field
And user Able To Enter Number In The CVV Number Field
Then user Should Click The Book Now Button And User Should Navigate To Booking Confirmation Page
Then user Should Click My Itinerary Button And User Should Navigate To Booked Itinerary

Scenario: User Should Be Able To Log Out The Application
Then user Should Scroll Down And Click Log Out Button And User Should Log Out From The Application
