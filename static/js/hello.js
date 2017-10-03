axios
    .get('http://127.0.0.1:8080/api/hello')
    .then(response => {
        helloArray.helloArray = response.data.helloArray;
        now.now = formatDate(new Date(response.data.now));
    });

function formatDate(date) {
    return  (1900 + date.getYear()) + "-" +  (1 + date.getMonth()) + "-" + (1 + date.getDay()) + " "
        + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds()
}

var helloArray = new Vue({
    el: '#helloArray',
    data: {
        helloArray: ''
    }
});

var now = new Vue({
    el: '#now',
    data: {
        now: ''
    }
});