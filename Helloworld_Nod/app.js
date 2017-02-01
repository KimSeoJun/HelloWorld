var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');

// var index = require('./routes/index');
// var users = require('./routes/users');

var app = express();
var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : 'test',
  database : 'didimdol'
});
// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

// uncomment after placing your favicon in /public
//app.use(favicon(path.join(__dirname, 'public', 'favicon.ico')));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

// app.use('/', index);
// app.use('/users', users);

connection.connect();
app.get('/', function(req, res) {//학생목록 조회
	connection.query('select * from student',
			function(error,results, fields) {
	  if (error) res.send(error);
	  else res.send(JSON.stringify(results));
	});	 
	//connection.end();
});
app.post('/',function(req,res){ //학생정보 추가
	 connection.query('INSERT INTO student SET ?', 
			 {
		 			no			:Number(req.body.no),
		 			name		:req.body.name,
		 			gender		:req.body.gender,
		 			major		:Number(req.body.major),
		 			city		:Number(req.body.city),
		 			created_at	:new Date(),
		 			team		:Number(req.body.team) 
			 },
			 function (error, result) {
		  if (error) res.send(error);
		  else res.send(JSON.stringify(result));
		});
}); 


app.put('/student',function(req,res){  //학생정보 수정
	 connection.query('UPDATE student SET ? WHERE no=?', 
			 [{
		 			name		:req.body.name,
		 			gender		:req.body.gender,
		 			major		:Number(req.body.major),
		 			city		:Number(req.body.city),
		 			team		:Number(req.body.team) 
			 }, Number(req.body.no)],
			 function (error, result) {
		  if (error) res.send(error);
		  else res.send(JSON.stringify(result));
		});
}); 
app.delete('/student',function(req,res){ //학생정보 삭제
	connection.query('DELETE FROM student WHERE no=?', 
			 Number(req.body.no),
			 function (error, result) {
		  if (error) res.send(error);
		  else res.send(JSON.stringify(result));
		});
}); 

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
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

module.exports = app;
