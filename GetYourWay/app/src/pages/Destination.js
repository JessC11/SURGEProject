import {useEffect, useState} from 'react';
import { useSearchParams } from 'react-router-dom';
import WeatherItem from '../components/WeatherItem';
import Map from '../components/Map';

const Destination = () => {
//    const [data, setData] = useState('');
    const [city, setCity] = useState('');
    const [searchParams, setSearchParams] = useSearchParams();
    const [weather, setWeather] = useState([]);

    // on page load, get query param
    useEffect(() => {
        let param = searchParams.get("city");
        setCity(param);
        console.log(param)

        const requestOptions = {
             method: 'GET',
             headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
              }
          };
          let address = 'http://localhost:8080/forecast/' + param;
          fetch(address , requestOptions)
          .then(response => response.json())
          .then(result=>{
              setWeather(result)
              console.log(result)
          })
    }, [])

    return (
    <div>
        <div className="weatherContainer">
            {weather.map((elem, index) => {
                return <WeatherItem data={elem} index={index} key={index}/>
            })}
        </div>
        <div>
            <Map />
        </div>
    </div>
    )
}

export default Destination;