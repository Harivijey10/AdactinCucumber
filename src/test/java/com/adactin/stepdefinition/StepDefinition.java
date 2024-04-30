package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver = Test_Runner.driver; // RunnerClass driver
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
			
		driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The User Name In The Username Field$")
	public void user_Enter_The_User_Name_In_The_Username_Field() throws Throwable {
	    	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jivita04");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	    	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	}

	@Then("^user Should Click The Login Button And User Should Navigate To Search Hotel Page$")
	public void user_Should_Click_The_Login_Button_And_User_Should_Navigate_To_Search_Hotel_Page() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}

	@When("^user Able To Select Location In The Loation Field$")
	public void user_Able_To_Select_Location_In_The_Loation_Field() throws Throwable {
	   
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location.click();
		Select s = new Select(location);
		s.selectByIndex(3);
	}

	@When("^user Able To Select Hotel In The Hotels Field$")
	public void user_Able_To_Select_Hotel_In_The_Hotels_Field() throws Throwable {
	    
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		hotel.click();
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);
	}

	@When("^user Able To Select Room Type In The Room Type Field$")
	public void user_Able_To_Select_Room_Type_In_The_Room_Type_Field() throws Throwable {
	    
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		room.click();
		Select s2 = new Select(room);
		s2.selectByIndex(4);
	}

	@When("^user Able To Select Number Of Rooms In The Number Of Rooms Field$")
	public void user_Able_To_Select_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
	    
		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		roomnos.click();
		Select s3 = new Select(roomnos);
		s3.selectByIndex(1);
	} 

	@When("^user Able To Select Number Of Adults In Adults Per Room Field$")
	public void user_Able_To_Select_Number_Of_Adults_In_Adults_Per_Room_Field() throws Throwable {
	    
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		adultroom.click();
		Select s4 = new Select(adultroom);
		s4.selectByIndex(1);
	}

	@When("^user Able To Select Number Of Children In Children Per Room Field$")
	public void user_Able_To_Select_Number_Of_Children_In_Children_Per_Room_Field() throws Throwable {
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		childroom.click();
		Select s5 = new Select(childroom);
		s5.selectByIndex(1);
		
	}

	@Then("^user Should Click Search Button And User Should Navigate To Select Hotel Page$")
	public void user_Should_Click_Search_Button_And_User_Should_Navigate_To_Select_Hotel_Page() throws Throwable {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@When("^user Able To Click The Radio Button In The Select Hotel Page$")
	public void user_Able_To_Click_The_Radio_Button_In_The_Select_Hotel_Page() throws Throwable {
	   
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	}

	@Then("^user Should Click Continue Button And User Should Navigate To Book A Hotel Page$")
	public void user_Should_Click_Continue_Button_And_User_Should_Navigate_To_Book_A_Hotel_Page() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("^user Able To Enter Name In The First Name Field$")
	public void user_Able_To_Enter_Name_In_The_First_Name_Field() throws Throwable {

		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Harivijey");
	}

	@When("^user Able To Enter Name In The Last Name Field$")
	public void user_Able_To_Enter_Name_In_The_Last_Name_Field() throws Throwable {
	   
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Murugesan");
	}

	@When("^user Able To Enter Address In The Billing Address Field$")
	public void user_Able_To_Enter_Address_In_The_Billing_Address_Field() throws Throwable {

		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Ramakrishnapuram, Karur, Tamilnadu");
	}

	@When("^user Able To Enter card Number In Credit Card Number Field$")
	public void user_Able_To_Enter_card_Number_In_Credit_Card_Number_Field() throws Throwable {

		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890098765");
		
	}

	@When("^user Able To Select Card Type In Credit Card Type Field$")
	public void user_Able_To_Select_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		cctype.click();
		Select s6 = new Select(cctype);
		s6.selectByIndex(3);
	}

	@When("^user Able To Select Month And Year In The Expiry Date Field$")
	public void user_Able_To_Select_Month_And_Year_In_The_Expiry_Date_Field() throws Throwable {
	    
		WebElement ccmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		ccmonth.click();
		Select s7 = new Select(ccmonth);
		s7.selectByIndex(11);
		
		WebElement ccyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		ccyear.click();
		Select s8 = new Select(ccyear);
		s8.selectByIndex(14);
	}

	@When("^user Able To Enter Number In The CVV Number Field$")
	public void user_Able_To_Enter_Number_In_The_CVV_Number_Field() throws Throwable {

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("456");
	}

	@Then("^user Should Click The Book Now Button And User Should Navigate To Booking Confirmation Page$")
	public void user_Should_Click_The_Book_Now_Button_And_User_Should_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
	}

	@Then("^user Should Click My Itinerary Button And User Should Navigate To Booked Itinerary$")
	public void user_Should_Click_My_Itinerary_Button_And_User_Should_Navigate_To_Booked_Itinerary() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		
		
	}

	@Then("^user Should Scroll Down And Click Log Out Button And User Should Log Out From The Application$")
	public void user_Should_Scroll_Down_And_Click_Log_Out_Button_And_User_Should_Log_Out_From_The_Application() throws Throwable {
	    
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
