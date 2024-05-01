function convert(){
var pound=document.getElementById("dollar").value;
var result=document.getElementById("result");
if(isNaN(pound)){
    result.innerHTML="Please,Enter Number Not Text";
    return false;
}
else if(pound <0){
    result.innerHTML="Please,Enter Positive Number";
    return false;
}
else if (pound==0){
    result.innerHTML="Please,Enter Number Rather Than 0";
    return false;
}
else{
    result.innerHTML= pound *50 +"Egyption Pound";
    return false;

}
}