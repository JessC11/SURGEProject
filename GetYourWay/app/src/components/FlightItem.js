import '../App.css';
import departLogo from '../img/departures.png';
import arriveLogo from '../img/landing.png';

const FlightItem = ({departure, departTime, arrival, arrivalTime}) => {

    return (
        <div>
            <div className="flightContainer">
                <p className="departTime">{departTime}</p>
                <img className="departImg" src={departLogo}/>
                <p className="departure">{departure}</p>
                <p className="symbol">></p>
                <p className="arrive">{arrival}</p>
                <img className="arriveImg" src={arriveLogo}/>
                <p className="arriveTime">{arrivalTime}</p>
            </div>
        </div>
    )

}

export default FlightItem;