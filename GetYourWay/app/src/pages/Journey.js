import {useEffect, useState} from 'react';
import { useSearchParams } from 'react-router-dom';
import FlightItem from '../components/FlightItem';
import facebookLogo from '../img/facebook.png';
import instagramLogo from '../img/instagram.png';
import twitterLogo from '../img/twitter.png';

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

    function openURL(url) {
        window.open(url, '_blank', 'noopener,noreferrer');
    }

    return (
        <div>
            <div className="journeyContainer">
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
            <div className="sharingContainer">
                <h3>Share Your Surge Travel Plans</h3>
                   <img className="facebookImg" src = {facebookLogo} onClick={() => openURL('https://facebook.com')}/>
                   <img className="instagramImg" src = {instagramLogo} onClick={() => openURL('https://instagram.com')}/>
                   <img className="twitterImg" src = {twitterLogo} onClick={() => openURL('https://twitter.com')}/>
            </div>
        </div>
    )

}

export default Journey;