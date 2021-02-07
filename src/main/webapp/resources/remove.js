function elimination(){
	if(confrim("정말 삭제하시겠습니까?")==true){
		document.elimination.submit();
	}else{
		return false;
	}
}