Feature: Manage Address

Background: user is successfully launch application
Given user open "chrome" browser with exe as "D:\Software Testing\Selenium Real Flipkart Project\Flipkart\src\test\resources\DRIVERS\chromedriver.exe"
Given user open url as "http://www.flipkart.com"
Given user close initial window
Given user mouse hover on Login
Given user click on My Profile
When user enter "7276836672" as Mobile Number
When user enter "7276836672@123" as Password
When user click on Login

@RegressionTest
Scenario Outline: validate manage address functionality
Given user click on manage addresses
Given user click on Add a New Address
When user enter <name> as name
When user enter <MobNumber> as MobNumber
When user enter <Pincode> as Pincode
When user enter <Locality> as Locality
When user enter <Address> as Address
When user select address type as Home
When user click on save
Then validate for address

Examples:
|name|MobNumber|Pincode|Locality|Address|
|Ravi|7276836672|414111|Chetna colony|chetna colony,navnagapur|
|anket|7276836672|414111|dosti chowk|wadgaon gupta|
|sanket|7276836672|414111|dangat mala|bolhegaon|
|kiran|7276836672|414111|nagapur chowk|pimpalgaon|




