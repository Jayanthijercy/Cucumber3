package com.Banggood.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Banggood.resources.Base;

public class Pojo extends Base{
	
	public Pojo() {

	PageFactory.initElements(driver, this);
	}


		@FindBy(xpath="//input[@name='keywords']")
		private WebElement searchbox;
		
//		@FindBy(className="keyword inputchang top_search_text_170412 clickandsend")
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement serach;
	
	@FindBy(xpath="(//a[@data-point-id='18206083330'])[1]")
	private WebElement product;
	
	@FindBy(xpath="(//a[text()='Add to Cart'])[2]")
	private WebElement add;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSerach() {
		return serach;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getAdd() {
		return add;
	}
	
}
