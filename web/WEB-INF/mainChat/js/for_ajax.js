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
      loadChats(myArr,true)
    }
  }
  xmlhttp.open("GET","/chat/getchat?n=20",true);
  xmlhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  xmlhttp.send();
}

let me="admin";
let newestTime =0;

loadChats = function (arr,old=false) {
  for(i = 0; i < arr.length; i++) {
    if (arr[i].name===me && old!==true){
      console.log("发送成功");
    }
    else{
      showChatUnit(arr[i].name,arr[i].value,"default.jpg",arr[i].name===me);
    }

    console.log("!");
    if (arr[i].time>newestTime){
      newestTime=arr[i].time;
      showChatUnit("system",timestampToTime(newestTime),"default.jpg",true);
    }
  }
  redrawHTML();
  goToEnd()
}

document.onreadystatechange = function(){
  if(document.readyState==="complete")
  {
    loadXMLDoc();
    let t2 = window.setInterval("getUpdate();sendChatToServer('somebody','wwww');",3000);

  }
};

function getUpdate(){
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
  xmlhttp.open("GET","/chat/getChatByTime?timestamp="+newestTime,true);
  xmlhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  xmlhttp.send();
}

//向服务器发送数据
function sendChatToServer(name,value){
  var xmlhttp;
  if (window.XMLHttpRequest)
  {
    // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
    xmlhttp=new XMLHttpRequest();
  }
  xmlhttp.open("GET","/chat/newchat?name="+name+"&value="+value,true);
  xmlhttp.send();
}

function timestampToTime(timestamp) {
  var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
  Y = date.getFullYear() + '-';
  M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
  D = date.getDate() + ' ';
  h = date.getHours() + ':';
  m = date.getMinutes() + ':';
  s = date.getSeconds();
  return Y+M+D+h+m+s;
}

function goToEnd(){
  let a=document.querySelectorAll(".chatInner");
  a[a.length-1].scrollIntoView();
}