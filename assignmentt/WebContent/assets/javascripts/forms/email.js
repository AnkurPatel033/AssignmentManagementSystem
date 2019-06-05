function emailValidation()
{
   
	var validateEmail=document.getElementById("email").value;
	console.log(validateEmail);
	//var warnigEmail=document.getElementById("emailWarning");
    var url="http://localhost:8071/assignmentt/email/"+validateEmail+"/";
 //   warnigEmail.innerHTML="User already exist..";
    var xmlHttp=new XMLHttpRequest();
    xmlHttp.onreadystatechange=function()
	{
		if(xmlHttp.readtState==4 && xmlHttp.status==200)
			{
			
			var id=parseInt(xmlHttp.responseText);
			if(id==1)
				{
				console.log("User Already Exist..");
				document.getElementById("emailWarning").innerHTML='User Already Exist.';
				}
			else
				{
				document.getElementById('emailWarning').innerHTML='';
				}
			
			}
		
		console.log("Ankur");
	}


	xmlHttp.open('GET',url,true);
	xmlHttp.send();
	
	
}