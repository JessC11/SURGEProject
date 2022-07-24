import {FontAwesomeIcon} from '@fortawesome/react-fontawesome';
import { faPlaneDeparture, faPlaneArrival } from '@fortawesome/free-solid-svg-icons';
import {useEffect, useState} from 'react';

const Trip = ({data, index}) => {

    const flightRows = data.list.map((elem, index) =>
        <FlightRow key={index} data={elem}/>
    );

    return (
    <div>
    <br />
        <div className="card">
          <div className="card-body">
            <TripName name={data.list[0].destination}/>
            {flightRows}
          </div>
        </div>
    </div>
    )
}

function FlightTime({flightTime}) {
return (
    <div className="col-md-3">
        <h4 className="text-center">{flightTime}</h4>
    </div>
    )
}

function AirportDetails({data}) {
return (
        <div className="col-md-8">
            <h4 className="text-center">{data.origin} > {data.destination}</h4>
        </div>
    )
}

function PlaneIcon({isDeparting}){

const icon = isDeparting ? faPlaneDeparture : faPlaneArrival ;

return(
        <div className="col-md-2">
            <div className="text-center">
                <h4><FontAwesomeIcon icon={icon} /></h4>
            </div>
        </div>
)
}

const FlightRow = ({data, index}) =>{

return(
    <div className="row pt-3">
        <FlightTime flightTime={data.departTime}/>
        <div className = "col">
            <div className="row">
                <PlaneIcon isDeparting={true}/>
                <AirportDetails data={data}/>
                <PlaneIcon isDeparting={false}/>
            </div>
        </div>
        <FlightTime flightTime={data.arriveTime}/>
    </div>
)}

function TripName({name}){
return(
    <div className="row">
        <div className="col">
            <h1 className="text-center p-3">{name} Trip 05/08/22 - 12/08/22</h1>
        </div>
    </div>
)}

export default Trip;