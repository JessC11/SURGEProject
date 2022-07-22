import '../App.css';
import departLogo from '../img/departures.png';
import arriveLogo from '../img/landing.png';

const FlightItem = ({departure, departTime, arrival, arrivalTime}) => {

//<div className="flight">
//                <div className="departContainer">
//                    <p className="departTime">{departTime}</p>
//                </div>
//                <img className="departImg" src={departLogo}/>
//                <p className="departure">{departure}</p>
//                <p className="departure">></p>
//                <p className="arrival">{arrival}</p>
//                <img className="arriveImg" src={arriveLogo}/>
//                <div className="arriveContainer">
//                    <p className="arrivalTime">{arrivalTime}</p>
//                </div>
//            </div>
//
//            <div className="addFlight">
//
//            </div>
    return (
        <div className="flightContainer">
            <p className="departTime">{departTime}</p>
            <img className="departImg" src={departLogo}/>
            <p className="departure">{departure}</p>
            <p className="symbol">></p>
            <p className="arrive">{arrival}</p>
            <img className="arriveImg" src={arriveLogo}/>
            <p className="arriveTime">{arrivalTime}</p>
        </div>
    )

}

export default FlightItem;