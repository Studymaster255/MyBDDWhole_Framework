Feature: compaire mobile

  Background: 
    Given user launch borwser
    And user opens flipcart.com
    And user cancles login popup
    Then user can view homepage

  Scenario: Compare same compani mobiles
    When user click on Mobile&Tablet
    And user click on electronics and samsung
    And click on SAMSUNG Galaxy A53
    And click on Compare and Compare
    And select another three mobiles
    Then add to cart who have maximum Reviews
    Then validate "Safe and Secure Payments. Easy returns. 100% Authentic products."

    Scenario: search tv buy button
    When user searches "tv smart tv 32" 
    Then click on first item 
    And click on buynow
    Then validate "Safe and Secure Payments. Easy returns. 100% Authentic products."