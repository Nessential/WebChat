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

let me="admin";
let newestTime =0;

loadChats = function (arr) {
  for(i = 0; i < arr.length; i++) {
    showChatUnit(arr[i].name,arr[i].value,"default.jpg",arr[i].name===me)
    if (arr[i].time>newestTime){
      newestTime=arr[i].time;

    }
  }
}

document.onreadystatechange = function(){
  if(document.readyState==="complete")
  {
    loadXMLDoc();
    let t2 = window.setInterval("getUpdate()",3000);
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
function submitForm() {
  // jquery 表单提交
  $("#form").ajaxSubmit(function(result) {
    // 对于表单提交成功后处理，result为表单正常提交后返回的内容
    if (result.status === true) {
      alert(result.msg);
    }else{
      alert(result.msg);
    }
  });
  return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
}