window.onload = async () => {
    try {
        const response = await fetch("http://localhost:8080/api/event/display");
        const data = await response.json();
        console.log(data);
        addRows(data);
    } catch (error) {
        console.error(error);
    }
};

function addRows(data){
    let str = "";
    let nRows = data.length;
    for (let i = 0; i < nRows; i++){
        let obj = data[i];
        str += "<tr><td>"+obj.sportName+"</td><td>"+obj.competitionName+"</td><td>"+obj.stage+
            "</td><td>"+obj.kickoffTime.slice(0,10)+" "+obj.kickoffTime.slice(11,16)+
            "</td><td>"+obj.homeTeamName+"</td><td>"+obj.homeGoals+":"+obj.awayGoals+
            "</td><td>"+obj.awayTeamName+"</td><td>"+obj.venueName+"</td></tr>";
    }
    document.getElementById("table_rows").innerHTML = str;
    document.getElementById("loading").innerHTML = "<br>";
}