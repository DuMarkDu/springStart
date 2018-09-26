$("document").ready(function(){	
	$("#getButton").click(function(){
		let id = $("#myInput").val();
		$.ajax({
			url:basePath+"/firstGet/"+id,
			type:'GET',
			dataType:'text',
			contentType:'application/json',
			success:function(result){
				$("#myInput").val(result);
			}
		})		
	});	
	
	$("#POSTButton").click(function(){
		let id = $("#myInput").val();
		$.ajax({
			url:basePath+"/firstPost",
			data:id,
			type:'POST',
			dataType:'text',
			contentType:'application/json',
			success:function(result){
				$("#myInput").val(result);
			}
		})		
	});	
});

