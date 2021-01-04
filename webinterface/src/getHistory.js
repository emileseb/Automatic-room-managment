import React, { useState, useEffect } from 'react';

export default function GetHistory(props) {
    const [temperatureHistory, setTemperatureHistory] = useState([]);

    useEffect(() => {
        // GET request using fetch inside useEffect React hook
        fetch(props.uri)
            .then(response => response.json())
            .then(data => setTemperatureHistory(data));
    });
    const listEntries = temperatureHistory.map((entry) =>  <li>{entry.entree}</li>);
    return (
        <div className="card text-center m-3">
            <div className="card-body">
                {props.name} History : <ul>{listEntries}</ul>
            </div>
        </div>
    );
}