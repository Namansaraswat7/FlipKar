# FlipKar
# FlipKar
Description:

Flipkart is starting a new vehicle rental service called FlipKar. In this service, we will rent different kinds of vehicles such as cars and bikes.

Features:

Rental service have multiple branches throughout the city.
Each branch has limited number of different kinds of vehicles. 
Each vehicle can be booked with a predefined price per unit time slot. For simplicity, current pricing model does not support dynamic pricing or update on prices based on seasonality.
Each vehicle can be booked in multiples of 1 hour time slot.

Requirements:

Onboard a new branch with available vehicle.
Onboard new vehicle(s) of existing type to a particular branch.
Rent vehicle for a time slot and a vehicle type (lowest price as the default choice of selection of vehicle, this should be extendable to any other strategy). While booking a vehicle if availability is not there, then it should fallback to another available branch, which is derived based on the vehicle selection strategy.
A system view should be made available, such as currently booked vehicles, available vehicles of all the branches.




Test cases: 
(Test-cases are defined for understanding feature requirements only. Please model it appropriately based on your service implementation)

add_branch(‘koramangala’, [“1 suv for Rs.12 per hour”, “3 sedan for Rs.10 per hour”, “3 bikes for Rs.20 per hour”]); 

add_branch(‘jayanagar’, [“3 sedan for Rs.11 per hour”, “3 bikes for Rs.30 per hour”, “4 hatchback for Rs.8 per hour”]);

add_branch(‘malleshwaram’, [“1 suv for Rs.11 per hour”, “10 bikes for Rs.3 per hour” , “3 sedan for Rs.10 per hour”]);

add_vehicle(‘koramangala’,  “1 sedan”);

 //add 1 sedan to koramangala
book_vehicle(‘suv’, 20th Feb 10:00 AM, 20th Feb 12:00 PM); 
// should book from malleshwaram.

rent_vehicle(‘suv’, 20th Feb 10:00 AM, 20th Feb 12:00 PM);
 // should book from koramangala.

rent_vehicle(‘suv’, 20th Feb 10:00 AM, 20th Feb 12:00 PM); 
//Should fail saying no vehicle.

print_system_view_for_time_slot(20th Feb 11:00 PM, 20th Feb 12:00 PM):

Output:
‘Koramangala’: 
All “suv” are booked.
1“sedan” is available for Rs.10
“bike” is available for Rs.20
‘Jayanagar’:
“sedan” is available for Rs.11
“bike” is available for Rs.30
“hatchback” is available for Rs.8
‘‘Malleshwaram’’:
All “suv” are booked.
“bike” is available for Rs.3
“sedan” is available for Rs.10



Objects / Entities

Branch
Vehicle  ,VehicleTypes
Booking, Booking Status 
Slot , slotStatus


UML Diagram 

![alt text](<Pasted Graphic 1.png>)
