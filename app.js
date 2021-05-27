const http = require('http');
const fs = require('fs');

function responseCase(response, file) {
    fs.readFile(file, (err, data) => {
        if (err) {
            response.writeHead(404, {"Content.Type": "text/plain"});
            response.write("not found");
            response.end();
        } else {
            response.writeHead(404, {"Content.Type": "text/plain"});
            response.write(data);
            response.end();
        }
    });
}

http.createServer((request, response)=>{
    console.log(request.url);
    const file1 = request.url=='/329577'?'./WWW/329577.json': `./WWW${request.url}`;
    const file2 = request.url=='/315120'?'./WWW/315120.json': `./WWW${request.url}`;
    const file3 = request.url=='/329842'?'./WWW/329842.json': `./WWW${request.url}`;

        if (request.url=='/329577')
            responseCase(response, file1);
        else if (request.url=='/315120')
            responseCase(response, file2);
        else if (request.url=='/329842')
            responseCase(response, file3);
        

}).listen(8888);
