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
		let oneUser = new Object();
		oneUser.name = 'Joe';
		oneUser.age = 12;
		let msg = JSON.stringify(oneUser);
		$.ajax({
			url:basePath+"/firstPost2",
			type:'POST',
			data:msg,
			//dataType:'json',
			//contentType:'application/json',
			success:function(result){
				$("#myInput").val(result);
			}
		})		
	});

	$("#formButton").click(function () {
       // let msg = $("#formDemo").serialize();
		let formData = new FormData(document.getElementById("formDemo"));
        $.ajax({
            url:basePath+"/firstPostFormObj",
            type:'POST',
            data:formData,
            processData:false,
            contentType:false,
            success:function(result){
                $("#myInput").val(result);
            }
        })
    });


});

