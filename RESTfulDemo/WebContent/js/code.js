$("#updBtn").click(function(){
	$.ajax({
		url: "rest/date/upd",
		type : "PUT",
		/*data: {year : "2015", month : "09", day : "29"}*/ 
		data :  { year : $("#year").val(), month : $("#month").val(), day: $("#day").val()},
		
		
		success: function(result){
			$("#updStatus").html(result);
		}
	});
});
