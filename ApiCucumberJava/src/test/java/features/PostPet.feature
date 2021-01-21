Feature:
    Verify POST Pet result set using REST-Assured

    Scenario: Verify Post a new available pet to the store and Assert new pet added.
        Given We do a POST call to "/pet"
        And We do a Post with petId as "777" and petName as "amitabh"
        Then We Assert the new pet added