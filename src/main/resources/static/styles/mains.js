fetch("https://imdb8.p.rapidapi.com/auto-complete?q=game", {
    "method": "GET",
    "headers": {
        "x-rapidapi-host": "imdb8.p.rapidapi.com",
        "x-rapidapi-key": "97198a7f65mshaa8db6ee3c091c1p105879jsn3174a1becfe9"
    }
})
    .then(response => response.json())
    .then(data =>{
        const list = data.d;

        list.map((item) =>{
            const name = item.l;
            const poster = item.i.imageUrl;
            const movie = `<li><img src="${poster}"> <h2>${name}</h2></li>`
            document.querySelector('.movies').innerHTML += movie;
        })
    })
    .catch(err => {
        console.error(err);
    });