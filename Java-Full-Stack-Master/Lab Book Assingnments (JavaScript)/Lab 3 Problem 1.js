var date = new Date();

var months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];

var week = ["Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday"];

document.write(week[date.getDay()]+" "+months[date.getMonth()]+" "+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()+" "+date.getFullYear());

if(date.getHours()<12)
{
	document.write("<br>Good Morning");
}	
if(date.getHours()>=12 && date.getHours()<=17)
{
	document.write("<br>Good Afternoon");
}	
if(date.getHours()>17)
{
	document.write("<br>Good Evening");
}	