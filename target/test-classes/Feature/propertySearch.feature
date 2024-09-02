Feature: Property Search on NoBroker
Background:
Given The user is on NoBroker website homepage

Scenario: Validate locality error message on Buy page

When The user click on buy button
And  The user select Location from drop down as <"Bangalore">
And The user click on search button
Then The the error message should be display

Scenario: Property Search on Buy page

When The user click on buy button
And  The user select Location from drop down as <"Bangalore">
And The user enter one Locality in search field as <"Indiranagar">
And The user select one nearby Locality1 from drop down as <"Domlur">
And The user select second nearby Locality2 from drop down as <"Halasuru">
Then The user click search button

Scenario: Validate user cannot enter more than three localities on Buy page

When The user click on buy button
And  The user select Location from drop down as <"Bangalore">
And The user enter one Locality in search field as <"Indiranagar">
And The user select one nearby Locality1 from drop down as <"Domlur">
And The user select second nearby Locality2 from drop down as <"Halasuru">
Then The user click search button
And Verify that the search results are displayed based on the entered localities
Then Verify that the system prevents the entry of more than three localities

Scenario: Navigate to the plot or land property list page

When The user click on buy button
And The user select Location from drop down as <"Bangalore">
And The user enter one Locality in search field as <"Indiranagar">
And The user select PlotType from options as <"Land/Plot">
Then The user click search button

Scenario Outline: Navigate to the full house property list page

When The user click on buy button
And The user select <"<Location>"> from drop down
And The user enters <"<Locality>"> in the search field
And The user selects <"<PlotType>"> from options
And The user selects <"<BHKType>"> from drop down
And The user selects <"<PropertyStatus>"> from property drop down
And The user selects <"<ProjectType>"> from offers
And The user click on the search button
Then The user should be on property list page

Examples:
| Location  | Locality    | PlotType   | BHKType | PropertyStatus | ProjectType          | 
| Bangalore | Indiranagar | Full House | 2BHK    | Ready          | New Builder Projects | 



