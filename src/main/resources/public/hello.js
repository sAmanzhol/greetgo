$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/greeting"
    }).then(function(data, status, jqxhr) {
        $('.greeting-text').append(data.text);
        console.log(jqxhr);
    });
});