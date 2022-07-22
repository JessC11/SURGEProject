import '../App.css';
import departLogo from '../img/departures.png';
import arriveLogo from '../img/landing.png';
import facebookLogo from '../img/facebook.png';
import instagramLogo from '../img/instagram.png';
import twitterLogo from '../img/twitter.png';

const FlightItem = ({departure, departTime, arrival, arrivalTime}) => {

    function openURL(url) {
        window.open(url, '_blank', 'noopener,noreferrer');
    }

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

            <div className="sharingContainer">
                <h3>Share Your Surge Travel Plans</h3>
                   <img className="facebookImg" src = {facebookLogo} onClick={() => openURL('https://facebook.com')}/>
                   <img className="instagramImg" src = {instagramLogo} onClick={() => openURL('https://instagram.com')}/>
                   <img className="twitterImg" src = {twitterLogo} onClick={() => openURL('https://twitter.com')}/>
            </div>
        </div>
    )

}

export default FlightItem;