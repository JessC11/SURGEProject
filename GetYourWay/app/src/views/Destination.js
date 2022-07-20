import {useEffect, useState} from 'react';
import { useSearchParams } from 'react-router-dom';

const Destination = () => {
//    const [data, setData] = useState('');
    const [city, setCity] = useState('');
    const [searchParams, setSearchParams] = useSearchParams();

    // on page load, get query param
    useEffect(() => {
        let param = searchParams.get("city");
        setCity(param);
        console.log(param)

        // const requestOptions = {
        //     method: 'GET',
        //     headers: { 'Content-Type': 'application/json' }
        // };
        // fetch('http://localhost:8080' + data.linkTo, requestOptions)
        // .then(response => response.json())
        // .then(result=>{
        //     setData(result)
        //     console.log(result)
        // })
    }, [])

    return (
        <div>
            {city}
        </div>
    )
}

export default Destination;