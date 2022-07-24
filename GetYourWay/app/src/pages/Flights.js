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
        let date = searchParams.get("date");
          const requestOptions = {
             method: 'GET',
             headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
              }
          };
          let address = 'http://localhost:8080/flights/' + depart + '/' + arrive + '/' + date;
          fetch(address , requestOptions)
          .then(response => response.json())
          .then(result=>{
              setFlights(result)
              console.log(result)
          })
    }, [])

    return (
        <div className="flightListContainer">
            {flights.map((flight, index) => {
                return <FlightItem departure={flight.departure} departTime={flight.departTime}
                            arrival={flight.arrival} arrivalTime={flight.arrivalTime} index={index+1}
                            isBooking={true}/>
            })}
        </div>
    )

}

export default Flights;