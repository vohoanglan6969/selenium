
Feature: Forgot password test 

Scenario Outline: Verify when click forgot button
Given I am on page:"http://qldt.vnec02:8890/password/reset"
When I input email to reset:"<email>"
And I press forgot password button
Then I should see error message display:"<message>"

Examples:
|email|message|
|       |Email không được để trống.|
|hoanglan@|Trường Email phải là một địa chỉ email hợp lệ.|
|hoanglan102a@gmail.com|Không thể tìm thấy địa chỉ email này.|
|admin@admin.com|Chúng tôi đã gửi qua e-mail liên kết đặt lại mật khẩu của bạn!|

 