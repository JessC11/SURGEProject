import {useState, useEffect} from 'react';
import FlightItem from '../components/FlightItem';
import Navbar from '../components/Navbar';
import { useSearchParams } from 'react-router-dom';

const Flights = () => {

    const [flights, setFlights] = useState([]);
    const [searchParams, setSearchParams] = useSearchParams();

    useEffect(() => {
        let depart = searchParams.get("depart");
        let arrive = searchParams.get("arrive");
          const requestOptions = {
             method: 'GET',
             headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
              }
          };
          let address = 'http://localhost:8080/flights/' + depart + '/' + arrive;
          fetch(address , requestOptions)
          .then(response => response.json())
          .then(result=>{
              setFlights(result)
          })
    }, [])

    return (
        <div>
            {flights.map((flight) => {
                return <FlightItem departure={flight.departure} departTime={flight.departTime}
                            arrival={flight.arrival} arrivalTime={flight.arrivalTime}/>
            })}
        </div>
    )

}

export default Flights;