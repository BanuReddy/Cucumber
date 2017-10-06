Feature: Autotools login

  Scenario: login the facebook account
    Given userid is "banureddyqa@gmail.com" and password "Anuram7"
    When user clicks on Sign in button
    Then user is logged in
    
   Scenario: to open my profile
    Given user is logged in
    When user clicks on "Banu Reddy" 
    Then click "My profile"
    
    
    
    
