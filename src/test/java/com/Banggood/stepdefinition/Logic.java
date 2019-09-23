package com.Banggood.stepdefinition;

import com.Banggood.objectrepository.Pojo;
import com.Banggood.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Logic extends Base {
	
	@Given("Launch the browser and go to Banggood website and serach for digital camera")
	public void launch_the_browser_and_go_to_Banggood_website_and_serach_for_digital_camera() {
		
		launch("https://www.banggood.in/?akmClientCountry=IN&");
	
		 Pojo p=new Pojo();
		send(p.getSearchbox(),"digital cameras");
		clk(p.getSerach());
	
			
	   
	}

	@When("select the camera and add it to cart")
	public void select_the_camera_and_add_it_to_cart() {
	
	Pojo p=new Pojo();
	clk(p.getProduct());
	clk(p.getAdd());
	   
	}

	@Then("check url having Digital-Camera")
	public void check_url_having_Digital_Camera() {
		
		String s=driver.getCurrentUrl();
		boolean b=s.contains("Digital_Camera");
		Assert.assertTrue(b);
	   
	}




}
