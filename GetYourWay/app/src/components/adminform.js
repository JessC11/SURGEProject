import React, { useEffect, useState } from "react";
import "../adminform.css";

const AdminForm = () => {

    const [destination, setDestination] = useState('');
    const [info, setInfo] = useState('');
    const [programmes, setProgrammes] = useState('[]');
    let [programmeId, setProgrammeId] = useState('');

    useEffect(() => {
        const requestOptions = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*'
              }
          };
         let getaddress = 'http://localhost:8080/programmes/';
         fetch(getaddress , requestOptions)
         .then(response => response.json())
         .then(result=>{
             setProgrammes(result)
             console.log(result)
         })
   }, [])

    const handleSubmit = (e) => {
        e.preventDefault();
        const newDestination = {destination, info, programmeId}
        console.log(newDestination);
        let address = 'http://localhost:8080/newdestination'
        fetch(address, {
            method: 'POST',
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(newDestination, programmeId)
        }) .then(() => {
            console.log("New destination added");
        })
    }

    let handleProgrammeChange = (e) => {
        setProgrammeId(parseInt(e.target.value))
      }

    return (
            <div className="adminForm">
                <h2>Add New Destination</h2>
            <form onSubmit={handleSubmit}>
                <label>Destination</label>
                <input
                type="text"
                required
                value={destination}
                onChange={(e) => setDestination(e.target.value)}
                />
                <label>Info</label>
                <textarea
                required
                value={info}
                onChange={(e) => setInfo(e.target.value)}
                />
                <label>Programme</label>
                <select onChange={handleProgrammeChange}> 
                <option value="Select a programme"> -- Select a programme -- </option>
                {Array.from(programmes).map((programmes) => 
                <option key={programmes.programmeId} value={programmes.programmeId}>{programmes.programme}</option>)}
                </select>
                <button>Add new Destination</button>
            </form>
            </div>
    );
}

export default AdminForm;