Feature: Login
  In order to login to system
  As a Admin
  I need to input email and password
  
   Scenario Outline: Test validate login
   	Given I am on login page
    When I input email "<email>"
    And I input password "<password>"
    And I click on Login button
    Then I should see error message "<message>"

    Examples:
    |email|password|message|
    |       |          |Tên đăng nhập không được để trống.|
    |admin  |          |Mật khẩu không được để trống.|
    |       |12345678  |Tên đăng nhập không được để trống.|
    |admin  |12345678a |Tên tài khoản hoặc mật khẩu không đúng.|
    |admin1 |12345678  |Tên tài khoản hoặc mật khẩu không đúng.|
  
  Scenario: Redirect to Forgot password page
  	Given I am on login page
    When I click on Forgot password link
    Then I should see current title "VNEC02 | Reset Password"

  Scenario: Login successful when input correct email and password
  	Given I am on login page
    When I input email "admin"
    And I input password "12345678"
    And I click on Login button
    Then I should see dashboard title "Tổng quan"
