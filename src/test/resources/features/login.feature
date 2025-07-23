Feature:Login Feature

Scenario:User User should be Able to Sign In Successfully
	Given user is on the shopping site
	When users enters username
	And user enters the password
	And clicks on the Sign in button
    Then user should be redirected to accounts page
      
        