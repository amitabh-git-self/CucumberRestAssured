Feature:
  Verify Put Pet result set using REST-Assured

  Scenario: Verify the Put Response Body
    Given We do a Put call to "/pet/petId"
    And We pass status as "sold"
    Then We Assert the update of the status attribute