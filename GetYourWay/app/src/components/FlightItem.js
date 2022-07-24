import '../App.css';
import departLogo from '../img/departures.png';
import arriveLogo from '../img/landing.png';

import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';
import IconButton from '@mui/material/IconButton';
import CheckCircleOutlineIcon from '@mui/icons-material/CheckCircleOutline';

import {useState} from 'react';

const FlightItem = ({departure, departTime, arrival, arrivalTime, index, isBooking}) => {

    const [isAdded, setIsAdded] = useState(false);

    // TODO: need times in DateTime, need persistent user info
    function onAdd() {

        setIsAdded((prev) => !prev);

//        let id = 1;
//        const flight = {
//            origin: departure,
//            departTime: departTime,
//            arrive: arrival,
//            arriveTime: arrivalTime
//        }
//        const requestOptions = {
//            method: 'POST',
//            headers: {
//                'Content-Type': 'application/json',
//                'Access-Control-Allow-Origin': '*',
//                'Access-Control-Allow-Headers': '*'
//            },
//            body: JSON.stringify(flight)
//        };
//        let address = 'http://localhost:8080/flights/' + id;
//        fetch(address , requestOptions)
//        .then(response => response.json())
//        .then(result=>{
//            console.log(result)
//        })
    }

    let d = new Date(departTime);
    let depTime = d.toString().slice(0, 33);
    d = new Date(arrivalTime);
    let arrTime = d.toString().slice(0, 33);

    return (
        <>
            <div className="flightContainer" style={{gridColumn: '1', gridRow: index}}>
                <p className="departTime">{depTime}</p>
                <p className="departure">{departure}</p>
                <img src={departLogo} className="departImg"/>
                <p className="arrive">{arrival}</p>
                <p className="arriveTime">{arrTime}</p>
            </div>

            {isBooking &&
                <IconButton onClick={onAdd} aria-label="add" style={{gridColumn: '2', gridRow: index, height: '50px', width: '50px'}}>
                    {!isAdded && <AddCircleOutlineIcon style={{height: '40px', width: '40px'}}/>}
                    {isAdded && <CheckCircleOutlineIcon style={{height: '40px', width: '40px'}}/>}
                  </IconButton>
            }
        </>
    )

}

export default FlightItem;