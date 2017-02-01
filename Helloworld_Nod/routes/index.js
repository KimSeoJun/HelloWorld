var express = require('express');
var router = express.Router();

/* GET home page. */

/////////////////////////////////////////////
var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : 'test',
  database : 'didimdol'
});
 
connection.connect();
 router.get('/', function(req,res) {
	 connection.query('select * from student',
			 function (error, results, fields) {
		  if (error) res.send(error);
		  else res.send(JSON.stringify(results));
		});
	 	//connetction.end();

/*router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });*/
});
 router.post('/',function(req,res){ //학생정보 추가
	 connection.query('INSERT INTO posts SET ?', 
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
 
router.post('/student',function(req,res){ //학생정보 추가
	
}); 

router.put('/student',function(req,res){  //학생정보 수정
	
}); 
router.delete('/student',function(req,res){ //학생정보 삭제
	
}); 
module.exports = router;
