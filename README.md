# VehicleDatabase
This is the vehicle database I created.
This program takes in text file containing information of various vehicle types and stores the data for manipulation. 
Each vehicle must be represented as such: 
---
(C: Car, T: Truck, MC: Motorcycle, B: Bus, or CT: Commercial Truck), 
(Vehicle make), 
(Vehicle model), 
(Vehicle weight), 
(Vehicle color), 
(Vehicle MPG), 
(Vehicle year), 
---
In adition to these categories additonal categories were added for specific vehicle types such as car seating amount, truck hauling capacity, etc.
---
# example text file
---
C Tesla ModelS 2700 Cobalt 2020 75 4
C Ford Fiesta 2600 Red 2021 29 2
C Ford Mustang 2950 Silver 2017 25 4
C Saturn SL2 2600 Blue 2002 24 5
T Ford F150 3200 Red 2019 22 3 1300
MC Honda CBR1000RR 450 Red-Black 2021 65
MC Honda CBR600RR 375 Black 2020 70
MC Honda Metropolitan 180 Pearl 2018 100
MC Honda PCX150 225 Blue-Black 2019 85
B NewFlyer LFSeries 30000 White 2021 8 45
CT Mercedes MB2000 35000 Blue 2008 6 4 45000 true
CT International Pioneer 28000 Red 2004 4 4 55000 true
B Gillig Advantage 27000 Red 2021 8 45
B Gillig Articulated 34000 Red 2021 5 65
B Neoplan LowFloor 31000 White 2003 8 45
CT Freightliner Canyon 25000 Silver 2022 10 2 60000 true
CT Freightliner Urban 17000 White 2022 12 2 12000 false

The example textfile "VDB.txt" can be used to compile this program
