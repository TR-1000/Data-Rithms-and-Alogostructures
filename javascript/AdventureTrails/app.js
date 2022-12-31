const express = require('express');
const fs = require('fs');
const logger = require('morgan');


const app = express();
const PORT = process.env.PORT || 1234;

// Routers
const indexRouter = require('./routes/index');
const usersRouter = require('./routes/users');
const packageRouter = require('./routes/packages');



var createError = require('http-errors');

var path = require('path');
var cookieParser = require('cookie-parser');





// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');


// log to file
const LogStream = fs.createWriteStream(path.join(__dirname, 'access.log'), { flags: 'a' });
app.use(logger('dev', { stream: LogStream }));


//app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));


// Routes
app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/packages', packageRouter);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

console.log("Adventure Trails welcomes you!");

app.listen(PORT,() => {
  console.log("Listening on port 1234");
})


module.exports = app;
