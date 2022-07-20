insert into customer (email, password_hash, first_name, last_name)
values 	("sam@skysurge.com", "wefkwejrvkr", "Sam", "Skinner"),
		("ryan@skysurge.com", "ergnregoeri", "Ryan", "Brennan"),
		("emma@skysurge.com", "4ionfowinf", "Emma", "Naylor"),
		("jess@skysurge.com", "wfeion2o4ifn", "Jess", "Cawdron"),
		("user1@gmail.com", "3l42fmimw3", "User1", "One"),
		("user2@gmail.com", "f3efjnjfklnsd", "User2", "Two"),
		("user3@gmail.com", "skjnvdklnv", "User3", "Three"),
		("user4@gmail.com", "sjkdcnklsdncvl", "User4", "Four"),
		("user5@gmail.com", "wkjnklwevnlknw", "User5", "Five"),
		("user6@gmail.com", "jkrefnveklnv", "User6", "Six");

insert into image (image)
values ("https://assets-prd.ignimgs.com/2022/01/14/gameofthrones-allseasons-sq-1642120207458.jpg"),
("https://assets-prd.ignimgs.com/2022/01/14/gameofthrones-allseasons-sq-1642120207458.jpg"),
("https://flxt.tmsimg.com/assets/p8282918_b_v13_bk.jpg"),
("https://m.media-amazon.com/images/I/91NNuqAp73L._AC_SL1500_.jpg"),
("https://flxt.tmsimg.com/assets/p185846_b_h9_ad.jpg"),
("https://flxt.tmsimg.com/assets/p20492218_b_h9_aa.jpg"),
("https://m.media-amazon.com/images/M/MV5BOTdlNzdlZWQtZTU5MS00N2RkLWJjYTAtYzY5NWEwMmMyZDM1XkEyXkFqcGdeQXVyNDk3ODk4OQ@@._V1_.jpg"),
("https://image.tmdb.org/t/p/original//reEMJA1uzscCbkpeRJeTT2bjqUp.jpg");

insert into programme (programme, image_id)
values ("Game of Thrones", 1),
("The Walking Dead", 2),
("Stranger Things", 3),
("Breaking Bad", 4),
("Squid Game", 5),
("Ted Lasso", 6),
("Money Heist", 7);

insert into destination (destination, programme_id, info)
values ("Split", 1, "Split is the second-largest city of Croatia, the largest city in Dalmatia and the largest city on the Croatian coast. It lies on the eastern shore of the Adriatic Sea and is spread over a central peninsula and its surroundings. An intraregional transport hub and popular tourist destination, the city is linked to the Adriatic islands and the Apennine Peninsula."),
 ("Dubrovnik", 1, "Dubrovnik is a city on the Adriatic Sea in the region of Dalmatia, in southern Croatia. It is one of the most prominent tourist destinations in the Mediterranean Sea, a seaport and the centre of Dubrovnik-Neretva County. Situated in an exclave, it is connected to the rest of the country by the Pelješac Bridge. Its total population is 42,615. In 1979, the city of Dubrovnik was added to the UNESCO list of World Heritage Sites in recognition of its outstanding medieval architecture and fortified old town."),
 ("Atlanta", 2, "Atlanta is the capital and most populous city of the U.S. state of Georgia. With a population of 498,715 living within the city limits, it is the eighth-most populous city in the Southeast and 38th most populous city in the United States according to the 2020 U.S. census. It is the core of the much larger Atlanta metropolitan area, which is home to 6,144,050 people, making it the eighth-largest metropolitan area in the United States. It is the seat of Fulton County, the most populous county in Georgia. Situated among the foothills of the Appalachian Mountains at an elevation of just over 1,000 feet above sea level, it features unique topography that includes rolling hills, lush greenery, and the most dense urban tree coverage of any major city in the United States."),
 ("Vilnius", 3, "Vilnius is the capital and largest city of Lithuania, with a population of 592,389 as of 2022. The population of Vilnius's functional urban area, which stretches beyond the city limits, is estimated at 718,507, while according to the Vilnius territorial health insurance fund, there were 732,421 permanent inhabitants as of October 2020 in Vilnius city and Vilnius district municipalities combined. Vilnius is situated in southeastern Lithuania and is the second-largest city in the Baltic states, but according to the Bank of Latvia is expected to become the largest in 2025.It is the seat of Lithuania's national government and the Vilnius District Municipality."),
 ("New Mexico", 4, "New Mexico is a state in the Southwestern United States. It is one of the Mountain States of the southern Rocky Mountains, sharing the Four Corners region of the western U.S. with Utah, Colorado, and Arizona, and bordering Texas to the east and southeast, Oklahoma to the northeast, and the Mexican states of Chihuahua and Sonora to the south. The state capital is Santa Fe, which is the oldest capital in the U.S., founded in 1610 as the government seat of Nuevo México in New Spain; the largest city is Albuquerque."),
 ("Daejon", 5, "Daejeon is South Korea's fifth-largest metropolis, with a population of 1.5 million as of 2019. Located in the central region of South Korea alongside forested hills and the Geum River, the city is known both for its technology and research institutions, and for celebrating its natural environment, with most mountains, hot springs, and rivers freely open for public use.Daejeon serves as a hub of transportation for major rail and road routes, and is approximately 50 minutes from the capital, Seoul, by KTX or SRT high speed rail."),
 ("London", 6, "London is the capital and largest city of England and the United Kingdom, with a population of just over 9 million. It stands on the River Thames in south-east England at the head of a 50-mile (80 km) estuary down to the North Sea, and has been a major settlement for two millennia. The City of London, its ancient core and financial centre, was founded by the Romans as Londinium and retains boundaries close to its medieval ones. Since the 19th century, the name London has also referred to the metropolis around this core, historically split between the counties of Middlesex, Essex, Surrey, Kent, and Hertfordshire, which largely comprises Greater London, governed by the Greater London Authority. The City of Westminster, to the west of the City of London, has for centuries held the national government and parliament."),
 ("Madrid", 7, "Madrid is the capital and most populous city of Spain. The city has almost 3.4 million inhabitants and a metropolitan area population of approximately 6.7 million. It is the second-largest city in the European Union (EU), and its monocentric metropolitan area is the second-largest in the EU. The municipality covers 604.3 km2 (233.3 sq mi) geographical area.");


insert into flight (origin, destination_id, depart_time, arrive_time)
values ("Manchester", 3, '2022-08-23 10:35:00', '2022-08-23 12:45:00'),
("Leeds", 2, '2022-09-12 01:15:00', '2022-09-12 04:40:00'),
("London", 2, '2022-10-01 10:50:00', '2022-10-01 11:40:00'),
("Leeds", 6, '2022-08-01 11:50:00', '2022-08-01 14:40:00'),
("Birmingham", 2, '2023-06-04 12:50:00', '023-06-04 15:40:00'),
("Manchester", 4, '2022-07-19 13:50:00', '2022-07-19 16:40:00'),
("Bristol", 6, '2022-07-20 14:50:00', '2022-07-20 17:40:00'),
("Angelsea", 7, '2022-07-20 15:50:00', '2022-07-20 18:40:00'),
("Rotherham", 5, '2022-07-20 16:50:00', '2022-07-20 19:40:00'),
("Leeds", 3, '2022-07-20 17:50:00', '2022-07-20 20:40:00');

insert into trip (customer_id)
values (1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10);

insert into journey (flight_id, trip_id)
values (1, 1),
(2, 3),
(3, 5),
(4, 7),
(5, 9),
(6, 2),
(7, 4),
(8, 6),
(9, 8),
(10, 10);