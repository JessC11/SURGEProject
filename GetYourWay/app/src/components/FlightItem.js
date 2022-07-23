import '../App.css';
import departLogo from '../img/departures.png';
import arriveLogo from '../img/landing.png';

const FlightItem = ({departure, departTime, arrival, arrivalTime, index, isBooking}) => {

    // TODO: need times in DateTime, need persistent user info
    function onAdd() {
        let id = 1;
        const flight = {
            origin: departure,
            departTime: departTime,
            arrive: arrival,
            arriveTime: arrivalTime
        }
        const requestOptions = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
            },
            body: JSON.stringify(flight)
        };
        let address = 'http://localhost:8080/flights/' + id;
        fetch(address , requestOptions)
        .then(response => response.json())
        .then(result=>{
            console.log(result)
        })
    }

    return (
        <>
            <div className="flightContainer" style={{gridColumn: '1', gridRow: index}}>
                <p className="departTime">{departTime}</p>
                <p className="departure">{departure}</p>
                <img src={departLogo} className="departImg"/>
                <p className="arrive">{arrival}</p>
                <p className="arriveTime">{arrivalTime}</p>
            </div>
            {isBooking && <div onClick={onAdd} style={{gridColumn: '2', gridRow: index, height: '75px', width: '75px', display: 'grid', alignItems: 'center'}}>
                <p className="addText">Add Me to Your Journey</p>
            </div>}
        </>
    )

}

export default FlightItem;