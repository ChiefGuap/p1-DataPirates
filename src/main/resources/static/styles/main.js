fetch("https://imdb8.p.rapidapi.com/auto-complete?q=game%20", {
    "method": "GET",
    "headers": {
        "x-rapidapi-host": "imdb8.p.rapidapi.com",
        "x-rapidapi-key": "ae22dfb14emshbb373a2396ae162p17004djsnc49b06d9ca8b"
    }
})
    .then(response => response.json())
    .then(data => {
        const list = data.d;

        list.map((item) => {
            const name = item.l;
            const poster = item.i.imageUrl;
            const movie = '<li><img src="${poster}" <h2>${name}</h2></li>'
            document.querySelector('.movies').innerHTML += movie;
        })
    })
    .catch(err => {
        console.error(err);
    });