import '../App.css';
import sun from '../img/sun.png';

const Weather = ({data}) => {
    return (
        <div className="weatherContainer">
            <div className="weather">
                <img className="sun" src={sun}/>

                <div className="info">
                    <p>Temperature: {data.tempC}&deg;c</p>
                    <p>Humidity: {data.humidity}%</p>
                    <p>Wind: {data.windMph}mph</p>
                </div>
            </div>
        </div>
    )
}

export default Weather;