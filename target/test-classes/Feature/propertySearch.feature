Feature: Property Search on NoBroker
Scenario: User search for property
 
Given The user is on NoBroker website homepage
When The user click on buy button
And The user select <"<Location>"> in the search field
And The user enters <"<Locality>"> in the search bar
And The user selects <"<ProjectType>"> from options 
And The user selects <"<PlotType>"> from offers
And The user click on search button
Then The user should be on property list page

Examples:
| Location  | Locality    | ProjectType | PlotType             |
| Bangalore | Indiranagar | Full House  | New Builder Projects |
              