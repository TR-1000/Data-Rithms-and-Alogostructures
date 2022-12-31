const http = require("http"); // import HTTP module.
const PORT = process.env.PORT || 3000;
const dbmodule = require("./DBModule");

// Use the createServer() method of the HTTP module to create a web server.
const server = http.createServer((req, res) => {
  console.log("Request URL is " + req.url);
  res.write("This is a basic web server")
  res.end();
});

server.listen(PORT, () => {
  console.log("Server is listening on port 3000");
});
