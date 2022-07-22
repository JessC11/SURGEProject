import {useEffect, useState} from 'react';
import { useSearchParams } from 'react-router-dom';
import FlightItem from '../components/FlightItem';

const Journey = () => {

    const [data, setData] = useState([])
    const [searchParams, setSearchParams] = useSearchParams();

    useEffect(() => {
        let id = searchParams.get("id");
        const requestOptions = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
            }
        };
        let address = 'http://localhost:8080/trip/' + id;
        fetch(address , requestOptions)
        .then(response => response.json())
        .then(result=>{
            console.log(result.journey)
            setData(result.journey)
        })
    }, [])

    return (
        <div>
            {data.map((journey, index) => {
                let d = new Date(journey.flight.departTime);
                let depTime = d.toString().slice(0, 33);
                console.log(depTime)
                d = new Date(journey.flight.arriveTime);
                let arrTime = d.toString().slice(0, 33);
                return <FlightItem departure={journey.flight.origin} departTime={depTime}
                            arrival={journey.flight.destination.destination} arrivalTime={arrTime} key={index}/>
            })}
        </div>
    )

}

export default Journey;