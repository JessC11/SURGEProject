import {FontAwesomeIcon} from '@fortawesome/react-fontawesome';
import { faPlaneDeparture } from '@fortawesome/free-solid-svg-icons';

const Trip = ({text}) => {
    return (
    <div>
    <br />
        <div className="card">
          <div className="card-body">
            <TripName text={text}/>
            <FlightRow />
            <FlightRow />
          </div>
        </div>
    </div>
    )
}

function FlightTime() {
return (
    <div className="col-md-3">
        <h4 class="text-center">05/08/22 10:25</h4>
    </div>
    )
}

function AirportDetails() {
return (
        <div className="col-md-2">
            <h4 class="text-center">DBV > MAN</h4>
        </div>
    )
}

function PlaneIcon(){
return(
        <div className="col-md-2">
            <div className="text-center">
                <h4><FontAwesomeIcon icon={faPlaneDeparture} /></h4>
            </div>
        </div>
)
}

function FlightRow(){
return(
    <div className="row pt-3">
        <FlightTime />
        <PlaneIcon />
        <AirportDetails />
        <PlaneIcon />
        <FlightTime />
    </div>
)}

function TripName({text}){
return(
    <div className="row">
        <div className="col">
            <h1 class="text-center p-3">{text} 05/08/22 - 12/08/22</h1>
        </div>
    </div>
)}

export default Trip;