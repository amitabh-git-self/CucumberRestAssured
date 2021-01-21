Feature:
    Verify Get Pet result set using REST-Assured

    Scenario: Verify the Get Response Body
        Given We do a GET call to "/pet/petId"
        And We pass petId as "777"
        Then We Assert the response body for status as "available"