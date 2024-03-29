import 'mapbox-gl/dist/mapbox-gl.css';
import '../index.css';
import React, { useRef, useEffect, useState } from 'react';
import mapboxgl from '!mapbox-gl'; // eslint-disable-line import/no-webpack-loader-syntax

mapboxgl.accessToken = 'pk.eyJ1IjoicHJvamVjdHNlcmoiLCJhIjoiY2w1Y21xcTFmMDJnaDNmbXByYzQ5NTkyaiJ9.rWjkyxPSaSZd146ZxIBqZA';

const Map = () => {

  const mapContainer = useRef(null);
  const map = useRef(null);
  const [lng, setLng] = useState(-1.5491);
  const [lat, setLat] = useState(53.8008);
  const [zoom, setZoom] = useState(9);

    useEffect(() => {
      if (map.current) return; // initialize map only once
      map.current = new mapboxgl.Map({
        container: mapContainer.current,
        style: 'mapbox://styles/mapbox/streets-v11',
        center: [lng, lat],
        zoom: zoom
      });
    });

    return (
        <div>
            <div ref={mapContainer} className="map-container" />
        </div>
    )

}

export default Map;