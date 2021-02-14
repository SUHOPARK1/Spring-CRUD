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


client.detail = x => {
	
}