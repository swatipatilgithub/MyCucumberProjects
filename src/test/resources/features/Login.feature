Feature: Login the page

  @Regression
  Scenario Outline: Login the page
    Given launch browser
    When user enter name "<Name>"
    And user enter email "<Email>"
    And user enter currentaddress "<CurrentAddress>"
    And user enter permanentaddress "<PermanentAddress>"
    And user click on submit button
    Then user submission successfully

    Examples: 
      | Name    | Email             | CurrentAddress | PermanentAddress |
      | Swati   | swati87@gmail.com | Mahad          | Kolhapur         |
      | Gajanan | Pqrst91@gmail.com | Pune           | Kolhapur         |
          
