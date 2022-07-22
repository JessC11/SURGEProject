import {useState, useEffect} from 'react';
import FlightItem from '../components/FlightItem';
import Navbar from '../components/Navbar';

const Flights = () => {

    const [flights, setFlights] = useState([]);

    useEffect(() => {
          const requestOptions = {
             method: 'GET',
             headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
              }
          };

          fetch('http://localhost:8080/flights' , requestOptions)
          .then(response => response.json())
          .then(result=>{
              setFlights(result)
          })
    }, [])

    return (
        <div>
            {flights.map((elem) => {
                return <FlightItem flight={elem}/>
            })}
        </div>
    )

}

export default Flights;