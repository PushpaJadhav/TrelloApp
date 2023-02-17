package com.Trello.Loginpage;

import java.time.Duration;
import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Trello.Keywords.KeyWord;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(KeyWord.driver, this);
	}

	
	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/a[1]")
	public static WebElement LogInBtn;
	
	@FindBy(xpath="//div/child::input[@name=\"user\"]")
	public static WebElement EmailBox;
	
	@FindBy(xpath="//button[@aria-label='Create board or Workspace']")
		public static WebElement CreateBoard;	
	
	@FindBy(xpath="//button[@data-testid='header-create-board-button']")
	public static WebElement createHeadBoardButton;
	
	
	@FindBy(css="input#login")
	public static WebElement ContinueBtn;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	public static WebElement PasswordBox;
	
	@FindBy(css="h3.boards-page-board-section-header-name")
	public static WebElement TrelloWorspaceTitle;
	
	@FindBy(css="button#login-submit")
	public static WebElement LoginBtnClick;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	public static WebElement BoardTitle;
	
	@FindBy(xpath="//button[normalize-space()='Create']")
	public static  WebElement createBoardOnWorkspace;
	
	@FindBy(xpath="//a[@class='open-add-list js-open-add-list']")
	public static WebElement AddAList; 
	
	@FindBy(xpath="//input[@placeholder='Enter list title…']")
	public static WebElement AddListTitle;
	
	@FindBy(xpath="input[value='Add list']")
	public static WebElement AddList;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[3]/a[1]")
    public static WebElement AddCard;
	
	@FindBy(css="textarea[placeholder='Enter a title for this card…']")
	public static WebElement CardName;
	
	@FindBy(xpath="//input[@value='Add card']")
	public static WebElement createNewCard;
	
	@FindBy(xpath="//div[@class='list-card-details js-card-details']")
	public static WebElement CardALoc;
	
	public static void ClickOnSignInButton()
	{
		LogInBtn.click();
	}
	
	
	
	
	
	 public static void EnterEmailId() {
			// TODO Auto-generated method stub
		     EmailBox.sendKeys("pushpajadhav0811@gmail.com");
	        
		}
	public static void clickOnContButton() {
		// TODO Auto-generated method stub
		ContinueBtn.click();
		

	}
	
	
	public static void EnterPassword() {
		// TODO Auto-generated method stub
		//WebDriverWait wait=new WebDriverWait(KeyWord.driver,Duration.ofMinutes(2));

	//wait.until(ExpectedConditions.elementToBeClickable(PasswordBox));
		
	  PasswordBox.sendKeys("Pushpa@123");
      
	}
	
	public void clickOnLogInButton() {
		// TODO Auto-generated method stub
		LoginBtnClick.click();
        
	}
	
public void CilckOnBoard() {
		// TODO Auto-generated method stub
	CreateBoard.click();

	}
public void createHeadBoardButton() {
	// TODO Auto-generated method stub
	createHeadBoardButton.click();


}

public void createBoardTitle() {
	// TODO Auto-generated method stub
	BoardTitle.sendKeys("TrelloFirstProject");
}	

public  void createBoard() {
	// TODO Auto-generated method stub
	createBoardOnWorkspace.click();
}

 public void clickOnAddAList() {
	// TODO Auto-generated method stub
   AddAList.click();
}
 
public void addListTitle() {
	// TODO Auto-generated method stub
  AddListTitle.sendKeys("ListA");
}

 public void clickOnAddList() {
	// TODO Auto-generated method stub
    AddList.click();
}
 
public void clickOnAddCard() {
	// TODO Auto-generated method stub
	AddCard.click();

}

public void addCardName() {
	// TODO Auto-generated method stub
   AddCard.sendKeys("CardA");
}

public void clickOnCreateNewCardOnList() {
	// TODO Auto-generated method stub
  createNewCard.click();
}

public void addListBTitle() {
	// TODO Auto-generated method stub
  AddListTitle.sendKeys("ListB");
}

}
