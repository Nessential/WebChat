function loadXMLDoc()
{
  var xmlhttp;
  if (window.XMLHttpRequest)
  {
    // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
    xmlhttp=new XMLHttpRequest();
  }
  xmlhttp.onreadystatechange=function()
  {
    if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
      var myArr = JSON.parse(this.responseText);
      loadChats(myArr)
    }
  }
  xmlhttp.open("GET","/chat/getchat?n=20",true);
  xmlhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  xmlhttp.send();
}

me="admin";
loadChats = function (arr) {
  for(i = 0; i < arr.length; i++) {
    showChatUnit(arr[i].name,arr[i].value,"default.jpg",arr[i].name===me)
  }
}
document.onreadystatechange = function(){
  if(document.readyState==="complete")
  {
    loadXMLDoc();
  }
};