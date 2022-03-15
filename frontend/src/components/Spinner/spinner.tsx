import { Oval } from 'react-loader-spinner';
import "./styles.css";

function Spinner() {
  return (
    <div className="center">
      <Oval 
        height="50%"
        width="50%"
        color="blue"
        ariaLabel='loading'
      />
        
    </div>
  )
}
export default Spinner;