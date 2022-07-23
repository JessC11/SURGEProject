import '../App.css';
import sun from '../img/sun.png';
import cloudy from '../img/cloudy.png';
import rainy from '../img/rainy.png';
import snowy from '../img/snowy.png';
import storm from '../img/storm.png';

const Weather = ({data, index}) => {
    return (
        <div className={"weather-"+index}>
            {data.tempC >= 20 && <img className="sun" src={sun}/>}
            {data.tempC < 20 && data.tempC >= 10 && <img className="cloudy" src={cloudy}/>}
            {data.tempC < 10 && <img className="rainy" src={rainy}/>}

            {data.conditionCode === 1000 && <img className="sun" src={sun}/>}
            {(data.conditionCode === 1003 || data.conditionCode === 1009) && <img className="cloudy" src={cloudy}/>}
            {data.conditionCode === 1066 && <img className="rainy" src={snowy}/>}
            {data.conditionCode === 1087 && <img className="rainy" src={storm}/>}
            {data.conditionCode === 1183 && <img className="rainy" src={rainy}/>}


            <div className="info">
                <p>Temperature: {data.tempC}&deg;c</p>
                <p>Humidity: {data.humidity}%</p>
                <p>Wind: {data.windMph}mph</p>
            </div>
        </div>
    )
}

export default Weather;