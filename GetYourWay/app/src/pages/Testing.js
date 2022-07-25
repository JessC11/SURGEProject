import {useState, useEffect} from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Trip from '../components/Trip'
import { useSearchParams } from 'react-router-dom';

const Testing = () => {

    const [trips, setTrips] = useState([]);

    useEffect(() => {
        // Need to actually link this up so it shows the trips of this customer not always customer 1
          let id = 1;
          const requestOptions = {
             method: 'GET',
             headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
              }
          };
          let address = 'http://localhost:8080/trips/' + id;
          fetch(address , requestOptions)
          .then(response => response.json())
          .then(result=>{
              setTrips(result);
          })
    }, [])

    const tripsObj = [
                         {
                             flights: [
                                {
                                     origin: "Manchester",
                                     departTime: "2022-08-23 13:45:00",
                                     arriveTime: "2022-08-23 15:50:00",
                                     destination: "Dubrovnik"
                                },
                                {
                                     origin: "Dubrovnik",
                                     departTime: "2022-08-30 06:15:00",
                                     arriveTime: "2022-08-30 08:25:00",
                                     destination: "Manchester"
                                }
                             ]
                         },
                         {
                             flights: [
                                {
                                     origin: "Leeds",
                                     departTime: "2022-09-01 13:45:00",
                                     arriveTime: "2022-09-01 13:45:00",
                                     destination: "Vilnius"
                                },
                                {
                                     origin: "Vilnius",
                                     departTime: "2022-09-04 22:35:00",
                                     arriveTime: "2022-09-05 01:15:00",
                                     destination: "Paris"
                                },
                                {
                                     origin: "Paris",
                                     departTime: "2022-09-10 12:00:00",
                                     arriveTime: "2022-09-10 13:00:00",
                                     destination: "Leeds"
                                }
                             ]
                         }
                     ]

    const tripsObject = trips.map((elem, index) =>
        <Trip key={index} data={elem} />
    );

    return (
        <div className="container">
            {tripsObject}
        </div>
    )

}

export default Testing;