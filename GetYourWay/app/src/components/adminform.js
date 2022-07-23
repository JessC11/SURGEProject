import React, { useEffect, useState } from "react";
import { ThemeConsumer } from "react-bootstrap/esm/ThemeProvider";
import "../adminform.css";

const AdminForm = () => {

    const [destination, setDestination] = useState('');
    const [info, setInfo] = useState('');
    const [programme_id, setProgrammeId] = useState("Game of Thrones")

    const handleSubmit = (e) => {
        e.preventDefault();
        const newDestination = {destination, info, programme_id}
        let address = 'http://localhost:8080/newdestination'
        fetch(address, {
            method: 'POST',
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(newDestination)
        }) .then(() => {
            console.log("New destination added");
        })


    }

    return (
        <div>
            <div className="adminForm">
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
                <label>Programme_id</label>
                <select
                value={programme_id}
                onChange={(e) => setProgrammeId(e.target.value)}
                >
                    <option value="Game of Thrones">Game of Thrones</option>
                    <option value="Spiderman">Spiderman</option>
                </select>
                <button>Add new Destination</button>
                <p>{ destination }</p>
                <p>{ info }</p>
                <p>{ programme_id }</p>
            </form>
            </div>
        </div>
    );
}

export default AdminForm;