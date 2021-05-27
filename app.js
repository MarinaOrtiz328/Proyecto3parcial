const http = require('http');
const fs = require('fs');

function responseCase(response, file) {
    fs.readFile(file, (err, data) => {
        if (err) {
            response.writeHead(404, {"Content.Type": "text/plain"});
            response.write("not found");
        } else {
            response.writeHead(404, {"Content.Type": "text/plain"});
            response.write(data);
        }
        response.end();
    });
}

http.createServer((request, response)=>{
    console.log(request.url);
    const file329577 = request.url=='/329577'?'./WWW/329577.json': `./WWW${request.url}`;
    const file315120 = request.url=='/315120'?'./WWW/315120.json': `./WWW${request.url}`;
    const file329842 = request.url=='/329842'?'./WWW/329842.json': `./WWW${request.url}`;

    if (request.url=='/329577')
        responseCase(response, file329577);
    else if (request.url=='/315120')
        responseCase(response, file315120);
    else if (request.url=='/329842')
        responseCase(response, file329842); 

}).listen(8888);
