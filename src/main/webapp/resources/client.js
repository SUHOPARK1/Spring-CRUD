var client = client || {}
client.list = x => {
	$.getJSON('/demo/client/list', d=>{
	$.each(d.list,(i, j)=>{
		console.log(j.cliNum)
		$(`<tr>
		<td>${j.cliNum}</td>
		<td><a id = '${j.cliNum}' href='#'> ${j.cliId} </a></td>
		<td>${j.name}</td>
		<td>${j.gender}</td>
		<td>${j.phoneNum}</td>
		<td>${j.regDate}</td>
		</tr>`).appendTo('#client-list')
	})
	$('#client-list tr td a').each(function(){
		$(this).click(function(){
		localStorage.setItem('cliNum',this.id)
		location.href=`/demo/move/client/detail`
		})
	})
})
} 
client.delete = x => { 
	$('#delete-btn').click(function(e){
	e.preventDefault()
    $.ajax({
		url:'/demo/client/delete',
		type:'DELETE',
		data:JSON.stringify({
			cliNum:localStorage.getItem('cliNum')
		}),
		dataType:'json',
		contentType:'application/json',
		success:
			function(d){
			if(d.message === "SUCCESS"){
				alert("고객정보를 성공적으로 삭제하셨습니다.")
				location.href=`list`
			}else{
				alert("고객정보 삭제를 실패하셨습니다.")
			}
		},
		error:function(e){
			alert("다시 입력해주세요.")
			}
    	})
    })
}


client.detail = x=>{
	$.getJSON(`localStorage.getItem('cliNum')`,d=>{
		$(`<tr>
		<td>${cliNum}</td>
		<td>${cliId}</td>
		<td>${name}</td>
		<td>${gender}</td>
		<td>${phoneNum}</td>
		<td>${regDate}</td>
		</tr>`).appendTo('#client-list')
	})
}

clent.update = x => {
	$('#update-btn').click(function(e){
	e.preventDefault()
	$.ajax({
		url:'/demo/client/update',
		type:'POST',
		data:JSON.stringify({
			cliId: $('#cliId').val(),
			name: $('#name').val(),
			gender: $('#gender').val(),
			phoneNum: $('#phoneNum').val(),
			regDate: $('#regDate').val()
		}),
		dataType:'json',
		contentType:'application/json',
		success: 
			function(d){
			console.log(d)
			if(d.message === "SUCCESS"){
				alert("고객정보를 성공적으로 등록하셨습니다.")
				location.href=`detail`
			}else{
				alert("고객정보입력를 실패하셨습니다.")
			}
		},
		error: function(e){
			alert("다시 입력해주세요.")
		}
	})
})
	
}



