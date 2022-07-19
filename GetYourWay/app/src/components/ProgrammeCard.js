
const ProgrammeCard = ({data, col, row}) => {

    function onClick() {
        window.location.href = data.linkTo;
    }

    return (
        // <img src={data.src} alt={data.alt} style={{height:'200px',width:'200px', padding:'5px',gridColumn:(Math.round(index%5)+1), gridRow:(Math.round(index/5)+1)}}></img>
        // <img 
        // className="progCard"
        // src={data.src} 
        // alt={data.alt} 
        // style={{height:'250px',width:'250px', padding:'5px',gridColumn:col+'/span 1', gridRow:row + '/span 1'}}
        // onClick={onClick}></img>

        <div className="card" style={{height:'300px', width: '226px', gridColumn:col+'/span 1', gridRow:row + '/span 1'}}>
            <img 
            className="progCard"
            src={data.src} 
            alt={data.alt} 
            style={{height:'225px', width:'225px', alignContent:'center'}}
            onClick={onClick}></img>
            <div className="card-body">
                <p className="card-text">{data.alt}</p>
            </div>
        </div>
    )
}

export default ProgrammeCard;