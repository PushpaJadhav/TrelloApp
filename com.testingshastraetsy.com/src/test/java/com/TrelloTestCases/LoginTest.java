package com.TrelloTestCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



import com.Trello.Base.TestBase;
import com.Trello.Keywords.KeyWord;
import com.Trello.Loginpage.*;


public class LoginTest extends TestBase {
	
	LoginPage login=new LoginPage();
	@Test
	public void verifyLogin() throws InterruptedException {
		login.ClickOnSignInButton();
		
		login.EnterEmailId();
		login.clickOnContButton();
		login.EnterPassword();
		login.clickOnLogInButton();
       // Assert.assertEquals(login.TrelloWorspaceTitle,"Trello Workspace");

	}
	
	@Test
	public void clickOnCreateNewBoard()
	{
		login.CilckOnBoard();
		login.createHeadBoardButton();
		login.createBoardTitle();
		login.createBoard();
		//created First card
		login.clickOnAddAList();
		login.addListTitle();
		login.clickOnAddList();
		login.clickOnAddCard();
		login.addCardName();
		login.clickOnCreateNewCardOnList();
		
		//create second card
		login.clickOnAddAList();
		login.addListBTitle();
		login.clickOnAddList();
		
		//Drag and drop cardA to List B
		Actions action=new Actions(KeyWord.driver);
		 action.dragAndDropBy(login.CardALoc, 610, 412);
		 action.build();
		 action.perform();
		
	}

	
	@Ignore
	@Test
	public void createBoard() {
		
		// TODO Auto-generated method stub
		
       launcUrlSelf();

	}

}
