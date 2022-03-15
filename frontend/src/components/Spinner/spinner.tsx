import { Oval } from 'react-loader-spinner';
import "./styles.css";

function Spinner() {
  return (
    <div className="center">
      <Oval 
        height="80%"
        width="80%"
        color="blue"
        ariaLabel='loading'
      />
        
    </div>
  )
}
export default Spinner;