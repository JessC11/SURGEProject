import React, { useEffect, useState } from "react";
import "../adminform.css";

const NewProgrammeForm = () => {

    const [programme, setProgramme] = useState('');
    const [image, setImage] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        const newProgramme = {programme, image}
        let address = 'http://localhost:8080/newprogramme'
        fetch(address, {
            method: 'POST',
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(newProgramme)
        }) .then(() => {
            console.log("New programme added");
        })
    }

    return (
            <div className="adminForm">
                <h2>Add New Programme</h2>
            <form onSubmit={handleSubmit}>
                <label>Programme Title</label>
                <input
                type="text"
                required
                value={programme}
                onChange={(e) => setProgramme(e.target.value)}
                />
                <label>Image HTTP Ref</label>
                <input
                type="text"
                required
                value={image}
                onChange={(e) => setImage(e.target.value)}
                />
                <button>Add new Programme</button>
            </form>
            </div>
    );
}

export default NewProgrammeForm;