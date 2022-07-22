import '../App.css';
import sun from '../img/sun.png';
import cloudy from '../img/cloudy.png';
import rainy from '../img/rainy.png';

const Weather = ({data, index}) => {
    return (
        <div className={"weather-"+index}>
            {data.tempC >= 20 && <img className="sun" src={sun}/>}
            {data.tempC < 20 && data.tempC >= 10 && <img className="cloudy" src={cloudy}/>}
            {data.tempC < 10 && <img className="rainy" src={rainy}/>}

            <div className="info">
                <p>Temperature: {data.tempC}&deg;c</p>
                <p>Humidity: {data.humidity}%</p>
                <p>Wind: {data.windMph}mph</p>
            </div>
        </div>
    )
}

export default Weather;