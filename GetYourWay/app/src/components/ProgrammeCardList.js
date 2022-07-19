import ProgrammeCard from './ProgrammeCard';

const ProgrammeCardList = ({data, COLS, ROWS}) => {
    var col = 0;
    var row = 1;

    return (
        <div className="imgContainer" style={{marginTop: '2vh', gap: '10px', gridTemplateRows:'repeat('+ROWS+',300px)', gridTemplateColumns:'repeat('+COLS+',250px)'}}>
            {data.map((element, index) => {
                col++;
                if (col > COLS) {
                    col = 1;
                    row++;
                }
                return <ProgrammeCard key={index} data={element} col={col} row={row}/>
            })}
        </div>
    )
}

export default ProgrammeCardList;