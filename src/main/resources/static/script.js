$('#submit').on('click', (event) => {
    $('#results').empty();
$('#result').fadeIn('slow', () => {});
let message = document.getElementById("inputtext").value;

$.ajax({
    url: document.location.origin + '/api/v1/regions',
    contentType: 'application/json',
    method: 'GET',
    success: (result) => {
    result.forEach((element) => {
        if (element.name === message) {
             $('#results').append(
                 "<h2>" + element.name + "</h2>",
                 "<p>Current Temperature: " + element.weatherInformation.temperature + " °C</p>",
                 "<p>Current Windspeed: " + element.weatherInformation.windspeed + " km/h</p>",
                 "<h1>Ticket Prices</h1>"
             );
             element.tickets.forEach(e => {
                 $('#results').append(
                    "<p>Type: " + e.ticketType + "</p>",
                    "<p>Price: " + e.price + " €</p>"
    );
             });
        }
    })
    }
})
});