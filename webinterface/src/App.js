import './App.css';
import GetHistory from "./getHistory";

function App() {


  return (
    <div className="App">
      <header className="App-header">
          <GetHistory name="Alarm" uri='http://localhost:8001/alarm/history'/>
          <GetHistory name="Presence" uri='http://localhost:8002/presence/history'/>
          <GetHistory name="Heater" uri='http://localhost:8004/heater/history'/>
          <GetHistory name="Thermometer" uri='http://localhost:8003/thermometer/history'/>
      </header>
    </div>
  );
}

export default App;
