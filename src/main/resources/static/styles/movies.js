fetch("https://imdb8.p.rapidapi.com/auto-complete?q=game%20", {
    "method": "GET",
    "headers": {
        "x-rapidapi-host": "imdb8.p.rapidapi.com",
        "x-rapidapi-key": "c9cd6ede56msh21fd0a650f12276p14c863jsn63127aad93fa"
    }
})
    .then(response => response.json())
    .then(data => {
        const list = data.d;

    })

    list.map((item) => {
    const name = item.l;
    const poster = item.i.imageUrl;
    const movie = `<li><img src="${poster}"><h2>${name}</h2> </li>
    document.querySelector(".movies").innerHTML += movies; 
    
})
    .catch(err => {
        console.error(err);
    });
        
