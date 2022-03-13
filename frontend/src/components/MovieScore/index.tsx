import MovieStars from "components/MovieStars";
import './styles.css';

type Props = {
  count: number;
  score: number;
}

function MovieScore({count, score}: Props) {

  
  return (
    <div className="dsmovie-score-container">
      <p className="dsmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
      <MovieStars score={score}/>
      <p className="dsmovie-score-count">{count} avaliações</p>
    </div>
  );
}
export  default MovieScore;