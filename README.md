# jwd-task1-travel_agency

		TRAVEL AGENCY
		--------------	
	
		START

	The application is launched from com/epam/travel_agency/view/ConsoleView.class
	
	During operation, two user requests are generated:

	1. Generate a list of tours that satisfy the parameters
	2. Sort the resulting list of tours.

		CREATING A LIST OF TOURS

	1. The list of tours is formed automatically based on the random 
    selection of the user
	from the available types and parameters.
	
	There is a choice:
	- random type of tour
	- random type of transport (several types can be selected)
	- the number of days of travel "FROM"
	- the number of days of travel "UNTIL"
	- random selection of the type of food (multiple choices are possible)

	During the selection of each user parameter, they are sequentially 
    written to a file Clients_wishes.txt

	This request is sent to the Controller, which sends it to the 
    CommandProvider, where based on the type of request
	the corresponding object of the class inheriting the Command interface 
    is selected to fulfill the request.

	During the execution of the request, a sequential reading from the 
    user's requirements file takes place.

	After reading the tour type, we turn to the ToureProvider, which 
    contains all objects of each type of tours.
	Depending on the choice, a list of all available tours of this type is 
    provided.

	Then all other parameters are read and the compliance of each tour is 
    checked for compliance with all requirements.
	A list is formed, which is given to the Response, which is returned to 
    the Controller, and from there to the user.

		SORTING THE LIST OF TOURS

	Next, a new request is generated in ConsoleView to sort the list 
    contained in Response. Repeated
	the whole sequence of actions, the object that executes the sorting 
    request is selected.

	Two types of sorting are possible:
	-by price
	-by the duration of the trip.

	The sorting type is selected randomly.
	The list is sorted and passed to Response, which is passed to Controller,
    and from there to ConsoleView.