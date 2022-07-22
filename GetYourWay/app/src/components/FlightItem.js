import '../App.css';

const FlightItem = ({flight}) => {

    return (
        <div className="flightContainer">
             <div className="flight">
                <p className="departTime">{flight.departTime.slice(0, flight.departTime.length - 3)}</p>
                <p className="departure">{flight.departure}</p>
                <p className="arrival">{flight.arrival}</p>
                <p className="arrivalTime">{flight.arrivalTime.slice(0, flight.arrivalTime.length - 3)}</p>
            </div>

            <div className="addFlight">

            </div>
        </div>
    )

}

export default FlightItem;