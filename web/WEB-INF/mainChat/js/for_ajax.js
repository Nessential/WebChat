const url="http:/1.117.237.27:8080";

function loadXMLDoc()
{
  var xmlhttp;
  xmlhttp=new XMLHttpRequest();
  xmlhttp.onreadystatechange=function() {
    if (xmlhttp.readyState==4 && xmlhttp.status==200) {
      var myArr = JSON.parse(this.responseText);
      loadChats(myArr,true)
    }
  }
  xmlhttp.open("GET",url+"/chat/getchat?n=20",true);
  xmlhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  xmlhttp.send();
}

let me=document.cookie;
let newestTime =0;
let temp_picture = null;
loadChats = function (arr,old=false) {
  for(i = 0; i < arr.length; i++) {
    if (arr[i].name===me && old!==true){
      console.log("发送成功");
    }
    else{
      getAvatarByName(arr[i].name);
      showChatUnit(arr[i].name,arr[i].value,temp_picture,arr[i].name==me);
    }

    console.log("!");
    if (arr[i].time>newestTime){
      newestTime=arr[i].time;
    }
  }
  redrawHTML();
  goToEnd()
}

function getAvatarByName(username){
  var xmlhttp;
  xmlhttp=new XMLHttpRequest();
  xmlhttp.onreadystatechange=function() {
    if (xmlhttp.readyState===4 && xmlhttp.status===200) {
      var data = JSON.parse(this.responseText);
      temp_picture = data[0].picture;
    }
  }
  xmlhttp.open("GET",url+"/get/getusers?username="+username,false);
  xmlhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  xmlhttp.send();
}

document.onreadystatechange = function(){
  if(document.readyState==="complete")
  {
    loadXMLDoc();
	me ="YukinaSor4";
    let timer = window.setInterval("getUpdate()",3000);
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
  xmlhttp.open("GET",url+"/chat/getChatByTime?timestamp="+newestTime,false);
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
  xmlhttp.open("GET",url+"/chat/newchat?name="+name+"&value="+value,true);
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