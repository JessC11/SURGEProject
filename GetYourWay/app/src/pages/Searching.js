import {useState, useEffect} from 'react';
import ProgrammeCard from '../components/ProgrammeCard';
import 'bootstrap/dist/css/bootstrap.min.css';
import {useMediaQuery} from 'react-responsive';
import ProgrammeCardList from '../components/ProgrammeCardList'
import Trips from '../components/Trips'

const Searching = () => {

    // static programme data
    const [data, setData] = useState([
        {
            src: "https://assets-prd.ignimgs.com/2022/01/14/gameofthrones-allseasons-sq-1642120207458.jpg",
            alt: "game of thrones: split",
            linkTo: "/destination?city=Split"
        },
        {
            src: "https://assets-prd.ignimgs.com/2022/01/14/gameofthrones-allseasons-sq-1642120207458.jpg",
            alt: "game of thrones: dubrovnik",
            linkTo: "/destination?city=Dubrovnik"
        },
        {
            src: "https://flxt.tmsimg.com/assets/p8282918_b_v13_bk.jpg",
            alt: "the walking dead: atlanta",
            linkTo: "/destination?city=Atlanta"
        },
        {
            src: "https://m.media-amazon.com/images/I/91NNuqAp73L._AC_SL1500_.jpg",
            alt: "stranger things: vilnus",
            linkTo: "/destination?city=Vilnus"
        },
        {
            src: "https://flxt.tmsimg.com/assets/p185846_b_h9_ad.jpg",
            alt: "breaking bad: new mexico",
            linkTo: "/destination?city=NewMexico"
        },
        {
            src: "https://flxt.tmsimg.com/assets/p20492218_b_h9_aa.jpg",
            alt: "squid game: daejon",
            linkTo: "/destination?city=Daejon"
        },
        {
            src: "https://m.media-amazon.com/images/M/MV5BOTdlNzdlZWQtZTU5MS00N2RkLWJjYTAtYzY5NWEwMmMyZDM1XkEyXkFqcGdeQXVyNDk3ODk4OQ@@._V1_.jpg",
            alt: "ted lasso: london",
            linkTo: "/destination?city=London"
        },
        {
            src: "https://image.tmdb.org/t/p/original//reEMJA1uzscCbkpeRJeTT2bjqUp.jpg",
            alt: "money heist: madrid",
            linkTo: "/destination?city=Madrid"
        }
    ])

    // var COLS = 5;
    // var ROWS = Math.round(data.length/COLS)+1;


    // filter images based on input text
    function filter(e) {
        let text = (e.target.value).toLowerCase();
        // get all cards in the image container grid
        var container = document.querySelector(".imgContainer");
        let cards = container.getElementsByClassName("card");
        for (let i = 0; i < cards.length; i++) {
            // get the image and test input against alt text
            let img = cards[i].getElementsByTagName("img");
            if (new RegExp(text).test(img[0].alt)) {
                cards[i].style.display = 'inline';
            } else {
                cards[i].style.display = 'none';
            }
        }
    }

    // media queries for responsiveness
    const isFiveCols = useMediaQuery({ query: '(max-width: 15450px)' })
    const isFourCols = useMediaQuery({ query: '(max-width: 1400px)' })
    const isThreeCols = useMediaQuery({ query: '(max-width: 1200px)' })
    const isTwoCols = useMediaQuery({ query: '(max-width: 850px)' })

    return (
        <div className="container">

            <div className="inputContainer">

                <input type="text" className="programmeInput" placeholder="Search for a programme..." onInput={(e) => filter(e)}></input>

                {/* display component based on the defined media queries */}
                {isFiveCols && !isFourCols && !isThreeCols && !isTwoCols && <ProgrammeCardList data={data} COLS={5} ROWS={Math.round(data.length/5)+1}/>}
                {isFiveCols && isFourCols && !isThreeCols && !isTwoCols && <ProgrammeCardList data={data} COLS={4} ROWS={Math.round(data.length/4)+1}/>}
                {isFiveCols && isFourCols && isThreeCols && !isTwoCols && <ProgrammeCardList data={data} COLS={3} ROWS={Math.round(data.length/3)+1}/>}
                {isFiveCols && isFourCols && isThreeCols && isTwoCols && <ProgrammeCardList data={data} COLS={2} ROWS={Math.round(data.length/2)+1}/>}
                
            </div>

        </div>
    )

}

export default Searching;